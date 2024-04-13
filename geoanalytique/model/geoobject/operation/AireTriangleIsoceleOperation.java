package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;

/**
 * Cette classe représente une opération pour calculer l'aire d'un triangle isocèle.
 */
public class AireTriangleIsoceleOperation implements Operation {

    private AireTriangleQuelconqueOperation aireTriangleQuelconque;


    /**
     * Constructeur pour initialiser une opération AireTriangleIsocele avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public AireTriangleIsoceleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.aireTriangleQuelconque = new AireTriangleQuelconqueOperation(sommet1, sommet2, sommet3);
    }

    /**
     * Calcule l'aire du triangle isocèle.
     *
     * @return L'aire du triangle isocèle.
     */
    @Override
    public Double calculer() {

        return aireTriangleQuelconque.calculer();
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