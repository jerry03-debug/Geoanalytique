package geoanalytique.model;

/**
 * Classe abstraite représentant un triangle dans un espace géométrique.
 */
public abstract class Triangle {
    /** Le premier sommet du triangle. */
    protected Point sommet1;
    /** Le deuxième sommet du triangle. */
    protected Point sommet2;
    /** Le troisième sommet du triangle. */
    protected Point sommet3;

    /**
     * Constructeur pour initialiser les sommets du triangle.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public Triangle(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Méthode abstraite pour calculer le périmètre du triangle.
     *
     * @return Le périmètre du triangle.
     */
    public abstract double calculerPerimetre();

    /**
     * Méthode abstraite pour calculer l'aire du triangle.
     *
     * @return L'aire du triangle.
     */
    public abstract double calculerAire();

    /**
     * Méthode concrète pour obtenir le premier sommet du triangle.
     *
     * @return Le premier sommet du triangle.
     */
    public Point getSommet1() {
        return sommet1;
    }

    /**
     * Méthode concrète pour obtenir le deuxième sommet du triangle.
     *
     * @return Le deuxième sommet du triangle.
     */
    public Point getSommet2() {
        return sommet2;
    }

    /**
     * Méthode concrète pour obtenir le troisième sommet du triangle.
     *
     * @return Le troisième sommet du triangle.
     */
    public Point getSommet3() {
        return sommet3;
    }
}
