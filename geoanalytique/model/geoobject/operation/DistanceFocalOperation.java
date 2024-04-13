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
