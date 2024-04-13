package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente un triangle équilatéral dans un espace géométrique.
 */
public class TriangleEquilateral extends Triangle {
    /** La longueur du côté du triangle équilatéral. */
    private double longueurCote;

    /**
     * Constructeur pour initialiser un triangle équilatéral avec ses sommets et la longueur de ses côtés.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     * @param longueurCote La longueur des côtés du triangle équilatéral.
     */
    public TriangleEquilateral(Point sommet1, Point sommet2, Point sommet3, double longueurCote) {
        super(sommet1, sommet2, sommet3);
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
