package model;
import model.Point;
import model.GeoObject;

public interface Triangle extends GeoObject {

    // Retourne et définit le premier point du triangle.
    Point getSommet1();
    void setSommet1(Point sommet1);

    // Retourne et définit le deuxième point du triangle.
    Point getSommet2();
    void setSommet2(Point sommet2);

    // Retourne et définit le troisième point du triangle.
    Point getSommet3();
    void setSommet3(Point sommet3);

    // Calcule le périmètre du triangle.
    double getPerimetre();

    // Calcule l'aire du triangle.
    double getAire();

    // Détermine si un point est à l'intérieur du triangle.
    boolean estPointInterieur(Point point);

}
