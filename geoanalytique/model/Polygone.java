package geoanalytique.model;

/**
 * Représente un polygone dans un système de coordonnées cartésiennes.
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
}
