package geoanalytique.graphique;

import java.awt.*;

public abstract class Graphique {
    /**
     * Méthode abstraite à redéfinir dans les sous-classes pour dessiner l'objet graphique.
     * 
     * @param g Le contexte graphique dans lequel dessiner.
     */
    public abstract void paint(Graphics g);
}
