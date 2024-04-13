package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente un triangle rectangle dans un espace géométrique.
 */
public class TriangleRectangle extends Triangle {
    /** La longueur de la base du triangle rectangle. */
    private double longueurBase;
    /** La longueur de la hauteur du triangle rectangle. */
    private double longueurHauteur;

    /**
     * Constructeur pour initialiser un triangle rectangle avec ses sommets et les longueurs de sa base et de sa hauteur.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     * @param longueurBase La longueur de la base du triangle rectangle.
     * @param longueurHauteur La longueur de la hauteur du triangle rectangle.
     */
    public TriangleRectangle(Point sommet1, Point sommet2, Point sommet3, double longueurBase, double longueurHauteur) {
        super(sommet1, sommet2, sommet3);
        this.longueurBase = longueurBase;
        this.longueurHauteur = longueurHauteur;
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
