package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe est utilisée pour calculer l'orthocentre dans un triangle.
 */
public class OrthocentreTriangleOperation implements Operation{

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
    public OrthocentreTriangleOperation(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    /**
     * Cette méthode calcule l'orthocentre d'un triangle.
     *
     * @return Le point représentant l'orthocentre .
     */

     /**L'orthocentre d'un triangle est l'intersection des hauteurs issues des sommets du triangle. */

     @Override
     public Point calculer() {
        // Crée une instance de Calculhauteur  avec les deux points du segment
        HauteurTriangleOperation hauteur  = new HauteurTriangleOperation (point1, point2, point3);
        
        // Calcule la hauteur issue du sommet point1 et perpendiculaire au segment formé par les points point2 et point3
        Droite hauteurA = hauteur.calculer();
        
        //Calcule la hauteur issue du sommet point2 et perpendiculaire au segment formé par les points point3 et point1
        Droite hauteurB = hauteur.calculer();
    
        // Renvoie le point d'intersection des deux hauteurs, qui est l'orthocentre du triangle
        IntersectionDroiteOperation intersection = new IntersectionDroiteOperation(hauteurA, hauteurB);
        return intersection.calculer();
    }

    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Orthocentre Triangle Operation";
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