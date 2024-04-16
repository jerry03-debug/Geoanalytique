package geoanalytique.util;

import geoanalytique.graphique.Graphique;

// Interface pour le visiteur des objets géométriques

import geoanalytique.model.Carre;
import geoanalytique.model.Cercle;
import geoanalytique.model.Droite;
import geoanalytique.model.Ellipse;
import geoanalytique.model.Losange;
import geoanalytique.model.Parallelogramme;
import geoanalytique.model.Point;
import geoanalytique.model.Polygone;
import geoanalytique.model.Rectangle;
import geoanalytique.model.Segment;
import geoanalytique.model.Triangle;


/**
 * Cette interface définit les méthodes nécessaires pour visiter différents types d'objets géométriques
 * et générer des graphiques correspondants.
 *
 * @param <Graphique> Le type de graphique généré lors de la visite.
 */

public interface GeoObjectVisitor<Graphique> {

    /**
     * Visite un point.
     * 
     * @param point Le point à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Point point);

    /**
     * Visite un segment.
     * 
     * @param point Le segment à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Segment segment);

    /**
     * Visite une droite.
     * 
     * @param point La  droite à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Droite droite);

    /**
     * Visite un carré.
     * 
     * @param square Le carré à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Carre carre);

    /**
     * Visite un rectangle.
     * 
     * @param rectangle Le rectangle à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Rectangle rectangle);

    /**
     * Visite un cercle.
     * 
     * @param circle Le cercle à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Cercle cercle);

    /**
     * Visite une ellipse.
     * 
     * @param ellipse L'ellipse à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Ellipse ellipse);

    /**
     * Visite un triangle.
     * 
     * @param triangle Le triangle à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Triangle triangle);

    /**
     * Visite un losange.
     * 
     * @param losange Le losange à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Losange losange);

    /**
     * Visite un polygone.
     * 
     * @param polygone Le polygone à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Polygone polygone);

    /**
     * Visite un parallélogramme.
     * 
     * @param parallelogramme Le parallélogramme à visiter.
     * @return Le résultat de la visite.
     */
    Graphique visit(Parallelogramme parallelogramme);

}