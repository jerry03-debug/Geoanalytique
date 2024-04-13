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

@Override
public String getTitle() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
}

@Override
public int getArite() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArite'");
}

@Override
public void setArgument(int num, Object o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setArgument'");
}

@Override
public Class getClassArgument(int num) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getClassArgument'");
}


@Override
public void changerNom(String nouveauNom) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'changerNom'");
}

}
