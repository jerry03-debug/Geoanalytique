package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour déplacer un point vers de nouvelles coordonnées.
 */
public class DeplacerPointOperation implements Operation {
    private Point point;
    private float nouveauX;
    private float nouveauY;

    /**
     * Constructeur de l'opération de déplacement de point.
     *
     * @param point    Le point à déplacer.
     * @param nouveauX La nouvelle coordonnée X du point.
     * @param nouveauY La nouvelle coordonnée Y du point.
     */
    public DeplacerPointOperation(Point point, int nouveauX, int nouveauY) {
        this.point = point;
        this.nouveauX = nouveauX;
        this.nouveauY = nouveauY;
    }

    /**
     * Méthode pour effectuer le déplacement du point vers les nouvelles coordonnées.
     */
    @Override
    public void calculer() {
        point.setAbscisse(nouveauX);
        point.setOrdonnee(nouveauY);
    }


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
