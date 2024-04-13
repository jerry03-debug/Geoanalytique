package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer l'aire d'un carré.
 */
public class AireCarreOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;
    private Point sommet4;

    /**
     * Constructeur pour initialiser une opération AireCarre avec ses sommets.
     *
     * @param sommet1 Le premier sommet du carré.
     * @param sommet2 Le deuxième sommet du carré.
     * @param sommet3 Le troisième sommet du carré.
     * @param sommet4 Le quatrième sommet du carré.
     */
    public AireCarreOperation(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
        this.sommet4 = sommet4;
    }

    /**
     * Calcule l'aire du carré.
     *
     * @return L'aire du carré.
     */
    @Override
    public Double calculer() {
        LongueurSegmentOperation segment = new LongueurSegmentOperation(sommet1,sommet2);
        double cote = segment.calculer();
        return cote * cote;
    }

    @Override
    public String getTitle() {
        return "Calcul de l'aire d'un carré";
    }
    
    @Override
    public int getArite() {
        return 4; // Le nombre de sommets d'un carré
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
            case 3:
                this.sommet4 = (Point) o;
                break;
            default:
                throw new IllegalArgumentException("Numéro d'argument invalide");
        }
    }
    
    @Override
    public Class getClassArgument(int num) {
        if (num >= 0 && num < 4) {
            return Point.class;
        } else {
            throw new IllegalArgumentException("Numéro d'argument invalide");
        }
    }
    
}