package geoanalytique.graphique;

import java.awt.*;

public class GCoordonnee extends Graphique {
    private int x;
    private int y;
    private int largeur;
    private int longueur;

    public GCoordonnee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public GCoordonnee(int x, int y, int  largeur, int longueur) {
        this(x, y);
        this.largeur=largeur;
        this.longueur=longueur;
    }

    @Override
    public void paint(Graphics g) {
        // Dessiner un point aux coordonnées spécifiées
        if(largeur ==0 && longueur==0){
            g.fillRect(x, y, 5, 5);
        }
        else g.drawRect(x, y, largeur, longueur);
    }
}
