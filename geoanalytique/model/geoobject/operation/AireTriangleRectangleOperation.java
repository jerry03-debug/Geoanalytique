package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;

/**
 * Cette classe représente une opération pour calculer l'aire d'un triangle rectangle.
 */
public class AireTriangleRectangleOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    /**
     * Constructeur pour initialiser une opération AireTriangleRectangle avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public AireTriangleRectangleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Calcule l'aire du triangle rectangle.
     *
     * @return L'aire du triangle rectangle.
     */
    @Override
    public Double calculer() {

        DistanceAUnPointOperation cote1 = new DistanceAUnPointOperation(sommet1, sommet2);
        DistanceAUnPointOperation cote2 = new DistanceAUnPointOperation(sommet2, sommet3);

        double base = cote1.calculer();
        double hauteur = cote2.calculer();

       return 0.5 * base * hauteur;
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