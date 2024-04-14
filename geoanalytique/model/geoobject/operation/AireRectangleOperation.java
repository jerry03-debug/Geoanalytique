package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer l'aire d'un rectangle.
 */
public class AireRectangleOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;
    private Point sommet4;

    /**
     * Constructeur pour initialiser une opération AireRectangle avec ses sommets.
     *
     * @param sommet1 Le premier sommet du rectangle.
     * @param sommet2 Le deuxième sommet du rectangle.
     * @param sommet3 Le troisième sommet du rectangle.
     * @param sommet4 Le quatrième sommet du rectangle.
     */
    public AireRectangleOperation(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
        this.sommet4 = sommet4;
    }

    /**
     * Calcule l'aire du rectangle.
     *
     * @return L'aire du rectangle.
     */
    @Override
    public Double calculer() {
        LongueurSegmentOperation segment1 = new LongueurSegmentOperation(sommet1,sommet2);
        LongueurSegmentOperation segment2 = new LongueurSegmentOperation(sommet2,sommet3);

        double longueur = segment1.calculer();
        double largeur = segment2.calculer();

        return longueur * largeur;
    }

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
    @Override
public String getTitle() {
    return "Calcul de l'aire d'un rectangle";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 4; // Le nombre de sommets d'un rectangle
}


/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 */
@Override
public void setArgument(int num, Object o) {
    if (!(o instanceof Point)) {
        throw new IllegalArgumentException("L'argument doit être une instance de Point");
    }
    switch (num) {
        case 0:
            this.sommet1 = (Point) o;
            break;
        case 1:
            this.sommet2 = (Point) o;
            break;
        case 2:
            this.sommet3 = (Point) o;
            break;
        case 3:
            this.sommet4 = (Point) o;
            break;
        default:
            throw new IllegalArgumentException("Numéro d'argument invalide");
    }
}


/**
 * Retourne la classe de l'argument à la position spécifiée.
 * @param num La position de l'argument.
 * @return La classe de l'argument.
 */
@Override
public Class getClassArgument(int num) {
    if (num >= 0 && num < 4) {
        return Point.class;
    } else {
        throw new IllegalArgumentException("Numéro d'argument invalide");
    }
}


}