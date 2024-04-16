package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Cette classe représente un Polygone dans un espace géométrique.
 */
public class Polygone extends Surface {
    private Point[] points; // Les sommets du polygone

    /**
     * Constructeur pour initialiser un polygone avec un tableau de points spécifié.
     *
     * @param points Les sommets du polygone.
     */
    public Polygone(Point[] points) {
        this.points = points;
    }

    /**
     * Récupère les sommets du polygone.
     *
     * @return Les sommets du polygone.
     */
    public Point[] getPoints() {
        return points;
    }

    /**
     * Modifie les sommets du polygone.
     *
     * @param points Les nouveaux sommets du polygone.
     */
    public void setPoints(Point[] points) {
        this.points = points;
    }
    
    /**
     * Accepte un visiteur et lui permet de visiter cet objet géométrique.
     * 
     * @param visitor Le visiteur à accepter.
     * @return Le résultat de la visite.
     */
     @Override
    public <T> T accept(GeoObjectVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
