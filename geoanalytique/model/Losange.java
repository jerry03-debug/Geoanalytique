package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Cette classe représente un Losange dans un espace géométrique.
 */
public class Losange extends Parallelogramme {

    /**
     * Constructeur pour initialiser un losange avec ses sommets.
     *
     * @param sommet1 Le premier sommet du losange.
     * @param sommet2 Le deuxième sommet du losange.
     * @param sommet3 Le troisième sommet du losange.
     * @param sommet4 Le quatrième sommet du losange.
     */
    public Losange(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        super(sommet1, sommet2, sommet3, sommet4);
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