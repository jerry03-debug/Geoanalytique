package geoanalytique.graphique;

import java.awt.*;

/**
 * Cette classe abstraite représente un objet graphique pouvant être dessiné dans un contexte graphique donné.
 * Les classes concrètes étendant cette classe doivent implémenter la méthode paint pour dessiner l'objet graphique.
 */
public abstract class Graphique {
    
    /**
     * Méthode abstraite à redéfinir dans les sous-classes pour dessiner l'objet graphique.
     * 
     * @param g Le contexte graphique dans lequel dessiner.
     */
    public abstract void paint(Graphics g);
}
