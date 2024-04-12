package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;

/**
 * Cette classe est utilisée pour calculer le centre de gravite dans un triangle.
 */
public class CalculCentreGravite implements Operation{

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
    public CalculCentreGravite(Point point1, Point point2, Point point3) {
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

     public Point calculerCentreGravite() {
        // Crée une instance de Calculmediane  avec les deux points du segment
        CalculMediane mediane  = new CalculMediane (point1, point2, point3);
        
        // Calcule la mediane issue du sommet point1 et passant par le milieu du segment formé par les points point2 et point3
        Droite medianeA = mediane.calculerMediane (point1, point2, point3);
        
        //Calcule la mediane issue du sommet point2 et passant par le milieu du segment formé par les points point3 et point1
        Droite medianeB = mediane.calculerMediane (point2, point3, point1);
    
        // Renvoie le point d'intersection des deux medianes, qui est le centre de gravite du triangle
        return medianeA.intersection(medianeB);
    }
}