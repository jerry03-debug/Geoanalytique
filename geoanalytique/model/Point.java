package geoanalytique.model;

/**
 * Représente un point dans un système de coordonnées cartésiennes.
 */
public class Point extends GeoObject {
    private Float abscisse; // L'abscisse (ou la coordonnée x) du point
    private Float ordonnee; // L'ordonnée (ou la coordonnée y) du point

    /**
     * Constructeur pour initialiser un point avec des coordonnées spécifiées.
     *
     * @param abscisse  L'abscisse du point.
     * @param ordonnee L'ordonnée du point.
     */
    public Point(Float abscisse, Float ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    /**
     * Récupère l'abscisse du point.
     *
     * @return L'abscisse du point.
     */
    public Float getAbscisse() {
        return abscisse;
    }

    /**
     * Modifie l'abscisse du point.
     *
     * @param abscisse La nouvelle valeur de l'abscisse du point.
     */
    public void setAbscisse(Float abscisse) {
        this.abscisse = abscisse;
    }

    /**
     * Récupère l'ordonnée du point.
     *
     * @return L'ordonnée du point.
     */
    public Float getOrdonnee() {
        return ordonnee;
    }

    /**
     * Modifie l'ordonnée du point.
     *
     * @param ordonnee La nouvelle valeur de l'ordonnée du point.
     */
    public void setOrdonnee(Float ordonnee) {
        this.ordonnee = ordonnee;
    }

    /**
     * Déplace le point à une nouvelle position donnée.
     *
     * @param nouvellePosition La nouvelle position du point.
     */
    @Override
    public void deplacer(Point nouvellePosition) {
        this.abscisse = nouvellePosition.getAbscisse();
        this.ordonnee = nouvellePosition.getOrdonnee();
    }

    /**
     * Calcule la distance entre ce point et un autre point donné.
     *
     * @param p Le point à partir duquel la distance est mesurée.
     * @return La distance entre ce point et le point donné.
     */
    @Override
    public double distance(Point p) {
        float diffX = abscisse - p.getAbscisse();
        float diffY = ordonnee - p.getOrdonnee();
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

}
