package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;

/**
 * Cette classe est utilisée pour calculer l'orthocentre dans un triangle.
 */
public class CalculOrthocentre implements Operation{

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
    public CalculOrthocentre(Point point1, Point point2, Point point3) {
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

     public Point calculerCentreCercleCirconscrit() {
        // Crée une instance de Calculhauteur  avec les deux points du segment
        CalculHauteur hauteur  = new CalculHauteur (point1, point2, point3);
        
        // Calcule la hauteur issue du sommet point1 et perpendiculaire au segment formé par les points point2 et point3
        Droite hauteurA = hauteur.calculerHauteur (point1, point2, point3);
        
        //Calcule la hauteur issue du sommet point2 et perpendiculaire au segment formé par les points point3 et point1
        Droite hauteurB = hauteur.calculerHauteur (point2, point3, point1);
    
        // Renvoie le point d'intersection des deux hauteurs, qui est l'orthocentre du triangle
        return hauteurA.intersection(hauteurB);
    }
}