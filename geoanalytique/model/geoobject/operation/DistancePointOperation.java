package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

public class DistancePointOperation implements Operation {
    
    private Point point1;
    private Point point2;

    public DistancePointOperation(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public Double calculer() {
        float deltaX = point2.getAbscisse() - point1.getAbscisse();
        float deltaY = point2.getOrdonnee() - point1.getOrdonnee();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
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
