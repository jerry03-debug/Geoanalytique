package model;

public class Rectangle extends Parallelogramme {

    // Attributs
    double longueur;
    double largeur;

    // Constructeur
    public Rectangle(double longueur, double largeur) {
        super(longueur, largeur);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthodes
    public double getPerimetre() {
        return 2 * (longueur + largeur);
    }

    public double getAire() {
        return longueur * largeur;
    }

   
}
