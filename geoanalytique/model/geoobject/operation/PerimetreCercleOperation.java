package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un cercle.
 */
public class PerimetreCercleOperation implements Operation {
        
        private float rayon;
    
        /**
         * Constructeur pour initialiser une opération PerimetreCercle avec son rayon.
         *
         * @param rayon Le rayon du cercle.
         */
        public PerimetreCercleOperation(float rayon) {
            this.rayon = rayon;
        }
    
        /**
         * Calcule le périmètre du cercle.
         *
         * @return Le périmètre du cercle.
         */
        @Override
        public Double calculer() {
            return 2 * Math.PI * rayon;
        }

       /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Perimetre Cercle Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 1;
}

/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 */
@Override
public void setArgument(int num, Object o) {
    if (num != 0 || !(o instanceof Float)) {
        throw new IllegalArgumentException("Invalid argument");
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
        throw new IllegalArgumentException("Invalid argument index: " + num);
    }
    return Float.class;
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