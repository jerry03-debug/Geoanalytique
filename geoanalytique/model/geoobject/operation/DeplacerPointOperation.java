package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;

/**
 * Cette classe représente une opération pour déplacer un point vers de nouvelles coordonnées.
 */
public class DeplacerPointOperation implements Operation {
    private Point point;
    private int nouveauX;
    private int nouveauY;

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
    public void deplacer() {
        point.setX(nouveauX);
        point.setY(nouveauY);
    }
}
