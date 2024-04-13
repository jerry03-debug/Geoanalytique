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
import geoanalytique.model.Losange;
import geoanalytique.model.Parallelogramme;

public class Dessinateur implements GeoObjectVisitor<String> {

    @Override
    public String visit(Point point) {
        // Logique pour dessiner un point
        return "Dessin d'un point aux coordonnées";
    }
    
    @Override
    public String visit(Segment segment) {
        // Logique pour dessiner un segment
        return "Dessin d'un segment ";
    }
    
    @Override
    public String visit(Droite droite) {
        // Logique pour dessiner une droite
        return "Dessin d'une droite";
    }
    

    @Override
    public String visit(Carre carre) {
        // Logique pour dessiner un carré
        return "Dessin d'un carré ";
    }

    @Override
    public String visit(Rectangle rectangle) {
        // Logique pour dessiner un rectangle
        return "Dessin d'un rectangle ";
    }

    @Override
    public String visit(Cercle cercle) {
        // Logique pour dessiner un cercle
        return "Dessin d'un cercle ";
    }

    @Override
    public String visit(Ellipse ellipse) {
        // Logique pour dessiner une ellipse
        return "Dessin d'une ellipse ";
    }

    @Override
    public String visit(Triangle triangle) {
        // Logique pour dessiner un triangle
        return "Dessin d'un triangle ";
    }

     @Override
    public String visit(Losange losange) {
        // Logique pour dessiner un losange
        return "Dessin d'un losange ";
    }

    @Override
    public String visit(Polygone polygone) {
        // Logique pour dessiner un polygone
        return "Dessin d'un polygone ";
    }

    @Override
    public String visit(Parallelogramme parallelogramme) {
        // Logique pour dessiner un parallélogramme
        return "Dessin d'un parallélogramme ";
    }
}