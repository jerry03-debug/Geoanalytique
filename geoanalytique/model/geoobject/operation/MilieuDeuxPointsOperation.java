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

    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Milieu Deux Points Operation";
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
