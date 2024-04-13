package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

public class HauteurTriangleOperation implements Operation{

    // Les trois points définissant le triangle
private Point point1;
private Point point2;
private Point point3;

/**
 * Constructeur de la classe CalculHauteur
 * @param point1 Le premier point du triangle.
 * @param point2 Le deuxième point du triangle.
 * @param point3 Le troisième point du triangle.
 */
public HauteurTriangleOperation(Point point1, Point point2, Point point3) {
    this.point1 = point1;
    this.point2 = point2;
    this.point3 = point3;
}

/**
 * Méthode pour calculer la Hauteur d'un triangle défini par les sommets point1, point2 et point3.
 * @return La droite représentant la hauteur d'un triangle.
 */

 /** En geometrie plane, la hauteur d'un triangle est la droite perpendiculaire à un côté du triangle et passant par le sommet opposé.*/
@Override
public Droite calculer() {

    // Calculer la pente du côté (la base)
    float penteBase = (point3.getOrdonnee() - point2.getOrdonnee()) / (point3.getAbscisse() - point2.getAbscisse());

    // Calcul de la pente de la h en utilisant les coordonnées du barycentre et de point1
    float penteHauteur = -1 / penteBase;

    // Calcul de l'ordonnée à l'origine de la h en utilisant la pente et les coordonnées de point1
    float ordonneeOrigineHauteur = point1.getOrdonnee() - penteHauteur * point1.getAbscisse();

    return new Droite(ordonneeOrigineHauteur, penteHauteur);
}

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Hauteur Triangle Operation";
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

/**
 * Change le nom de l'opération.
 * @param nouveauNom Le nouveau nom de l'opération.
 */
@Override
public void changerNom(String nouveauNom) {
    // Cette méthode n'a pas de sens pour cette classe, car le nom de l'opération est fixe.
    throw new UnsupportedOperationException("Cannot change name of this operation");
}

}
