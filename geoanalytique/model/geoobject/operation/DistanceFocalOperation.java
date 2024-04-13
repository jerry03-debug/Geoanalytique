package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;

/**
 * Cette classe implémente l'opération de calcul de la distance focale d'une ellipse.
 * La distance focale est calculée en utilisant la formule : sqrt(grandAxe^2 - petitAxe^2)
 */
public class DistanceFocalOperation implements Operation {
            
    private double grandAxe;
    private double petitAxe;

    /**
     * Constructeur de la classe DistanceFocalOperation.
     * @param grandAxe Le grand axe de l'ellipse.
     * @param petitAxe Le petit axe de l'ellipse.
     */
    public DistanceFocalOperation(double grandAxe, double petitAxe) {
        this.grandAxe = grandAxe;
        this.petitAxe = petitAxe;
    }

    /**
     * Cette méthode calcule et retourne la distance focale de l'ellipse.
     * @return La distance focale de l'ellipse.
     */
    @Override
    public Double calculer() {
        return Math.sqrt(Math.pow(grandAxe, 2) - Math.pow(petitAxe, 2));
    }
    
    // Les autres méthodes...
 
    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Distance Focale Operation";
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
    if (!(o instanceof Double)) {
        throw new IllegalArgumentException("Argument must be a Double");
    }
    switch (num) {
        case 0:
            this.grandAxe = (Double) o;
            break;
        case 1:
            this.petitAxe = (Double) o;
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
    return Double.class;
}
    
}
