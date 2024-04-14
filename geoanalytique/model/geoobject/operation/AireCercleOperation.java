package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;

public class AireCercleOperation implements Operation {

    private float rayon;

    public AireCercleOperation(float rayon) {
        this.rayon = rayon;
    }

    @Override
    public Double calculer() {
        return Math.PI * Math.pow(rayon, 2);
    }

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
    @Override
public String getTitle() {
    return "Calcul de l'aire d'un cercle";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 1; // Le nombre d'arguments nécessaires pour calculer l'aire d'un cercle est 1 (le rayon)
}

/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 */
@Override
public void setArgument(int num, Object o) {
    if (num != 0) {
        throw new IllegalArgumentException("Numéro d'argument invalide");
    }
    if (!(o instanceof Float)) {
        throw new IllegalArgumentException("L'argument doit être une instance de Float");
    }
    this.rayon = (Float) o;
}


/**
 * Retourne la classe de l'argument à la position spécifiée.
 * @param num La position de l'argument.
 * @return La classe de l'argument.
 */
@Override
public Class getClassArgument(int num) {
    if (num != 0) {
        throw new IllegalArgumentException("Numéro d'argument invalide");
    }
    return Float.class;
}

}