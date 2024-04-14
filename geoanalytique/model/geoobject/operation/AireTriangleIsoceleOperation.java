package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;

/**
 * Cette classe représente une opération pour calculer l'aire d'un triangle isocèle.
 */
public class AireTriangleIsoceleOperation implements Operation {

    private AireTriangleQuelconqueOperation aireTriangleQuelconque;


    /**
     * Constructeur pour initialiser une opération AireTriangleIsocele avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public AireTriangleIsoceleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.aireTriangleQuelconque = new AireTriangleQuelconqueOperation(sommet1, sommet2, sommet3);
    }

    /**
     * Calcule l'aire du triangle isocèle.
     *
     * @return L'aire du triangle isocèle.
     */
    @Override
    public Double calculer() {

        return aireTriangleQuelconque.calculer();
    }

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
    @Override
public String getTitle() {
    return "Calcul de l'aire d'un triangle isocèle";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 3; // Le nombre de sommets d'un triangle isocèle
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
    aireTriangleQuelconque.setArgument(num, o);
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