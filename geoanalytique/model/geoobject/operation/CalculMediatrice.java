package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;

/**
 * Classe CalculMediatrice qui implémente l'interface Operation.
 * Cette classe est utilisée pour calculer la médiatrice d'un segment défini par deux points.
 */
public class CalculMediatrice{

    // Les deux points définissant le segment
    private Point point1;
    private Point point2;

    /**
     * Constructeur de la classe CalculMediatrice.
     * @param point1 Le premier point du segment.
     * @param point2 Le deuxième point du segment.
     */
    public CalculMediatrice(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    /**
     * Méthode pour calculer la médiatrice du segment défini par point1 et point2.
     * @return La droite représentant la médiatrice du segment.
     */

    /**En géométrie plane, la médiatrice d'un segment est la droite perpendiculaire au segment et passant par son milieu. 
    Pour calculer la pente de la médiatrice, nous pouvons utiliser la règle qui dit que si deux droites sont perpendiculaires, le produit de leurs pentes est égal à -1.*/

    public Droite calculerMediatrice(Point point1, Point point2) {

        // Création d'une opération pour calculer le milieu de deux points
        MilieuDeuxPointsOperation milieuDeuxPoints = new MilieuDeuxPointsOperation(point1, point2);

        // Calcul du point milieu entre point1 et point2
        Point milieu = milieuDeuxPoints.milieu(point1, point2);

        // Calcul de la pente de la droite passant par point1 et point2
        float penteCote = (point2.getOrdonnee() - point1.getOrdonnee()) / (point2.getAbscisse() - point1.getAbscisse());

        // Calcul de la pente de la droite perpendiculaire à la droite passant par point1 et point2
        float penteMediatrice = -1 / penteCote;

        // Calcul de l'ordonnée à l'origine de la droite perpendiculaire passant par le point milieu
        float ordonneeOrigine = milieu.getOrdonnee() - penteMediatrice * milieu.getAbscisse();
        
        // Retour de la droite représentant la médiatrice
        return new Droite(ordonneeOrigine, penteMediatrice);
    }
}