package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour trouver le milieu entre deux points.
 */
public class MilieuDeuxPointsOperation implements Operation {
    private Point point1;
    private Point point2;

    /**
     * Constructeur de l'opération de calcul du milieu entre deux points.
     *
     * @param point1 Le premier point.
     * @param point2 Le deuxième point.
     */
    public MilieuDeuxPointsOperation(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Méthode pour calculer le milieu entre les deux points spécifiés.
     *
     * @return Le point milieu.
     */
    @Override
    public Point calculer() {
        float newX = (point1.getAbscisse() + point2.getAbscisse()) / 2;
        float newY = (point1.getOrdonnee() + point2.getOrdonnee()) / 2;
        return new Point(newX, newY);
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
