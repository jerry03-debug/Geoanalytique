package model;

public class Losange extends Parallelogramme {

    // Attributs
    double diagonale1;
    double diagonale2;

    // Constructeur
    public Losange(double diagonale1, double diagonale2) {
        super(Math.sqrt(diagonale1 * diagonale1 / 4 + diagonale2 * diagonale2 / 4), // base = hypoténuse d'un triangle rectangle dont les côtés sont les demi-diagonales
              Math.sqrt(diagonale1 * diagonale1 - diagonale2 * diagonale2) / 4); // hauteur = demi-différence des diagonales
        this.diagonale1 = diagonale1;
        this.diagonale2 = diagonale2;
    }

    // Méthodes
    public double getPerimetre() {
        return 2 * Math.sqrt(diagonale1 * diagonale1 / 4 + diagonale2 * diagonale2 / 4);
    }

    
    public double getAire() {
        return diagonale1 * diagonale2 / 2;
    }

 }
