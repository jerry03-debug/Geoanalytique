package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;

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
    public Point milieu() {
        int newX = (point1.getX() + point2.getX()) / 2;
        int newY = (point1.getY() + point2.getY()) / 2;
        return new Point(newX, newY);
    }
}
