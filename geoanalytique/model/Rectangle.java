package geoanalytique.model;

/**
 * Cette classe représente un rectangle dans un espace géométrique.
 */
public class Rectangle extends Parallelogramme {

    /**
     * Constructeur pour initialiser un rectangle avec ses sommets.
     *
     * @param sommet1 Le premier sommet du rectangle.
     * @param sommet2 Le deuxième sommet du rectangle.
     * @param sommet3 Le troisième sommet du rectangle.
     * @param sommet4 Le quatrième sommet du rectangle.
     */
    public Rectangle(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        super(sommet1, sommet2, sommet3, sommet4);
    }


}