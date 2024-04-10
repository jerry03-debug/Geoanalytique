package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;

/**
 * Cette classe est utilisée pour calculer le centre du cercle circonscrit dans un triangle.
 */
public class CalculCentreCercleCirconscrit {

    private Point point1;
    private Point point2;
    private Point point3;

    /**
     * Constructeur de la classe CalculCentreCercleCirconscrit.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     */
    public CalculCentreCercleCirconscrit(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    /**
     * Cette méthode calcule le centre du cercle  dans le triangle.
     *
     * @return Le point représentant le centre du cercle .
     */

     /**Le centre du cercle circonscrit à un triangle est l'intersection des mediatrices des côtés du triangle. */

     public Point calculerCentreCercleCirconscrit() {
        // Crée une instance de CalculMediatrice  avec les deux points du segment
        CalculMediatrice mediatrice  = new CalculMediatrice (point1, point2);
        
        // Calcule la mediatrice  du segment formé par les points point1 et point2
        Droite mediatriceA = mediatrice.calculerMediatrice (point1, point2);
        
        // Calcule la mediatrice  du segment formé par les points point2 et point3
        Droite mediatriceB = mediatrice.calculerMediatrice (point2, point3);
    
        // Renvoie le point d'intersection des deux mediatrices, qui est le centre du cercle circonscrit dans le triangle
        return mediatriceA.intersection(mediatriceB);
    }
}