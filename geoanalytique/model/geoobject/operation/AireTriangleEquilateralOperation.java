
package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;

/**
 * Cette classe représente une opération pour calculer l'aire d'un triangle equilateral.
 */
public class AireTriangleEquilateralOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    /**
     * Constructeur pour initialiser une opération AireTriangleEquilateral avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public AireTriangleEquilateralOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Calcule l'aire du triangle equilateral.
     *
     * @return L'aire du triangle equilateral.
     */
    @Override
    public Double calculer() {

        DistanceAUnPointOperation cote = new DistanceAUnPointOperation(sommet1, sommet2);

        double longueurCote = cote.calculer();

        return (Math.sqrt(3) / 4) * Math.pow(longueurCote, 2);
    }
    @Override
    public String getTitle() {
        return "Calcul de l'aire d'un triangle équilatéral";
    }
    
    @Override
    public int getArite() {
        return 3; // Le nombre de sommets d'un triangle équilatéral
    }
    
    @Override
    public void setArgument(int num, Object o) {
        if (!(o instanceof Point)) {
            throw new IllegalArgumentException("L'argument doit être une instance de Point");
        }
        switch (num) {
            case 0:
                this.sommet1 = (Point) o;
                break;
            case 1:
                this.sommet2 = (Point) o;
                break;
            case 2:
                this.sommet3 = (Point) o;
                break;
            default:
                throw new IllegalArgumentException("Numéro d'argument invalide");
        }
    }
    
    @Override
    public Class getClassArgument(int num) {
        if (num >= 0 && num < 3) {
            return Point.class;
        } else {
            throw new IllegalArgumentException("Numéro d'argument invalide");
        }
    }
    
   }