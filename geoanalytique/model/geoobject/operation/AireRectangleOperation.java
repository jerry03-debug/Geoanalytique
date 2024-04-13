package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer l'aire d'un rectangle.
 */
public class AireRectangleOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;
    private Point sommet4;

    /**
     * Constructeur pour initialiser une opération AireRectangle avec ses sommets.
     *
     * @param sommet1 Le premier sommet du rectangle.
     * @param sommet2 Le deuxième sommet du rectangle.
     * @param sommet3 Le troisième sommet du rectangle.
     * @param sommet4 Le quatrième sommet du rectangle.
     */
    public AireRectangleOperation(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
        this.sommet4 = sommet4;
    }

    /**
     * Calcule l'aire du rectangle.
     *
     * @return L'aire du rectangle.
     */
    @Override
    public Double calculer() {
        LongueurSegmentOperation segment1 = new LongueurSegmentOperation(sommet1,sommet2);
        LongueurSegmentOperation segment2 = new LongueurSegmentOperation(sommet2,sommet3);

        double longueur = segment1.calculer();
        double largeur = segment2.calculer();

        return longueur * largeur;
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

    // Les autres méthodes non implémentées...
}