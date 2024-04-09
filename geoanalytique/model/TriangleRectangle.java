package model;
import model.Point;

public class TriangleRectangle implements Triangle {

    private double longueurBase;
    private double longueurHauteur;

    public TriangleRectangle(double longueurBase, double longueurHauteur) {
        // Assignation des longueurs de la base et de la hauteur
        this.longueurBase = longueurBase;
        this.longueurHauteur = longueurHauteur;
    }

    // Méthode pour calculer le périmètre du triangle
    public double getPerimetre() {
        double hypotenuse = Math.sqrt(Math.pow(longueurBase, 2) + Math.pow(longueurHauteur, 2));
        double perimetre = longueurBase + longueurHauteur + hypotenuse;
        return perimetre;
    }

    // Méthode pour calculer l'aire du triangle
    public double getAire() {
        double aire = (longueurBase * longueurHauteur) / 2;
        return aire;
    }

    // Méthode pour déterminer si un point est à l'intérieur du triangle
    public boolean estPointInterieur(Point point) {
        // Utilisation de la méthode du barycentre ou autre méthode de détermination de l'intérieur
        // Pour vérifier si le point est à l'intérieur du triangle
        // Cette partie doit être implémentée
        // ...
    }

}