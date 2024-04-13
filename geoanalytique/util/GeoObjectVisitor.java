package geoanalytique.util;

// Interface pour le visiteur des objets géométriques

import geoanalytique.model.Carre;
import geoanalytique.model.Cercle;
import geoanalytique.model.Ellipse;
import geoanalytique.model.Losange;
import geoanalytique.model.Parallelogramme;
import geoanalytique.model.Point;
import geoanalytique.model.Polygone;
import geoanalytique.model.Rectangle;
import geoanalytique.model.Triangle;

public interface GeoObjectVisitor<T> {

    /**
     * Visite un point.
     * 
     * @param point Le point à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Point point);

    /**
     * Visite un carré.
     * 
     * @param square Le carré à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Carre carre);

    /**
     * Visite un rectangle.
     * 
     * @param rectangle Le rectangle à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Rectangle rectangle);

    /**
     * Visite un cercle.
     * 
     * @param circle Le cercle à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Cercle cercle);

    /**
     * Visite une ellipse.
     * 
     * @param ellipse L'ellipse à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Ellipse ellipse);

    /**
     * Visite un triangle.
     * 
     * @param triangle Le triangle à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Triangle triangle);

    /**
     * Visite un losange.
     * 
     * @param losange Le losange à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Losange losange);

    /**
     * Visite un polygone.
     * 
     * @param polygone Le polygone à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Polygone polygone);

    /**
     * Visite un parallélogramme.
     * 
     * @param parallelogramme Le parallélogramme à visiter.
     * @return Le résultat de la visite.
     */
    T visit(Parallelogramme parallelogramme);

}