package geoanalytique.model;

/**
 * Représente une zone de dessin virtuel pour convertir les coordonnées réelles en coordonnées de la Vue.
 */
public class ViewPort {
    private static final int TICK_SPACING = 30; // Espacement entre les graduations
    // private int width, height; // Les dimensions du repere?
    private double x, y;
    

    
    public ViewPort(double x, double y) {
        this.x =  x;
        this.y =  y;
    }

    /**
     * Convertit une coordonnée réelle en coordonnée de la Vue sur l'axe des x.
     * 
     * @param x La coordonnée réelle sur l'axe des x.
     * @return La coordonnée correspondante sur l'axe des x de la Vue.
     */
    public int convertX(int width) {
        return (int) ((width/2) + (this.x * TICK_SPACING));
    }

    /**
     * Convertit une coordonnée réelle en coordonnée de la Vue sur l'axe des y.
     * 
     * @param y La coordonnée réelle sur l'axe des y.
     * @return La coordonnée correspondante sur l'axe des y de la Vue.
     */
    public int convertY(int height) {
        return (int) ((height/2) - (this.y * TICK_SPACING));
    }

    /**
     * Convertit une longueur réelle en longueur de la Vue sur l'axe des x.
     * 
     * @param length La longueur réelle.
     * @return La longueur correspondante sur l'axe des x de la Vue.
     */
    public int convertLongueur(double length) {
        return (int) length*TICK_SPACING;
    }

    // /**
    //  * Convertit une longueur réelle en longueur de la Vue sur l'axe des y.
    //  * 
    //  * @param length La longueur réelle.
    //  * @return La longueur correspondante sur l'axe des y de la Vue.
    //  */
    // public int convertLengthY(double length) {
    //     return (int) (length / (maxY - minY) * height);
    // }

    // /**
    //  * Convertit une coordonnée de la Vue en coordonnée réelle sur l'axe des x.
    //  * 
    //  * @param x La coordonnée sur l'axe des x de la Vue.
    //  * @return La coordonnée réelle correspondante sur l'axe des x.
    //  */
    // public double convertXInverse(int x) {
    //     return x * (maxX - minX) / width + minX;
    // }

    // /**
    //  * Convertit une coordonnée de la Vue en coordonnée réelle sur l'axe des y.
    //  * 
    //  * @param y La coordonnée sur l'axe des y de la Vue.
    //  * @return La coordonnée réelle correspondante sur l'axe des y.
    //  */
    // public double convertYInverse(int y) {
    //     return maxY - y * (maxY - minY) / height;
    // }
}
