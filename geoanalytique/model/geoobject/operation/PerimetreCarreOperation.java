package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un carré.
 */
public class PerimetreCarreOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;
    private Point sommet4;

    /**
     * Constructeur pour initialiser une opération PerimetreCarre avec ses sommets.
     *
     * @param sommet1 Le premier sommet du carré.
     * @param sommet2 Le deuxième sommet du carré.
     * @param sommet3 Le troisième sommet du carré.
     * @param sommet4 Le quatrième sommet du carré.
     */
    public PerimetreCarreOperation(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
        this.sommet4 = sommet4;
    }

    /**
     * Calcule le périmètre du carré.
     *
     * @return Le périmètre du carré.
     */
    @Override
    public Double calculer() {
        LongueurSegmentOperation segment = new LongueurSegmentOperation(sommet1,sommet2);
        double cote = segment.calculer();
        return 4 * cote;
    }

    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Perimetre Carre Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 4;
}

/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 */
@Override
public void setArgument(int num, Object o) {
    if (!(o instanceof Point)) {
        throw new IllegalArgumentException("Argument must be a Point");
    }
    switch (num) {
        case 0:
            this.sommet1 = (Point) o;
            break;
        case 1:
            this.sommet2 = (Point) o;
            break;
        case 2:
            this.sommet3 = (Point) o;
            break;
        case 3:
            this.sommet4 = (Point) o;
            break;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}

/**
 * Retourne la classe de l'argument à la position spécifiée.
 * @param num La position de l'argument.
 * @return La classe de l'argument.
 */
@Override
public Class getClassArgument(int num) {
    return Point.class;
}
}