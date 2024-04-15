package geoanalytique.model;

/**
 * Représente une zone de dessin virtuel pour convertir les coordonnées réelles en coordonnées de la Vue.
 */
public class ViewPort {
    private double minX, minY, maxX, maxY; // Les limites du repère réel
    private int width, height; // Les dimensions de la Vue (en pixels)

    /**
     * Constructeur pour initialiser les limites du repère réel et les dimensions de la Vue.
     * 
     * @param minX   La valeur minimale sur l'axe des x du repère réel.
     * @param minY   La valeur minimale sur l'axe des y du repère réel.
     * @param maxX   La valeur maximale sur l'axe des x du repère réel.
     * @param maxY   La valeur maximale sur l'axe des y du repère réel.
     * @param width  La largeur de la Vue en pixels.
     * @param height La hauteur de la Vue en pixels.
     */
    public ViewPort(double minX, double minY, double maxX, double maxY, int width, int height) {
        this.minX = minX;
        this.minY = minY;
        this.maxX = maxX;
        this.maxY = maxY;
        this.width = width;
        this.height = height;
    }

    /**
     * Convertit une coordonnée réelle en coordonnée de la Vue sur l'axe des x.
     * 
     * @param x La coordonnée réelle sur l'axe des x.
     * @return La coordonnée correspondante sur l'axe des x de la Vue.
     */
    public int convertX(double x) {
        return (int) ((x - minX) / (maxX - minX) * width);
    }

    /**
     * Convertit une coordonnée réelle en coordonnée de la Vue sur l'axe des y.
     * 
     * @param y La coordonnée réelle sur l'axe des y.
     * @return La coordonnée correspondante sur l'axe des y de la Vue.
     */
    public int convertY(double y) {
        return (int) ((maxY - y) / (maxY - minY) * height);
    }

    /**
     * Convertit une coordonnée de la Vue en coordonnée réelle sur l'axe des x.
     * 
     * @param x La coordonnée sur l'axe des x de la Vue.
     * @return La coordonnée réelle correspondante sur l'axe des x.
     */
    public double convertXInverse(int x) {
        return x * (maxX - minX) / width + minX;
    }

    /**
     * Convertit une coordonnée de la Vue en coordonnée réelle sur l'axe des y.
     * 
     * @param y La coordonnée sur l'axe des y de la Vue.
     * @return La coordonnée réelle correspondante sur l'axe des y.
     */
    public double convertYInverse(int y) {
        return maxY - y * (maxY - minY) / height;
    }
}
