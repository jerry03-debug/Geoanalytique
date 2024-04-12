<<<<<<< HEAD
package model;

public class GeoObject {
    public double a, b; {
        this.a = a;
        this.b = b;
    }
}
=======
package geoanalytique.model;

/**
 * Représente un objet géométrique abstrait dans un système de coordonnées cartésiennes.
 */
public abstract class GeoObject {

    /**
     * Déplace l'objet géométrique à une nouvelle position donnée.
     *
     * @param nouvellePosition La nouvelle position de l'objet géométrique.
     */
    public abstract void deplacer(Point nouvellePosition);

    /**
     * Calcule la distance entre cet objet géométrique et un point donné.
     *
     * @param p Le point à partir duquel la distance est mesurée.
     * @return La distance entre cet objet géométrique et le point donné.
     */
    public abstract double distance(Point p);
}
>>>>>>> 2ae3a556cc5ee744d6a8a491ef9d91e06289f932
