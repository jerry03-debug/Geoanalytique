package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;
import geoanalytique.model.Droite;

/**
 * Cette classe implémente l'opération de calcul de la distance entre un point et une droite.
 */
public class DistancePointDroiteOperation implements Operation {
            
    private Point point;
    private Droite droite;

    /**
     * Constructeur de la classe DistancePointDroiteOperation.
     * @param point Le point à partir duquel la distance est calculée.
     * @param droite La droite à partir de laquelle la distance est calculée.
     */
    public DistancePointDroiteOperation(Point point, Droite droite) {
        this.point = point;
        this.droite = droite;
    }

    /**
     * Calcule la distance entre le point et la droite.
     * @return La distance entre le point et la droite.
     */
    @Override
    public Double calculer() {
        float m = droite.getPente(); // pente de la droite
        float b = droite.getOrdonneeOrigine(); // ordonnée à l'origine de la droite
        float x0 = point.getAbscisse();
        float y0 = point.getOrdonnee();

        return Math.abs(y0 - m*x0 - b) / Math.sqrt(Math.pow(m, 2) + 1);
    }

    // Les autres méthodes...

    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Distance Point-Droite Operation";
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
    switch (num) {
        case 0:
            if (!(o instanceof Point)) {
                throw new IllegalArgumentException("First argument must be a Point");
            }
            this.point = (Point) o;
            break;
        case 1:
            if (!(o instanceof Droite)) {
                throw new IllegalArgumentException("Second argument must be a Droite");
            }
            this.droite = (Droite) o;
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
    switch (num) {
        case 0:
            return Point.class;
        case 1:
            return Droite.class;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}
}
