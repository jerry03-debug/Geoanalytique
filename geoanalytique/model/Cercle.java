package geoanalytique.model;

/**
 * Représente un cercle dans un système de coordonnées cartésiennes.
 */
public class Cercle extends Ellipse {
    private Point centre; // Centre du cercle
    private Float rayon; // Rayon du cercle

    /**
     * Constructeur pour initialiser un cercle avec son centre et son rayon spécifiés.
     *
     * @param centre Centre du cercle.
     * @param rayon  Rayon du cercle.
     */
    public Cercle(Point centre, Float rayon) {
        super(centre, rayon, rayon); // Appel au constructeur de la classe parente avec le centre et le rayon pour le petit et le grand axe
        this.centre = centre;
        this.rayon = rayon;
    }

    /**
     * Récupère le centre du cercle.
     *
     * @return Le centre du cercle.
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * Modifie le centre du cercle.
     *
     * @param centre Le nouveau centre du cercle.
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    /**
     * Récupère le rayon du cercle.
     *
     * @return Le rayon du cercle.
     */
    public Float getRayon() {
        return rayon;
    }

    /**
     * Modifie le rayon du cercle.
     *
     * @param rayon Le nouveau rayon du cercle.
     */
    public void setRayon(Float rayon) {
        this.rayon = rayon;
    }
}
