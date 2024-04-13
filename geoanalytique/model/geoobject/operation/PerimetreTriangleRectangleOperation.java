package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un triangle rectangle.
 * Elle réutilise l'opération PerimetreTriangleQuelconque pour effectuer le calcul.
 */
public class PerimetreTriangleRectangleOperation implements Operation {

    private PerimetreTriangleQuelconqueOperation perimetreTriangleQuelconque;

    /**
     * Constructeur pour initialiser une opération PerimetreTriangleRectangle avec ses sommets.
     * Il crée une instance de PerimetreTriangleQuelconque avec les mêmes sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public PerimetreTriangleRectangleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.perimetreTriangleQuelconque = new PerimetreTriangleQuelconqueOperation(sommet1, sommet2, sommet3);
    }

    /**
     * Calcule le périmètre du triangle rectangle en utilisant l'opération PerimetreTriangleQuelconque.
     *
     * @return Le périmètre du triangle rectangle.
     */
    @Override
    public Double calculer() {
        return perimetreTriangleQuelconque.calculer();
    }

    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Perimetre Triangle Rectangle Operation";
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
 */
@Override
public void setArgument(int num, Object o) {
    if (!(o instanceof Point)) {
        throw new IllegalArgumentException("Argument must be a Point");
    }
    switch (num) {
        case 0:
        case 1:
        case 2:
            this.perimetreTriangleQuelconque.setArgument(num, o);
            break;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}

/**
 * Retourne la classe de l'argument à la position spécifiée.
 * @param num La position de l'argument.
 * @return La classe de l'argument.
 */
@Override
public Class getClassArgument(int num) {
    return Point.class;
}

/**
 * Change le nom de l'opération.
 * @param nouveauNom Le nouveau nom de l'opération.
 */
@Override
public void changerNom(String nouveauNom) {
    // Cette méthode n'a pas de sens pour cette classe, car le nom de l'opération est fixe.
    throw new UnsupportedOperationException("Cannot change name of this operation");
}

}