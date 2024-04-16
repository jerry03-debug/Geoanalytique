package geoanalytique.controleur;

import java.awt.Graphics;
import java.awt.Color;
import java.util.List;

import geoanalytique.graphique.Graphique;
import geoanalytique.model.GeoObject;
import geoanalytique.util.Dessinateur;

/**
 * Cette classe contrôle l'affichage des graphiques dans l'interface graphique GeoAnalytique.
 * Elle gère le dessin des axes et des graduations, ainsi que l'ajout d'objets graphiques correspondant
 * à des objets GeoObject dans la liste des graphiques.
 */
public class GeoAnalytiqueControleur {

    private static final int AXIS_MARGIN = 50; // Marge pour l'axe des graduations
    private static final int TICK_SIZE = 5; // Taille des marques de graduation
    private static final int TICK_LABEL_MARGIN = 5; // Marge pour les labels de graduation
    private static final int TICK_SPACING = 30; // Espacement entre les graduations

    private List<Graphique> graphiques; // Liste des graphiques à afficher

    /**
     * Constructeur de la classe GeoAnalytiqueControleur.
     * 
     * @param graphiques La liste des graphiques à afficher.
     */
    public GeoAnalytiqueControleur(List<Graphique> graphiques) {
        this.graphiques = graphiques;
    }

    /**
     * Méthode pour recalculer les points des axes et les redessiner.
     * 
     * @param width  La largeur de la zone de dessin.
     * @param height La hauteur de la zone de dessin.
     * @param g      Le contexte graphique dans lequel dessiner.
     */
    public void recalculPoints(int width, int height, Graphics g) {
        // Dessiner l'axe des X avec les graduations
        drawXAxis(g, width, height);

        // Dessiner l'axe des Y avec les graduations
        drawYAxis(g, width, height);
    }

    // Méthode privée pour dessiner l'axe des X avec les graduations
    private void drawXAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);

        // Dessiner l'axe des X
        g.drawLine(AXIS_MARGIN, height / 2, width - AXIS_MARGIN, height / 2);

        // Dessiner les graduations de l'axe des X pour les valeurs positives
        int graduationValue = 1;
        for (int x = width / 2 + TICK_SPACING; x < width - AXIS_MARGIN; x += TICK_SPACING) {
            g.drawLine(x, height / 2 - TICK_SIZE / 2, x, height / 2 + TICK_SIZE / 2);
            g.drawString(Integer.toString(graduationValue), x - TICK_LABEL_MARGIN, height / 2 - TICK_LABEL_MARGIN);
            graduationValue++;
        }

        // Dessiner les graduations de l'axe des X pour les valeurs négatives
        graduationValue = -1;
        for (int x = width / 2 - TICK_SPACING; x > AXIS_MARGIN; x -= TICK_SPACING) {
            g.drawLine(x, height / 2 - TICK_SIZE / 2, x, height / 2 + TICK_SIZE / 2);
            g.drawString(Integer.toString(graduationValue), x - TICK_LABEL_MARGIN, height / 2 - TICK_LABEL_MARGIN);
            graduationValue--;
        }
    }

    // Méthode privée pour dessiner l'axe des Y avec les graduations
    private void drawYAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);

        // Dessiner l'axe des Y
        g.drawLine(width / 2, AXIS_MARGIN, width / 2, height - AXIS_MARGIN);

        // Dessiner les graduations de l'axe des Y pour les valeurs positives
        int graduationValue = 1;
        for (int y = height / 2 - TICK_SPACING; y > AXIS_MARGIN; y -= TICK_SPACING) {
            g.drawLine(width / 2 - TICK_SIZE / 2, y, width / 2 + TICK_SIZE / 2, y);
            g.drawString(Integer.toString(graduationValue), width / 2 + TICK_LABEL_MARGIN, y + TICK_LABEL_MARGIN);
            graduationValue++;
        }

        // Dessiner les graduations de l'axe des Y pour les valeurs négatives
        graduationValue = -1;
        for (int y = height / 2 + TICK_SPACING; y < height - AXIS_MARGIN; y += TICK_SPACING) {
            g.drawLine(width / 2 - TICK_SIZE / 2, y, width / 2 + TICK_SIZE / 2, y);
            g.drawString(Integer.toString(graduationValue), width / 2 + TICK_LABEL_MARGIN, y + TICK_LABEL_MARGIN);
            graduationValue--;
        }
    }

    /**
     * Méthode pour ajouter un objet graphique correspondant à un GeoObject à la liste.
     * 
     * @param geoObject L'objet GeoObject à dessiner.
     */
    public void addObject(GeoObject geoObject) {
        // Créer une instance de Dessinateur
        Dessinateur dessinateur = new Dessinateur();

        // Utiliser la méthode accept pour obtenir le graphique correspondant au GeoObject
        Graphique graphique = geoObject.accept(dessinateur);

        // Ajouter le graphique à la liste des graphiques
        graphiques.add(graphique);
    }
}
