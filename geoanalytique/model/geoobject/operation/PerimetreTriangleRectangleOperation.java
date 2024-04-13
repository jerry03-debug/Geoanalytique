package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un triangle rectangle.
 * Elle réutilise l'opération PerimetreTriangleQuelconque pour effectuer le calcul.
 */
public class PerimetreTriangleRectangleOperation implements Operation {

    private PerimetreTriangleQuelconqueOperation perimetreTriangleQuelconque;

    /**
     * Constructeur pour initialiser une opération PerimetreTriangleRectangle avec ses sommets.
     * Il crée une instance de PerimetreTriangleQuelconque avec les mêmes sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public PerimetreTriangleRectangleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.perimetreTriangleQuelconque = new PerimetreTriangleQuelconqueOperation(sommet1, sommet2, sommet3);
    }

    /**
     * Calcule le périmètre du triangle rectangle en utilisant l'opération PerimetreTriangleQuelconque.
     *
     * @return Le périmètre du triangle rectangle.
     */
    @Override
    public Double calculer() {
        return perimetreTriangleQuelconque.calculer();
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