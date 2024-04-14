package geoanalytique.graphique;

import java.awt.*;

public class GCoordonnee extends Graphique {
    private int x;
    private int y;

    public GCoordonnee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        // Dessiner un point aux coordonnées spécifiées
        g.fillRect(x, y, 1, 1);
    }
}
