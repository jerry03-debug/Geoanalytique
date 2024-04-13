package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Classe CalculMediane qui implémente l'interface Operation.
 * Cette classe est utilisée pour calculer la médiatrice d'un segment défini par deux points.
 */
public class MedianeTriangleOperation implements Operation{

    // Les trois points définissant le triangle
    private Point point1;
    private Point point2;
    private Point point3;

    /**
     * Constructeur de la classe CalculMediane.
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     */
    public MedianeTriangleOperation(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    /**
     * Méthode pour calculer la médiane d'un triangle défini par les sommets point1, point2 et point3.
     * @return La droite représentant la médiane d'un angle du triangle.
     */

     /**En géométrie plane, la médiane est la droite qui relie un sommet du triangle au milieu du côté opposé.Pour calculer la médiane,
    nous devons d'abord calculer le milieu du côté opposé, puis calculer la pente de la droite passant par le sommet et le milieu du côté opposé.*/


    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }

    @Override
    public int getArite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArite'");
    }

    @Override
    public void setArgument(int num, Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setArgument'");
    }

    @Override
    public Class getClassArgument(int num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClassArgument'");
    }

    @Override
    public Droite calculer() {
        // Création d'une opération pour calculer le milieu de deux points
        MilieuDeuxPointsOperation milieuDeuxPoints = new MilieuDeuxPointsOperation(point2, point3);

        // Calcul du point milieu entre point1 et point2, le côté opposé au sommet point1
        Point milieu = milieuDeuxPoints.calculer();

        // Calculer la pente de la médiane
        float penteMediane = (milieu.getOrdonnee() - point1.getOrdonnee()) / (milieu.getAbscisse() - point1.getAbscisse());

        // Calculer l'ordonnée à l'origine de la médiane
        float ordonneeOrigineMediane = point1.getOrdonnee() - penteMediane * point1.getAbscisse();

        return new Droite(ordonneeOrigineMediane, penteMediane);
    }

    @Override
    public void changerNom(String nouveauNom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changerNom'");
    }


}