package geoanalytique.model;

/**
 * Représente une surface dans un système de coordonnées cartésiennes.
 */
public abstract class Surface extends GeoObject {

    /**
     * Calcule l'aire de la surface.
     *
     * @return L'aire de la surface.
     */
    public abstract double calculerAire();

    /**
     * Calcule le périmètre de la surface.
     *
     * @return Le périmètre de la surface.
     */
    public abstract double calculerPerimetre();

    /**
     * Vérifie si un point donné appartient à la surface.
     *
     * @param p Le point à vérifier.
     * @return Vrai si le point est à l'intérieur ou sur le bord de la surface, sinon faux.
     */
    public abstract boolean appartient(Point p);
}
