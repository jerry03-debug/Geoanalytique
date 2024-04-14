package geoanalytique.graphique;

import java.awt.*;

public class GTexte extends Graphique {
    private String texte;
    private int x, y;

    public GTexte(String texte, int x, int y) {
        this.texte = texte;
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        // Dessiner du texte aux coordonnées spécifiées
        g.drawString(texte, x, y);
    }
}
