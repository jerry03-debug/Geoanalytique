package model;

public class Carre extends Rectangle {

    // Attribut 
    double longueurCote;

    // Constructeur
    public Carre(double longueurCote) {
        super(longueurCote, longueurCote); // longueur = largeur = longueurCote
        this.longueurCote = longueurCote;
    }

    // Méthodes (héritées de Rectangle)

    // Pas besoin de redéfinir getPerimetre() et getAire() car ils sont déjà correctement implémentés dans Rectangle pour un carré (longueur = largeur)

   }
