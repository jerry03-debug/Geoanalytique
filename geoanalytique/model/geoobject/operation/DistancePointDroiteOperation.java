package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;
import geoanalytique.model.Droite;

/**
 * Cette classe implémente l'opération de calcul de la distance entre un point et une droite.
 */
public class DistancePointDroiteOperation implements Operation {
            
    private Point point;
    private Droite droite;

    /**
     * Constructeur de la classe DistancePointDroiteOperation.
     * @param point Le point à partir duquel la distance est calculée.
     * @param droite La droite à partir de laquelle la distance est calculée.
     */
    public DistancePointDroiteOperation(Point point, Droite droite) {
        this.point = point;
        this.droite = droite;
    }

    /**
     * Calcule la distance entre le point et la droite.
     * @return La distance entre le point et la droite.
     */
    @Override
    public Double calculer() {
        float m = droite.getPente(); // pente de la droite
        float b = droite.getOrdonneeOrigine(); // ordonnée à l'origine de la droite
        float x0 = point.getAbscisse();
        float y0 = point.getOrdonnee();

        return Math.abs(y0 - m*x0 - b) / Math.sqrt(Math.pow(m, 2) + 1);
    }

    // Les autres méthodes...

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }

    @Override
    public int getArite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArite'");
    }

    @Override
    public void setArgument(int num, Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setArgument'");
    }

    @Override
    public Class getClassArgument(int num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClassArgument'");
    }

    @Override
    public void changerNom(String nouveauNom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changerNom'");
    }


    
}
