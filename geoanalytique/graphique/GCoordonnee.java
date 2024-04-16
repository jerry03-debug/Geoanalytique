package geoanalytique.graphique;

import java.awt.*;

/**
 * Cette classe représente une coordonnée graphique dans un système de coordonnées.
 * Elle étend la classe Graphique et implémente la méthode paint pour dessiner la coordonnée.
 */
public class GCoordonnee extends Graphique {
    
    // Coordonnées de la coordonnée graphique
    private int x;
    private int y;
    
    // Largeur et longueur de la coordonnée graphique (si elle est dessinée comme un rectangle)
    private int largeur;
    private int longueur;

    /**
     * Constructeur de la classe GCoordonnee pour une coordonnée ponctuelle.
     * Initialise les coordonnées x et y de la coordonnée.
     * @param x La coordonnée x de la coordonnée.
     * @param y La coordonnée y de la coordonnée.
     */
    public GCoordonnee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructeur de la classe GCoordonnee pour une coordonnée rectangulaire.
     * Initialise les coordonnées x et y de la coordonnée, ainsi que sa largeur et sa longueur.
     * @param x La coordonnée x de la coordonnée.
     * @param y La coordonnée y de la coordonnée.
     * @param largeur La largeur de la coordonnée (si elle est dessinée comme un rectangle).
     * @param longueur La longueur de la coordonnée (si elle est dessinée comme un rectangle).
     */
    public GCoordonnee(int x, int y, int largeur, int longueur) {
        this(x, y); // Appel du premier constructeur pour initialiser les coordonnées x et y
        this.largeur = largeur;
        this.longueur = longueur;
    }

    /**
     * Méthode pour dessiner la coordonnée.
     * Dessine un point ou un rectangle aux coordonnées spécifiées en fonction de la largeur et de la longueur.
     * @param g L'objet Graphics utilisé pour dessiner la coordonnée.
     */
    @Override
    public void paint(Graphics g) {
        // Dessiner un point ou un rectangle aux coordonnées spécifiées
        if (largeur == 0 && longueur == 0) {
            g.fillRect(x, y, 5, 5); // Dessiner un point
        } else {
            g.drawRect(x, y, largeur, longueur); // Dessiner un rectangle
        }
    }
}
