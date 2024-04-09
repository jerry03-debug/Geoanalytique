package geoanalytique.model;

/**
 * Représente un polygone dans un système de coordonnées cartésiennes.
 */
public class Polygone extends Surface {
    private Point[] points; // Les sommets du polygone

    /**
     * Constructeur pour initialiser un polygone avec un tableau de points spécifié.
     *
     * @param points Les sommets du polygone.
     */
    public Polygone(Point[] points) {
        this.points = points;
    }

    /**
     * Récupère les sommets du polygone.
     *
     * @return Les sommets du polygone.
     */
    public Point[] getPoints() {
        return points;
    }

    /**
     * Modifie les sommets du polygone.
     *
     * @param points Les nouveaux sommets du polygone.
     */
    public void setPoints(Point[] points) {
        this.points = points;
    }

    /**
     * Calcule l'aire du polygone.
     *
     * @return L'aire du polygone.
     */
    @Override
    public double calculerAire() {
    }

    /**
     * Calcule le périmètre du polygone.
     *
     * @return Le périmètre du polygone.
     */
    @Override
    public double calculerPerimetre() {
    }

    /**
     * Vérifie si un point donné appartient au polygone.
     *
     * @param p Le point à vérifier.
     * @return Vrai si le point appartient au polygone, sinon faux.
     */
    @Override
    public boolean appartient(Point p) {
    }

    /**
     * Calcule le point d'intersection entre une droite donnée et les côtés du polygone.
     *
     * @param d La droite avec laquelle l'intersection est calculée.
     * @return Le point d'intersection entre la droite et les côtés du polygone, ou null s'il n'y a pas d'intersection.
     */
    public Point intersection(Droite d) {

    }

    @Override
    public void deplacer(Point nouvellePosition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deplacer'");
    }

    @Override
    public double distance(Point p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'distance'");
    }
}
