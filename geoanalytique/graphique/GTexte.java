package geoanalytique.graphique;

import java.awt.*;

/**
 * Cette classe représente un objet graphique de texte pouvant être dessiné dans un contexte graphique donné.
 */
public class GTexte extends Graphique {
    private String texte; // Le texte à afficher
    private int x, y; // Les coordonnées du point d'origine du texte

    /**
     * Constructeur de la classe GTexte.
     * 
     * @param texte Le texte à afficher.
     * @param x     La coordonnée X du point d'origine du texte.
     * @param y     La coordonnée Y du point d'origine du texte.
     */
    public GTexte(String texte, int x, int y) {
        this.texte = texte;
        this.x = x;
        this.y = y;
    }

    /**
     * Méthode permettant de dessiner le texte dans le contexte graphique spécifié.
     * 
     * @param g Le contexte graphique dans lequel dessiner le texte.
     */
    @Override
    public void paint(Graphics g) {
        // Dessiner du texte aux coordonnées spécifiées
        g.drawString(texte, x, y);
    }
}
