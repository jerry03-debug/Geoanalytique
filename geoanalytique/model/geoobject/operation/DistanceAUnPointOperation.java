package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer la distance entre un point et un autre point spécifié.
 */
public class DistanceAUnPointOperation implements Operation {
    private Point point1;
    private Point point2;

    /**
     * Constructeur de l'opération de calcul de la distance à un point.
     *
     * @param point1 Le point à partir duquel calculer la distance.
     */
    public DistanceAUnPointOperation(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Méthode pour calculer la distance entre le point spécifié dans le constructeur
     * et un autre point spécifié en paramètre.
     *
     * @param point2 Le point à partir duquel calculer la distance.
     * @return La distance entre les deux points.
     */
    @Override
    public Double calculer() {
        float deltaX = point2.getAbscisse() - point1.getAbscisse();
        float deltaY = point2.getOrdonnee() - point1.getOrdonnee();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

   /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Distance à un Point Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 2;
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
