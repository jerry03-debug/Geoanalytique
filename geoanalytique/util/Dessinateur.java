package geoanalytique.util;


import geoanalytique.model.Carre;
import geoanalytique.model.Cercle;
import geoanalytique.model.Droite;
import geoanalytique.model.Ellipse;
import geoanalytique.model.Point;
import geoanalytique.model.Polygone;
import geoanalytique.model.Rectangle;
import geoanalytique.model.Segment;
import geoanalytique.model.Triangle;
import geoanalytique.model.geoobject.operation.DistanceAUnPointOperation;
import geoanalytique.model.Losange;
import geoanalytique.model.Parallelogramme;
import geoanalytique.graphique.Graphique;
import geoanalytique.graphique.GCoordonnee;
import geoanalytique.graphique.GLine;
import geoanalytique.graphique.GOvale;

/**
 * Cette classe implémente l'interface GeoObjectVisitor pour créer des graphiques à partir d'objets géométriques.
 */

public class Dessinateur implements GeoObjectVisitor<Graphique> {

    /**
     * Visite un objet Point et retourne un graphique correspondant.
     * 
     * @param point Le point à visiter.
     * @return Un graphique représentant le point.
     */
    @Override
    public Graphique visit(Point point) {
        // Créer un objet GCoordonnee pour dessiner le point
        return new GCoordonnee((int) point.getAbscisse(), (int) point.getOrdonnee());
    }


    /**
     * Visite un objet Segment et retourne un graphique correspondant.
     * 
     * @param segment Le segment à visiter.
     * @return Un graphique représentant le segment.
     */
    @Override
    public Graphique visit(Segment segment) {
        // Créer un objet GLine pour dessiner le segment
        return new GLine(
            (int) segment.getPoint1().getAbscisse(),
            (int) segment.getPoint1().getOrdonnee(),
            (int) segment.getPoint2().getAbscisse(),
            (int) segment.getPoint2().getOrdonnee()
        );
    }

    /**
     * Visite un objet Droite et retourne un graphique correspondant.
     * 
     * @param droite Le droite à visiter.
     * @return Un graphique représentant le droite.
     */
    @Override
    public Graphique visit(Droite droite) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }


    /**
     * Visite un objet Carre et retourne un graphique correspondant.
     * 
     * @param carre Le carre à visiter.
     * @return Un graphique représentant le carre.
     */
    @Override
    public Graphique visit(Carre carre) {
        DistanceAUnPointOperation  distance = new DistanceAUnPointOperation(carre.getSommet1() , carre.getSommet2());
        Double cote = distance.calculer();
        Integer longueur = cote.intValue();
        return new GCoordonnee(
            (int) carre.getSommet1().getAbscisse(),
            (int) carre.getSommet1().getOrdonnee(),
            longueur,
            longueur
        );
    }

    /**
     * Visite un objet Rectangle et retourne un graphique correspondant.
     * 
     * @param rectangle Le rectangle à visiter.
     * @return Un graphique représentant le rectangle.
     */
    @Override
    public Graphique visit(Rectangle rectangle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }


    /**
     * Visite un objet Cercle et retourne un graphique correspondant.
     * 
     * @param cercle Le cercle à visiter.
     * @return Un graphique représentant le cercle.
     */
    @Override
    public Graphique visit(Cercle cercle) {
        return new GOvale(
            (int) cercle.getCentre().getAbscisse(),
            (int) cercle.getCentre().getOrdonnee(),
            (int) cercle.getRayon(),
            (int) cercle.getRayon()
        );
    }


    /**
     * Visite un objet Ellipse et retourne un graphique correspondant.
     * 
     * @param ellipse Le ellipse à visiter.
     * @return Un graphique représentant le ellipse.
     */
    @Override
    public Graphique visit(Ellipse ellipse) {
        return new GOvale(
            (int) ellipse.getCentre().getAbscisse(),
            (int) ellipse.getCentre().getOrdonnee(),
            (int) ellipse.getPetitAxe(),
            (int) ellipse.getGrandAxe()
        );
    }


    /**
     * Visite un objet Triangle et retourne un graphique correspondant.
     * 
     * @param triangle Le triangle à visiter.
     * @return Un graphique représentant le triangle.
     */
    @Override
    public Graphique visit(Triangle triangle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }


    /**
     * Visite un objet Losange et retourne un graphique correspondant.
     * 
     * @param losange Le losange à visiter.
     * @return Un graphique représentant le losange.
     */
    @Override
    public Graphique visit(Losange losange) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }


    /**
     * Visite un objet Polygone et retourne un graphique correspondant.
     * 
     * @param polygone Le polygone à visiter.
     * @return Un graphique représentant le polygone.
     */
    @Override
    public Graphique visit(Polygone polygone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }


    /**
     * Visite un objet Parallelogramme et retourne un graphique correspondant.
     * 
     * @param parallelogramme Le parallelogramme à visiter.
     * @return Un graphique représentant le parallelogramme.
     */
    @Override
    public Graphique visit(Parallelogramme parallelogramme) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

}