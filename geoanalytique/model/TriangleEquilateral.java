package model;
import model.Point;

public class TriangleEquilateral implements Triangle {

    private double longueurCote;

    public TriangleEquilateral(double longueurCote) {
        // Initialisation de l'attribut longueurCote
        this.longueurCote = longueurCote;
    }

    public double getPerimetre() {
        return 3 * longueurCote;
    }

    public double getAire() {
        return Math.sqrt(3) * Math.pow(longueurCote, 2) / 4;
    }

}
