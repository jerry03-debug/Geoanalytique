package geoanalytique.model;

/**
 * Représente une droite dans un système de coordonnées cartésiennes.
 */
public class Droite extends GeoObject {
    private float ordonneeOrigine; // L'ordonnée à l'origine de la droite
    private float pente; // La pente de la droite

    /**
     * Constructeur pour initialiser une droite avec une ordonnée à l'origine et une pente spécifiées.
     *
     * @param ordonneeOrigine L'ordonnée à l'origine de la droite.
     * @param pente            La pente de la droite.
     */
    public Droite(float ordonneeOrigine, float pente) {
        this.ordonneeOrigine = ordonneeOrigine;
        this.pente = pente;
    }

    /**
     * Récupère l'ordonnée à l'origine de la droite.
     *
     * @return L'ordonnée à l'origine de la droite.
     */
    public float getOrdonneeOrigine() {
        return ordonneeOrigine;
    }

    /**
     * Modifie l'ordonnée à l'origine de la droite.
     *
     * @param ordonneeOrigine La nouvelle valeur de l'ordonnée à l'origine de la droite.
     */
    public void setOrdonneeOrigine(float ordonneeOrigine) {
        this.ordonneeOrigine = ordonneeOrigine;
    }

    /**
     * Récupère la pente de la droite.
     *
     * @return La pente de la droite.
     */
    public float getPente() {
        return pente;
    }

    /**
     * Modifie la pente de la droite.
     *
     * @param pente La nouvelle valeur de la pente de la droite.
     */
    public void setPente(float pente) {
        this.pente = pente;
    }
}
