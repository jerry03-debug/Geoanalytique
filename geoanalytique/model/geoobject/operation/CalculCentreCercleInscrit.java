package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;

/**
 * Cette classe est utilisée pour calculer le centre du cercle inscrit dans un triangle.
 */
public class CalculCentreCercleInscrit implements Operation{

    private Point point1;
    private Point point2;
    private Point point3;

    /**
     * Constructeur de la classe CalculCentreCercleInscrit.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     */
    public CalculCentreCercleInscrit(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    /**
     * Cette méthode calcule le centre du cercle inscrit dans le triangle.
     *
     * @return Le point représentant le centre du cercle inscrit.
     */

     /**Le centre du cercle circonscrit à un triangle est l'intersection des bissectrices des angles du triangle. */

     public Point calculerCentreCercleIscrit() {
        // Crée une instance de CalculBissectrice avec les trois points du triangle
        CalculBissectrice bissectrice = new CalculBissectrice(point1, point2, point3);
        
        // Calcule la bissectrice de l'angle au point1 (défini par les points point2, point3, point1)
        Droite bissectriceA = bissectrice.calculerBissectrice(point2, point3, point1);
        
        // Calcule la bissectrice de l'angle au point2 (défini par les points point3, point1, point2)
        Droite bissectriceB = bissectrice.calculerBissectrice(point3, point1, point2);
    
        // Renvoie le point d'intersection des deux bissectrices, qui est le centre du cercle inscrit dans le triangle
        return bissectriceA.intersection(bissectriceB);
    }
}