package geoanalytique.model;

import geoanalytique.util.GeoObjectVisitor;

/**
 * Cette classe représente un Segment dans un espace géométrique.
 */
public class Segment extends Droite {
    private Point point1; // Premier point du segment
    private Point point2; // Deuxième point du segment

    /**
     * Constructeur pour initialiser un segment avec deux points spécifiés.
     *
     * @param point1 Premier point du segment.
     * @param point2 Deuxième point du segment.
     */
    public Segment(Point point1, Point point2) {
        super(point1.getOrdonnee()-calculerPente(point1, point2)*point1.getAbscisse(), calculerPente(point1, point2)); // Appel au constructeur de la classe parente avec le premier point et la pente calculée
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Calcule la pente d'une droite à partir de deux points donnés.
     *
     * @param p1 Le premier point.
     * @param p2 Le deuxième point.
     * @return La pente de la droite passant par les deux points.
     */
    private static Float calculerPente(Point p1, Point p2) {
        return (p2.getOrdonnee() - p1.getOrdonnee()) / (p2.getAbscisse() - p1.getAbscisse());
    }

    /**
     * Récupère le premier point du segment.
     *
     * @return Le premier point du segment.
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * Modifie le premier point du segment.
     *
     * @param point1 Le nouveau premier point du segment.
     */
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    /**
     * Récupère le deuxième point du segment.
     *
     * @return Le deuxième point du segment.
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * Modifie le deuxième point du segment.
     *
     * @param point2 Le nouveau deuxième point du segment.
     */
    public void setPoint2(Point point2) {
        this.point2 = point2;
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
