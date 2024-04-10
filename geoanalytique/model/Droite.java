package geoanalytique.model;

/**
 * Représente une droite dans un système de coordonnées cartésiennes.
 */
public class Droite extends GeoObject {
    private Float ordonneeOrigine; // L'ordonnée à l'origine de la droite
    private Float pente; // La pente de la droite

    /**
     * Constructeur pour initialiser une droite avec une ordonnée à l'origine et une pente spécifiées.
     *
     * @param ordonneeOrigine L'ordonnée à l'origine de la droite.
     * @param pente            La pente de la droite.
     */
    public Droite(Float ordonneeOrigine, Float pente) {
        this.ordonneeOrigine = ordonneeOrigine;
        this.pente = pente;
    }

    /**
     * Récupère l'ordonnée à l'origine de la droite.
     *
     * @return L'ordonnée à l'origine de la droite.
     */
    public Float getOrdonneeOrigine() {
        return ordonneeOrigine;
    }

    /**
     * Modifie l'ordonnée à l'origine de la droite.
     *
     * @param ordonneeOrigine La nouvelle valeur de l'ordonnée à l'origine de la droite.
     */
    public void setOrdonneeOrigine(Float ordonneeOrigine) {
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
        this.ordonneeOrigine = nouvellePosition.getOrdonnee() - this.pente * nouvellePosition.getAbscisse();
    }

    /**
     * Calcule la distance entre cette droite et un point donné.
     *
     * @param p Le point à partir duquel la distance est mesurée.
     * @return La distance entre cette droite et le point donné.
     */
        @Override
        public double distance(Point p) {
            // Convertir l'équation de la droite à la forme ax + by + c = 0
            float a = -this.pente;
            float b = 1;
            float c = -this.ordonneeOrigine;

            // Calculer la distance entre le point et la droite
            return Math.abs(a * p.getAbscisse() + b * p.getOrdonnee() + c) / Math.sqrt(a * a + b * b);
        }
    /**
     * Calcule le point d'intersection entre cette droite et une autre droite donnée.
     *
     * @param d La droite avec laquelle l'intersection est calculée.
     * @return Le point d'intersection entre les deux droites, ou null si les droites sont parallèles.
     */
    public Point intersection(Droite d) {
        // Vérifier si les droites sont parallèles (Deux droites paralleles ont la meme pente)
        if (this.pente.equals(d.getPente())) {
            return null; // Les droites sont parallèles, pas d'intersection
        }
    
        /** Si deux droites ont une intersection alors il existe un point I(x,y) qui appartient aux deux droites.
        Donc en ce point les deux equations de droites sont égales : y = m1x + b1 = m2x + b2*/

        // Calculer les coordonnées du point d'intersection
        float xIntersection = (d.getOrdonneeOrigine() - this.ordonneeOrigine) / (this.pente - d.getPente());
        float yIntersection = this.pente * xIntersection + this.ordonneeOrigine;
    
        return new Point(xIntersection, yIntersection);
    }
}
