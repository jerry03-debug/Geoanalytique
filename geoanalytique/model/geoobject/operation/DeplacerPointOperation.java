package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour déplacer un point vers de nouvelles coordonnées.
 */
public class DeplacerPointOperation implements Operation {
    private Point point;
    private float nouveauX;
    private float nouveauY;

    /**
     * Constructeur de l'opération de déplacement de point.
     *
     * @param point    Le point à déplacer.
     * @param nouveauX La nouvelle coordonnée X du point.
     * @param nouveauY La nouvelle coordonnée Y du point.
     */
    public DeplacerPointOperation(Point point, int nouveauX, int nouveauY) {
        this.point = point;
        this.nouveauX = nouveauX;
        this.nouveauY = nouveauY;
    }

     /**
     * Méthode pour effectuer le déplacement du point vers les nouvelles coordonnées.
     */
    @Override
    public Point calculer() {
        // Effectuez le déplacement du point avec les nouvelles coordonnées
        point.setAbscisse(nouveauX);
        point.setOrdonnee(nouveauY);
        
        // Retournez le point après le déplacement
        return point;
    }

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Déplacer Point Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 3;
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
                throw new IllegalArgumentException("Argument must be a Point");
            }
            this.point = (Point) o;
            break;
        case 1:
        case 2:
            if (!(o instanceof Float)) {
                throw new IllegalArgumentException("Argument must be a Float");
            }
            if (num == 1) {
                this.nouveauX = (Float) o;
            } else {
                this.nouveauY = (Float) o;
            }
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
        case 2:
            return Float.class;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}

}
