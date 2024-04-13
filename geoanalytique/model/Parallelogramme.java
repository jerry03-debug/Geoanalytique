package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Cette classe représente un parallélogramme dans un espace géométrique.
 */
public class Parallelogramme extends GeoObject {
    private Point sommet1;
    private Point sommet2;
    private Point sommet3;
    private Point sommet4;

    /**
     * Constructeur pour initialiser un parallélogramme avec ses sommets.
     *
     * @param sommet1 Le premier sommet du parallélogramme.
     * @param sommet2 Le deuxième sommet du parallélogramme.
     * @param sommet3 Le troisième sommet du parallélogramme.
     * @param sommet4 Le quatrième sommet du parallélogramme.
     */
    public Parallelogramme(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
        this.sommet4 = sommet4;
    }

    // Getters
    public Point getSommet1() {
        return this.sommet1;
    }

    public Point getSommet2() {
        return this.sommet2;
    }

    public Point getSommet3() {
        return this.sommet3;
    }

    public Point getSommet4() {
        return this.sommet4;
    }

    // Setters
    public void setSommet1(Point sommet1) {
        this.sommet1 = sommet1;
    }

    public void setSommet2(Point sommet2) {
        this.sommet2 = sommet2;
    }

    public void setSommet3(Point sommet3) {
        this.sommet3 = sommet3;
    }

    public void setSommet4(Point sommet4) {
        this.sommet4 = sommet4;
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