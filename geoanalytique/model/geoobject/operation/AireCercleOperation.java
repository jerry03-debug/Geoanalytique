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

    @Override
public String getTitle() {
    return "Calcul de l'aire d'un cercle";
}

@Override
public int getArite() {
    return 1; // Le nombre d'arguments nécessaires pour calculer l'aire d'un cercle est 1 (le rayon)
}

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

@Override
public Class getClassArgument(int num) {
    if (num != 0) {
        throw new IllegalArgumentException("Numéro d'argument invalide");
    }
    return Float.class;
}

}