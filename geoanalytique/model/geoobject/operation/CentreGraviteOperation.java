package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe est utilisée pour calculer le centre de gravite dans un triangle.
 */
public class CentreGraviteOperation implements Operation{

    private Point point1;
    private Point point2;
    private Point point3;

    /**
     * Constructeur de la classe CalculCentreGravite.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     */
    public CentreGraviteOperation(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    /**
     * Cette méthode calcule le centre de gravite d'un triangle.
     *
     * @return Le point représentant le centre de gravite .
     */

     /**le centre de gravite d'un triangle est l'intersection des medianes du triangle. */

     @Override
     public Point calculer() {
        // Crée une instance de Calculmediane  avec les deux points du segment
        MedianeTriangleOperation mediane  = new MedianeTriangleOperation (point1, point2, point3);
        
        // Calcule la mediane issue du sommet point1 et passant par le milieu du segment formé par les points point2 et point3
        Droite medianeA = mediane.calculer();
        
        //Calcu issue du sommet point2 et passant par le milieu du segment formé par les points point3 et point1
        Droite medianeB = mediane.calculer();
    
        // Renvoie le point d'intersection des deux medianes, qui est le centre de gravite du triangle
        IntersectionDroiteOperation intersection = new IntersectionDroiteOperation(medianeA, medianeB );
        return intersection.calculer();
    }

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
    public void changerNom(String nouveauNom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changerNom'");
    }
}