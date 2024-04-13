package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;

public class DeplacerEllipseOperation implements Operation {
        
        private float x;
        private float y;
        
        public DeplacerEllipseOperation(float x, float y) {
            this.x = x;
            this.y = y;
        }
        
        @Override
        public Double calculer() {
            return null;
        }
        
  /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Déplacer Ellipse Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 2;
}

/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 */
@Override
public void setArgument(int num, Object o) {
    if (!(o instanceof Float)) {
        throw new IllegalArgumentException("Argument must be a Float");
    }
    switch (num) {
        case 0:
            this.x = (Float) o;
            break;
        case 1:
            this.y = (Float) o;
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
    return Float.class;
}
    
}
