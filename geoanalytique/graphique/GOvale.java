package geoanalytique.graphique;

import java.awt.*;

public class GOvale extends Graphique {
    private int x, y, largeur, hauteur;

    public GOvale(int x, int y, int largeur, int hauteur) {
        // Ajuster les coordonnées pour placer le centre de l'ovale au point (x, y)
        this.x = x - largeur / 2;
        this.y = y - hauteur / 2;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void paint(Graphics g) {
        // Dessiner un ovale aux coordonnées spécifiées avec la largeur et la hauteur données
        g.drawOval(x, y, largeur, hauteur);
    }
}
