package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;

/**
 * Cette classe représente une opération pour calculer l'aire d'un triangle quelconque.
 */
public class AireTriangleQuelconqueOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    /**
     * Constructeur pour initialiser une opération AireTriangleQuelconque avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public AireTriangleQuelconqueOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Calcule l'aire du triangle quelconque.
     *
     * @return L'aire du triangle quelconque.
     */
    @Override
    public Double calculer() {

        DistanceAUnPointOperation cote1 = new DistanceAUnPointOperation(sommet1, sommet2);
        DistanceAUnPointOperation cote2 = new DistanceAUnPointOperation(sommet2, sommet3);
        DistanceAUnPointOperation cote3 = new DistanceAUnPointOperation(sommet3, sommet1);

        double a = cote1.calculer();
        double b = cote2.calculer();
        double c = cote3.calculer();

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
    @Override
public String getTitle() {
    return "Calcul de l'aire d'un triangle quelconque";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 3; // Le nombre de sommets d'un triangle quelconque
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
    if (num >= 0 && num < 3) {
        return Point.class;
    } else {
        throw new IllegalArgumentException("Numéro d'argument invalide");
    }
}

}