package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

public class PerimetreTriangleQuelconqueOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    public PerimetreTriangleQuelconqueOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    @Override
    public Double calculer() {
        LongueurSegmentOperation segment1 = new LongueurSegmentOperation(sommet1,sommet2);
        LongueurSegmentOperation segment2 = new LongueurSegmentOperation(sommet2,sommet3);
        LongueurSegmentOperation segment3 = new LongueurSegmentOperation(sommet3,sommet1);

        double cote1 = segment1.calculer();
        double cote2 = segment2.calculer();
        double cote3 = segment3.calculer();

        return cote1 + cote2 + cote3;
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