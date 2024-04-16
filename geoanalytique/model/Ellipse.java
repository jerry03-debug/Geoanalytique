package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente une ellipse dans un système de coordonnées cartésiennes.
 */
public class Ellipse extends Surface {
    private Point centre; // Centre de l'ellipse
    private float petitAxe; // Longueur du petit axe de l'ellipse
    private float grandAxe; // Longueur du grand axe de l'ellipse

    /**
     * Constructeur pour initialiser une ellipse avec son centre, le petit axe et le grand axe spécifiés.
     *
     * @param centre   Centre de l'ellipse.
     * @param petitAxe Longueur du petit axe de l'ellipse.
     * @param grandAxe Longueur du grand axe de l'ellipse.
     */
    public Ellipse(Point centre, float petitAxe, float grandAxe) {
        this.centre = centre;
        this.petitAxe = petitAxe;
        this.grandAxe = grandAxe;
    }

    /**
     * Récupère le centre de l'ellipse.
     *
     * @return Le centre de l'ellipse.
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * Modifie le centre de l'ellipse.
     *
     * @param centre Le nouveau centre de l'ellipse.
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    /**
     * Récupère la longueur du petit axe de l'ellipse.
     *
     * @return La longueur du petit axe de l'ellipse.
     */
    public float getPetitAxe() {
        return petitAxe;
    }

    /**
     * Modifie la longueur du petit axe de l'ellipse.
     *
     * @param petitAxe La nouvelle longueur du petit axe de l'ellipse.
     */
    public void setPetitAxe(float petitAxe) {
        this.petitAxe = petitAxe;
    }

    /**
     * Récupère la longueur du grand axe de l'ellipse.
     *
     * @return La longueur du grand axe de l'ellipse.
     */
    public float getGrandAxe() {
        return grandAxe;
    }

    /**
     * Modifie la longueur du grand axe de l'ellipse.
     *
     * @param grandAxe La nouvelle longueur du grand axe de l'ellipse.
     */
    public void setGrandAxe(float grandAxe) {
        this.grandAxe = grandAxe;
    }

    /**
     * Calcule la distance focale de l'ellipse.
     *
     * @return La distance focale de l'ellipse.
     */
    public double calculDistanceFocal() {
        // La distance focale d'une ellipse peut être calculée à l'aide de la formule mathématique sqrt(grandAxe^2 - petitAxe^2).
        return Math.sqrt(grandAxe * grandAxe - petitAxe * petitAxe);
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
