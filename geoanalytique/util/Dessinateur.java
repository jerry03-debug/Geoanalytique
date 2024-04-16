package geoanalytique.util;

// Classe pour dessiner les objets géométriques

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

public class Dessinateur implements GeoObjectVisitor<Graphique> {

    @Override
    public Graphique visit(Point point) {
        // Créer un objet GCoordonnee pour dessiner le point
        return new GCoordonnee((int) point.getAbscisse(), (int) point.getOrdonnee());
    }

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

    @Override
    public Graphique visit(Droite droite) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

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

    @Override
    public Graphique visit(Rectangle rectangle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public Graphique visit(Cercle cercle) {
        return new GOvale(
            (int) cercle.getCentre().getAbscisse(),
            (int) cercle.getCentre().getOrdonnee(),
            (int) cercle.getRayon(),
            (int) cercle.getRayon()
        );
    }

    @Override
    public Graphique visit(Ellipse ellipse) {
        return new GOvale(
            (int) ellipse.getCentre().getAbscisse(),
            (int) ellipse.getCentre().getOrdonnee(),
            (int) ellipse.getPetitAxe(),
            (int) ellipse.getGrandAxe()
        );
    }

    @Override
    public Graphique visit(Triangle triangle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public Graphique visit(Losange losange) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public Graphique visit(Polygone polygone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public Graphique visit(Parallelogramme parallelogramme) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

}