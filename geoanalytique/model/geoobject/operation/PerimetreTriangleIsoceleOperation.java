package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un triangle.
 */
public class PerimetreTriangleIsoceleOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    /**
     * Constructeur pour initialiser une opération PerimetreTriangle avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public PerimetreTriangleIsoceleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Calcule le périmètre du triangle.
     *
     * @return Le périmètre du triangle.
     */
    @Override
    public Double calculer() {
        
        LongueurSegmentOperation segment1 = new LongueurSegmentOperation(sommet1,sommet2);
        LongueurSegmentOperation segment2 = new LongueurSegmentOperation(sommet2,sommet3);

        double cote1 = segment1.calculer();
        double cote2 = segment2.calculer();

        return 2 * (cote1 + cote2);
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