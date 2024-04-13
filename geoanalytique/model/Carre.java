package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Cette classe représente un carré dans un espace géométrique.
 */
public class Carre extends Rectangle {

    /**
     * Constructeur pour initialiser un carré avec ses sommets.
     *
     * @param sommet1 Le premier sommet du carré.
     * @param sommet2 Le deuxième sommet du carré.
     * @param sommet3 Le troisième sommet du carré.
     * @param sommet4 Le quatrième sommet du carré.
     */
    public Carre(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
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