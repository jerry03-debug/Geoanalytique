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
