package geoanalytique.graphique;

import java.awt.*;

/**
 * Cette classe représente une ligne graphique dans un système de coordonnées.
 * Elle étend la classe Graphique et implémente la méthode paint pour dessiner la ligne.
 */
public class GLine extends Graphique {
    
    // Coordonnées des extrémités de la ligne
    private int x1, y1, x2, y2;

    /**
     * Constructeur de la classe GLine.
     * Initialise les coordonnées des extrémités de la ligne.
     * @param x1 La coordonnée x du premier point de la ligne.
     * @param y1 La coordonnée y du premier point de la ligne.
     * @param x2 La coordonnée x du deuxième point de la ligne.
     * @param y2 La coordonnée y du deuxième point de la ligne.
     */
    public GLine(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Méthode pour dessiner la ligne.
     * Dessine une ligne entre les deux points spécifiés.
     * @param g L'objet Graphics utilisé pour dessiner la ligne.
     */
    @Override
    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }
}
