package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe est utilisée pour calculer le centre du cercle inscrit dans un triangle.
 */
public class CercleInscritOperation implements Operation{

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
    public CercleInscritOperation(Point point1, Point point2, Point point3) {
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

     public Point calculer() {
        // Crée une instance de CalculBissectrice avec les trois points du triangle
        BissectriceTriangleOperation bissectrice = new BissectriceTriangleOperation(point1, point2, point3);
        
        // Calcule la bissectrice de l'angle au point1 (défini par les points point2, point3, point1)
        Droite bissectriceA = bissectrice.calculer();
        
        // Calcule la bissectrice de l'angle au point2 (défini par les points point3, point1, point2)
        Droite bissectriceB = bissectrice.calculer();
    
        // Renvoie le point d'intersection des deux bissectrices, qui est le centre du cercle inscrit dans le triangle
        IntersectionDroiteOperation intersection = new IntersectionDroiteOperation(bissectriceA, bissectriceB );
        return intersection.calculer();
    }

   /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Cercle Inscrit Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 3;
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
        case 2:
            this.point3 = (Point) o;
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

}