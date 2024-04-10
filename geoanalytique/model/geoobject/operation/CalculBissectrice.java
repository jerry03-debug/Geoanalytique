package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;

public class CalculBissectrice{

// Les trois points définissant l'angle
private Point point1;
private Point point2;
private Point point3;

/**
 * Constructeur de la classe CalculCalculBissectrice
 * @param point1 Le premier point de l'angle.
 * @param point2 Le deuxième point de l'angle.
 * @param point3 Le troisième point de l'angle.
 */
public CalculBissectrice(Point point1, Point point2, Point point3) {
    this.point1 = point1;
    this.point2 = point2;
    this.point3 = point3;
}

/**
 * Méthode pour calculer la bissectrice d'un angle défini par point1, point2 et point3.
 * @return La droite représentant la bissectrice d'un angle.
 */

/**En geometrie plane, la bissectrice d'un angle est la droite qui divise l'angle en deux angles égaux.
Pour calculer la bissectrice, nous devons d'abord calculer le ratio de division de l'angle en utilisant les distances entre les points point1, point2 et point3, 
puis calculer le barycentre, qui est le point de division de la bissectrice.*/

public Droite calculerBissectrice(Point point1, Point point2, Point point3) {

    // Calcul du ratio de division de l'angle en utilisant les distances entre les points point1, point2 et point3
    float ratio = (float) Math.sqrt(point2.distance(point1) / point3.distance(point1));

    // Calcul du barycentre, qui est le point de division de la bissectrice
    Point barycentre = new Point((point2.getAbscisse() + ratio * point3.getAbscisse()) / (1 + ratio), (point2.getOrdonnee() + ratio * point3.getOrdonnee()) / (1 + ratio));

    // Calcul de la pente de la bissectrice en utilisant les coordonnées du barycentre et de point1
    float penteBissectrice = (barycentre.getOrdonnee() - point1.getOrdonnee()) / (barycentre.getAbscisse() - point1.getAbscisse());

    // Calcul de l'ordonnée à l'origine de la bissectrice en utilisant la pente et les coordonnées de point1
    float ordonneeOrigineBissectrice = point1.getOrdonnee() - penteBissectrice * point1.getAbscisse();

    return new Droite(ordonneeOrigineBissectrice, penteBissectrice);
}
}
