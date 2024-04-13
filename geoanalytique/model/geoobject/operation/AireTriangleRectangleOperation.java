package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;
import geoanalytique.model.Point;

/**
 * Cette classe implémente l'interface Operation pour calculer l'aire d'un triangle rectangle.
 * Elle utilise trois points (sommet1, sommet2, sommet3) pour représenter les sommets du triangle.
 */
public class AireTriangleRectangleOperation implements Operation {

    private Point sommet1;
    private Point sommet2;
    private Point sommet3;

    /**
     * Constructeur pour initialiser une opération AireTriangleRectangle avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public AireTriangleRectangleOperation(Point sommet1, Point sommet2, Point sommet3) {
        this.sommet1 = sommet1;
        this.sommet2 = sommet2;
        this.sommet3 = sommet3;
    }

    /**
     * Cette méthode calcule l'aire du triangle rectangle en utilisant la formule de l'aire d'un triangle rectangle : 0.5 * base * hauteur.
     * Elle utilise la classe DistanceAUnPointOperation pour calculer la longueur des côtés du triangle.
     *
     * @return L'aire du triangle rectangle.
     */
    @Override
    public Double calculer() {

        DistanceAUnPointOperation cote1 = new DistanceAUnPointOperation(sommet1, sommet2);
        DistanceAUnPointOperation cote2 = new DistanceAUnPointOperation(sommet2, sommet3);

        double base = cote1.calculer();
        double hauteur = cote2.calculer();

       return 0.5 * base * hauteur;
    }

    /**
     * Cette méthode doit retourner le titre de l'opération, mais elle n'est pas encore implémentée.
     */
    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }

    /**
     * Cette méthode doit retourner l'arité de l'opération (le nombre d'arguments qu'elle prend), mais elle n'est pas encore implémentée.
     */
    @Override
    public int getArite() {
        throw new UnsupportedOperationException("Unimplemented method 'getArite'");
    }

    /**
     * Cette méthode doit permettre de définir un argument spécifique pour l'opération, mais elle n'est pas encore implémentée.
     */
    @Override
    public void setArgument(int num, Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'setArgument'");
    }

    /**
     * Cette méthode doit retourner la classe de l'argument spécifié, mais elle n'est pas encore implémentée.
     */
    @Override
    public Class getClassArgument(int num) {
        throw new UnsupportedOperationException("Unimplemented method 'getClassArgument'");
    }

}