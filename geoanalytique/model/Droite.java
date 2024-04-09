package geoanalytique.model;

/**
 * Représente une droite dans un système de coordonnées cartésiennes.
 */
public class Droite extends GeoObject {
    private Point ordonneeOrigine; // L'ordonnée à l'origine de la droite
    private Float pente; // La pente de la droite

    /**
     * Constructeur pour initialiser une droite avec une ordonnée à l'origine et une pente spécifiées.
     *
     * @param ordonneeOrigine L'ordonnée à l'origine de la droite.
     * @param pente            La pente de la droite.
     */
    public Droite(Point ordonneeOrigine, Float pente) {
        this.ordonneeOrigine = ordonneeOrigine;
        this.pente = pente;
    }

    /**
     * Récupère l'ordonnée à l'origine de la droite.
     *
     * @return L'ordonnée à l'origine de la droite.
     */
    public Point getOrdonneeOrigine() {
        return ordonneeOrigine;
    }

    /**
     * Modifie l'ordonnée à l'origine de la droite.
     *
     * @param ordonneeOrigine La nouvelle valeur de l'ordonnée à l'origine de la droite.
     */
    public void setOrdonneeOrigine(Point ordonneeOrigine) {
        this.ordonneeOrigine = ordonneeOrigine;
    }

    /**
     * Récupère la pente de la droite.
     *
     * @return La pente de la droite.
     */
    public Float getPente() {
        return pente;
    }

    /**
     * Modifie la pente de la droite.
     *
     * @param pente La nouvelle valeur de la pente de la droite.
     */
    public void setPente(Float pente) {
        this.pente = pente;
    }

    /**
     * Déplace la droite à une nouvelle position donnée.
     *
     * @param nouvellePosition La nouvelle position de la droite.
     */
    @Override
    public void deplacer(Point nouvellePosition) {
        this.ordonneeOrigine = nouvellePosition;
    }

    /**
     * Calcule la distance entre cette droite et un point donné.
     *
     * @param p Le point à partir duquel la distance est mesurée.
     * @return La distance entre cette droite et le point donné.
     */
    @Override
    public double distance(Point p) {
        // Calcul de la distance entre un point et une droite
    }

    /**
     * Calcule le point d'intersection entre cette droite et une autre droite donnée.
     *
     * @param d La droite avec laquelle l'intersection est calculée.
     * @return Le point d'intersection entre les deux droites, ou null si les droites sont parallèles.
     */
    public Point intersection(Droite d) {
    }
}
