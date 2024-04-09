package geoanalytique.model;

/**
 * Représente une ellipse dans un système de coordonnées cartésiennes.
 */
public class Ellipse extends Surface {
    private Point centre; // Centre de l'ellipse
    private Float petitAxe; // Longueur du petit axe de l'ellipse
    private Float grandAxe; // Longueur du grand axe de l'ellipse

    /**
     * Constructeur pour initialiser une ellipse avec son centre, le petit axe et le grand axe spécifiés.
     *
     * @param centre   Centre de l'ellipse.
     * @param petitAxe Longueur du petit axe de l'ellipse.
     * @param grandAxe Longueur du grand axe de l'ellipse.
     */
    public Ellipse(Point centre, Float petitAxe, Float grandAxe) {
        this.centre = centre;
        this.petitAxe = petitAxe;
        this.grandAxe = grandAxe;
    }

    /**
     * Récupère le centre de l'ellipse.
     *
     * @return Le centre de l'ellipse.
     */
    public Point getCentre() {
        return centre;
    }

    /**
     * Modifie le centre de l'ellipse.
     *
     * @param centre Le nouveau centre de l'ellipse.
     */
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    /**
     * Récupère la longueur du petit axe de l'ellipse.
     *
     * @return La longueur du petit axe de l'ellipse.
     */
    public Float getPetitAxe() {
        return petitAxe;
    }

    /**
     * Modifie la longueur du petit axe de l'ellipse.
     *
     * @param petitAxe La nouvelle longueur du petit axe de l'ellipse.
     */
    public void setPetitAxe(Float petitAxe) {
        this.petitAxe = petitAxe;
    }

    /**
     * Récupère la longueur du grand axe de l'ellipse.
     *
     * @return La longueur du grand axe de l'ellipse.
     */
    public Float getGrandAxe() {
        return grandAxe;
    }

    /**
     * Modifie la longueur du grand axe de l'ellipse.
     *
     * @param grandAxe La nouvelle longueur du grand axe de l'ellipse.
     */
    public void setGrandAxe(Float grandAxe) {
        this.grandAxe = grandAxe;
    }

    /**
     * Calcule la distance focale de l'ellipse.
     *
     * @return La distance focale de l'ellipse.
     */
    public double calculDistanceFocal() {
        // La distance focale d'une ellipse peut être calculée à l'aide de la formule mathématique sqrt(grandAxe^2 - petitAxe^2).
        return Math.sqrt(grandAxe * grandAxe - petitAxe * petitAxe);
    }

    /**
     * Calcule l'aire de l'ellipse.
     *
     * @return L'aire de l'ellipse.
     */
    @Override
    public double calculerAire() {
        // L'aire d'une ellipse peut être calculée à l'aide de la formule mathématique PI * petitAxe * grandAxe.
        return Math.PI * petitAxe * grandAxe;
    }

    /**
     * Calcule le périmètre de l'ellipse.
     *
     * @return Le périmètre de l'ellipse.
     */
    @Override
    public double calculerPerimetre() {
    }

    /**
     * Vérifie si un point donné appartient à l'ellipse.
     *
     * @param p Le point à vérifier.
     * @return Vrai si le point appartient à l'ellipse, sinon faux.
     */
    @Override
    public boolean appartient(Point p) {
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
