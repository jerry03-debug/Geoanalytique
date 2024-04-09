package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;

/**
 * Cette classe représente une opération pour calculer la distance entre un point et un autre point spécifié.
 */
public class DistanceAUnPointOperation implements Operation {
    private Point point1;

    /**
     * Constructeur de l'opération de calcul de la distance à un point.
     *
     * @param point1 Le point à partir duquel calculer la distance.
     */
    public DistanceAUnPointOperation(Point point1) {
        this.point1 = point1;
    }

    /**
     * Méthode pour calculer la distance entre le point spécifié dans le constructeur
     * et un autre point spécifié en paramètre.
     *
     * @param otherPoint Le point à partir duquel calculer la distance.
     * @return La distance entre les deux points.
     */
    public double distanceAUnPoint(Point otherPoint) {
        int deltaX = otherPoint.getX() - point1.getX();
        int deltaY = otherPoint.getY() - point1.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
