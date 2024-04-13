package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un losange.
 */
public class PerimetreLosangeOperation implements Operation {

   private PerimetreCarreOperation perimetreCarre;
    /**
     * Constructeur pour initialiser une opération PerimetreCarre avec ses sommets.
     * Il crée une instance de PerimetreCarre avec les mêmes sommets.
     *
     * @param sommet1 Le premier sommet du Carre.
     * @param sommet2 Le deuxième sommet du Carre.
     * @param sommet3 Le troisième sommet du Carre.
     * @param sommet4 Le quatrième sommet du Carre.
     */
    public PerimetreLosangeOperation(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        this.perimetreCarre = new PerimetreCarreOperation(sommet1, sommet2, sommet3, sommet4);
    }

    /**
     * Calcule le périmètre du Carre rectangle en utilisant l'opération PerimetreCarreQuelconque.
     *
     * @return Le périmètre du Carre rectangle.
     */
    @Override
    public Double calculer() {
        return perimetreCarre.calculer();
    }

    // Les autres méthodes non implémentées...
    
    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Perimetre Losange Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 4;
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
            this.perimetreCarre.setArgument(0, o);
            break;
        case 1:
            this.perimetreCarre.setArgument(1, o);
            break;
        case 2:
            this.perimetreCarre.setArgument(2, o);
            break;
        case 3:
            this.perimetreCarre.setArgument(3, o);
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
