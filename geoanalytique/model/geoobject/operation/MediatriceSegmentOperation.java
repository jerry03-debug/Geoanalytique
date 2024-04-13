package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Classe CalculMediatrice qui implémente l'interface Operation.
 * Cette classe est utilisée pour calculer la médiatrice d'un segment défini par deux points.
 */
public class MediatriceSegmentOperation implements Operation{

    // Les deux points définissant le segment
    private Point point1;
    private Point point2;

    /**
     * Constructeur de la classe CalculMediatrice.
     * @param point1 Le premier point du segment.
     * @param point2 Le deuxième point du segment.
     */
    public MediatriceSegmentOperation(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Méthode pour calculer la médiatrice du segment défini par point1 et point2.
     * @return La droite représentant la médiatrice du segment.
     */

    /**En géométrie plane, la médiatrice d'un segment est la droite perpendiculaire au segment et passant par son milieu. 
    Pour calculer la pente de la médiatrice, nous pouvons utiliser la règle qui dit que si deux droites sont perpendiculaires, le produit de leurs pentes est égal à -1.*/
    @Override
    public Droite calculer() {

        // Création d'une opération pour calculer le milieu de deux points
        MilieuDeuxPointsOperation milieuDeuxPoints = new MilieuDeuxPointsOperation(point1, point2);

        // Calcul du point milieu entre point1 et point2
        Point milieu = milieuDeuxPoints.calculer();

        // Calcul de la pente de la droite passant par point1 et point2
        float penteCote = (point2.getOrdonnee() - point1.getOrdonnee()) / (point2.getAbscisse() - point1.getAbscisse());

        // Calcul de la pente de la droite perpendiculaire à la droite passant par point1 et point2
        float penteMediatrice = -1 / penteCote;

        // Calcul de l'ordonnée à l'origine de la droite perpendiculaire passant par le point milieu
        float ordonneeOrigine = milieu.getOrdonnee() - penteMediatrice * milieu.getAbscisse();
        
        // Retour de la droite représentant la médiatrice
        return new Droite(ordonneeOrigine, penteMediatrice);
    }

    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Mediatrice Segment Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 2;
}

/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 */
@Override
public void setArgument(int num, Object o) {
    if (!(o instanceof Point)) {
        throw new IllegalArgumentException("Argument must be a Point");
    }
    switch (num) {
        case 0:
            this.point1 = (Point) o;
            break;
        case 1:
            this.point2 = (Point) o;
            break;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}

/**
 * Retourne la classe de l'argument à la position spécifiée.
 * @param num La position de l'argument.
 * @return La classe de l'argument.
 */
@Override
public Class getClassArgument(int num) {
    return Point.class;
}

/**
 * Change le nom de l'opération.
 * @param nouveauNom Le nouveau nom de l'opération.
 */
@Override
public void changerNom(String nouveauNom) {
    // Cette méthode n'a pas de sens pour cette classe, car le nom de l'opération est fixe.
    throw new UnsupportedOperationException("Cannot change name of this operation");
}
}