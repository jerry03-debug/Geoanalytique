package model;
import model.Point;

public class TriangleIrregulier implements Triangle {

    // Attributs pour les sommets du triangle
    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    public TriangleIrregulier(Point sommet1, Point sommet2, Point sommet3) {
        // Assignation des sommets
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    public double getPerimetre() {
        // Calcul des distances entre les sommets et sommation
        double perimetre = sommet1.distance(sommet2) + sommet2.distance(sommet3) + sommet3.distance(sommet1);
        return perimetre;
    }

    // Méthode de Héron pour calculer l'aire du triangle 
    public double getAire() {
        // Calcul des longueurs des côtés
        double a = sommet1.distance(sommet2);
        double b = sommet2.distance(sommet3);
        double c = sommet3.distance(sommet1);
        // Calcul du semi-périmètre
        double s = (a + b + c) / 2;
        // Calcul de l'aire selon la formule de Héron
        double aire = Math.sqrt(s * (s - a) * (s - b) * (s - c));
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