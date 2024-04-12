package geoanalytique.model;

/**
 * Représente un triangle irrégulier dans un espace géométrique.
 */
public class TriangleIrregulier extends Triangle {

    /**
     * Constructeur pour initialiser un triangle irrégulier avec ses sommets.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     */
    public TriangleIrregulier(Point sommet1, Point sommet2, Point sommet3) {
        super(sommet1, sommet2, sommet3);
    }

    // /**
    //  * Calcule le périmètre du triangle irrégulier.
    //  *
    //  * @return Le périmètre du triangle irrégulier.
    //  */
    // @Override
    // public double calculerPerimetre() {
    //     return sommet1.distance(sommet2) + sommet2.distance(sommet3) + sommet3.distance(sommet1);
    // }

    // /**
    //  * Calcule l'aire du triangle irrégulier en utilisant la formule de Héron.
    //  *
    //  * @return L'aire du triangle irrégulier.
    //  */
    // @Override
    // public double calculerAire() {
    //     // Calcul des longueurs des côtés
    //     double a = sommet1.distance(sommet2);
    //     double b = sommet2.distance(sommet3);
    //     double c = sommet3.distance(sommet1);
    //     // Calcul du demi-périmètre
    //     double s = (a + b + c) / 2;
    //     // Calcul de l'aire selon la formule de Heron
    //     double aire = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    //     return aire;
    // }
}
