package geoanalytique.graphique;

import java.awt.*;

/**
 * Cette classe représente un ovale graphique dans un système de coordonnées.
 * Elle étend la classe Graphique et implémente la méthode paint pour dessiner l'ovale.
 */
public class GOvale extends Graphique {
    
    // Coordonnées du coin supérieur gauche de l'ovale, ainsi que sa largeur et sa hauteur
    private int x, y, largeur, hauteur;

    /**
     * Constructeur de la classe GOvale.
     * Initialise les coordonnées, la largeur et la hauteur de l'ovale.
     * Le point (x, y) spécifie le centre de l'ovale.
     * @param x La coordonnée x du centre de l'ovale.
     * @param y La coordonnée y du centre de l'ovale.
     * @param largeur La largeur de l'ovale.
     * @param hauteur La hauteur de l'ovale.
     */
    public GOvale(int x, int y, int largeur, int hauteur) {
        // Ajuster les coordonnées pour placer le centre de l'ovale au point (x, y)
        this.x = x - largeur;
        this.y = y - hauteur;
        this.largeur = largeur * 2;
        this.hauteur = hauteur * 2;
    }

    /**
     * Méthode pour dessiner l'ovale.
     * Dessine un ovale aux coordonnées spécifiées avec la largeur et la hauteur données.
     * @param g L'objet Graphics utilisé pour dessiner l'ovale.
     */
    @Override
    public void paint(Graphics g) {
        g.drawOval(x, y, largeur, hauteur);
    }
}
