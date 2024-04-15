package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Représente un objet géométrique abstrait dans un système de coordonnées cartésiennes.
 */
public abstract class GeoObject {
    /**
     * Accepte un visiteur et lui permet de visiter cet objet géométrique.
     * 
     * @param visitor Le visiteur à accepter.
     * @return Le résultat de la visite.
     */
    <T> T accept(GeoObjectVisitor<T> visitor);
}
