package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente un point dans un système de coordonnées cartésiennes.
 */
public class Point extends GeoObject {
    private float abscisse; // L'abscisse (ou la coordonnée x) du point
    private float ordonnee; // L'ordonnée (ou la coordonnée y) du point

    /**
     * Constructeur pour initialiser un point avec des coordonnées spécifiées.
     *
     * @param abscisse  L'abscisse du point.
     * @param ordonnee L'ordonnée du point.
     */
    public Point(float abscisse, float ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    /**
     * Récupère l'abscisse du point.
     *
     * @return L'abscisse du point.
     */
    public float getAbscisse() {
        return abscisse;
    }

    /**
     * Modifie l'abscisse du point.
     *
     * @param abscisse La nouvelle valeur de l'abscisse du point.
     */
    public void setAbscisse(float abscisse) {
        this.abscisse = abscisse;
    }

    /**
     * Récupère l'ordonnée du point.
     *
     * @return L'ordonnée du point.
     */
    public float getOrdonnee() {
        return ordonnee;
    }

    /**
     * Modifie l'ordonnée du point.
     *
     * @param ordonnee La nouvelle valeur de l'ordonnée du point.
     */
    public void setOrdonnee(float ordonnee) {
        this.ordonnee = ordonnee;
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
