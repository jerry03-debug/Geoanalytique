package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

public class BissectriceTriangleOperation implements Operation{

// Les trois points définissant l'angle
private Point point1;
private Point point2;
private Point point3;

/**
 * Constructeur de la classe CalculBissectriceTriangleOperation
 * @param point1 Le premier point de l'angle.
 * @param point2 Le deuxième point de l'angle.
 * @param point3 Le troisième point de l'angle.
 */
public BissectriceTriangleOperation(Point point1, Point point2, Point point3) {
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

@Override
public Droite calculer() {

    DistanceAUnPointOperation distance1 = new DistanceAUnPointOperation(point1, point2);
    DistanceAUnPointOperation distance2 = new DistanceAUnPointOperation(point1, point3);
    double ab = distance1.calculer();
    double ac = distance2.calculer();

    // Calcul du ratio de division de l'angle en utilisant les distances entre les points point1, point2 et point3
    float ratio = (float) Math.sqrt(ab / ac);

    // Calcul du barycentre, qui est le point de division de la bissectrice
    Point barycentre = new Point((point2.getAbscisse() + ratio * point3.getAbscisse()) / (1 + ratio), (point2.getOrdonnee() + ratio * point3.getOrdonnee()) / (1 + ratio));

    // Calcul de la pente de la bissectrice en utilisant les coordonnées du barycentre et de point1
    float penteBissectrice = (barycentre.getOrdonnee() - point1.getOrdonnee()) / (barycentre.getAbscisse() - point1.getAbscisse());

    // Calcul de l'ordonnée à l'origine de la bissectrice en utilisant la pente et les coordonnées de point1
    float ordonneeOrigineBissectrice = point1.getOrdonnee() - penteBissectrice * point1.getAbscisse();

    return new Droite(ordonneeOrigineBissectrice, penteBissectrice);
}

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Bissectrice Triangle Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 3;
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
            this.point1 = (Point) o;
            break;
        case 1:
            this.point2 = (Point) o;
            break;
        case 2:
            this.point3 = (Point) o;
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
