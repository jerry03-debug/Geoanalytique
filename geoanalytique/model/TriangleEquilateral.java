package geoanalytique.model;

/**
 * Représente un triangle équilatéral dans un espace géométrique.
 */
public class TriangleEquilateral extends Triangle {
    /** La longueur du côté du triangle équilatéral. */
    private double longueurCote;

    /**
     * Constructeur pour initialiser un triangle équilatéral avec ses sommets et la longueur de ses côtés.
     *
     * @param sommet1 Le premier sommet du triangle.
     * @param sommet2 Le deuxième sommet du triangle.
     * @param sommet3 Le troisième sommet du triangle.
     * @param longueurCote La longueur des côtés du triangle équilatéral.
     */
    public TriangleEquilateral(Point sommet1, Point sommet2, Point sommet3, double longueurCote) {
        super(sommet1, sommet2, sommet3);
        this.longueurCote = longueurCote;
    }

    /**
     * Calcule le périmètre du triangle équilatéral.
     *
     * @return Le périmètre du triangle équilatéral.
     */
    @Override
    public double calculerPerimetre() {
        return 3 * longueurCote;
    }

    /**
     * Calcule l'aire du triangle équilatéral.
     *
     * @return L'aire du triangle équilatéral.
     */
    @Override
    public double calculerAire() {
        return Math.sqrt(3) * Math.pow(longueurCote, 2) / 4;
    }
}
