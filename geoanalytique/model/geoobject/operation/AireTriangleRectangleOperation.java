package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;

/**
 * Cette classe implémente l'interface Operation pour calculer l'aire d'un triangle rectangle.
 * Elle utilise trois points (sommet1, sommet2, sommet3) pour représenter les sommets du triangle.
 */
public class AireTriangleRectangleOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    /**
     * Constructeur pour initialiser une opération AireTriangleRectangle avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public AireTriangleRectangleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Cette méthode calcule l'aire du triangle rectangle en utilisant la formule de l'aire d'un triangle rectangle : 0.5 * base * hauteur.
     * Elle utilise la classe DistanceAUnPointOperation pour calculer la longueur des côtés du triangle.
     *
     * @return L'aire du triangle rectangle.
     */
    @Override
    public Double calculer() {

        DistanceAUnPointOperation cote1 = new DistanceAUnPointOperation(sommet1, sommet2);
        DistanceAUnPointOperation cote2 = new DistanceAUnPointOperation(sommet2, sommet3);

        double base = cote1.calculer();
        double hauteur = cote2.calculer();

       return 0.5 * base * hauteur;
    }

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Aire Triangle Rectangle Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 3;
}

/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 * @throws IllegalArgumentException si l'argument n'est pas une instance de Point ou si l'index est invalide.
 */
@Override
public void setArgument(int num, Object o) {
    if (!(o instanceof Point)) {
        throw new IllegalArgumentException("Argument must be a Point");
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
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}

/**
 * Retourne la classe de l'argument à la position spécifiée.
 * @param num La position de l'argument.
 * @return La classe de l'argument.
 * @throws IllegalArgumentException si l'index est invalide.
 */
@Override
public Class getClassArgument(int num) {
    switch (num) {
        case 0:
        case 1:
        case 2:
            return Point.class;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}
}