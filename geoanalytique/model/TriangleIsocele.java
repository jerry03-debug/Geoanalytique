package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente un triangle isocèle dans un espace géométrique.
 */
public class TriangleIsocele extends Triangle {
    /** La longueur de la base du triangle isocèle. */
    private double longueurBase;
    /** La longueur des côtés égaux du triangle isocèle. */
    private double longueurCote;

    /**
     * Constructeur pour initialiser un triangle isocèle avec ses sommets et les longueurs de sa base et de ses côtés.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     * @param longueurBase La longueur de la base du triangle isocèle.
     * @param longueurCote La longueur des côtés égaux du triangle isocèle.
     */
    public TriangleIsocele(Point sommet1, Point sommet2, Point sommet3, double longueurBase, double longueurCote) {
        super(sommet1, sommet2, sommet3);
        this.longueurBase = longueurBase;
        this.longueurCote = longueurCote;
    }

    // /**
    //  * Calcule le périmètre du triangle isocèle.
    //  *
    //  * @return Le périmètre du triangle isocèle.
    //  */
    // @Override
    // public double calculerPerimetre() {
    //     double perimetre = 2 * longueurCote + longueurBase;
    //     return perimetre;
    // }

    // /**
    //  * Calcule l'aire du triangle isocèle.
    //  *
    //  * @return L'aire du triangle isocèle.
    //  */
    // @Override
    // public double calculerAire() {
    //     // Calcul de la hauteur du triangle à partir de la base et des côtés égaux
    //     double hauteur = Math.sqrt(Math.pow(longueurCote, 2) - Math.pow(longueurBase / 2, 2));
    //     // Calcul de l'aire en utilisant la formule (base * hauteur) / 2
    //     double aire = (longueurBase * hauteur) / 2;
    //     return aire;
    // }

    /**
     * Accepte un visiteur et lui permet de visiter cet objet géométrique.
     * 
     * @param visitor Le visiteur à accepter.
     * @return Le résultat de la visite.
     */
     @Override
    public <T> T accept(GeoObjectVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
