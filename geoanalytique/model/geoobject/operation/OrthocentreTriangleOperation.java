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