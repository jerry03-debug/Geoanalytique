package geoanalytique.controleur;

import java.awt.Graphics;
import java.awt.Color;

public class GeoAnalytiqueControleur {

    private static final int AXIS_MARGIN = 50; // Marge pour l'axe des graduations
    private static final int TICK_SIZE = 5; // Taille des marques de graduation
    private static final int TICK_LABEL_MARGIN = 5; // Marge pour les labels de graduation
    private static final int TICK_SPACING = 30; // Espacement entre les graduations

    public GeoAnalytiqueControleur(){};

    public void recalculPoints(int width, int height, Graphics g) {

        // Dessiner l'axe des X avec les graduations
        drawXAxis(g, width, height);

        // Dessiner l'axe des Y avec les graduations
        drawYAxis(g, width, height);

    }


    private void drawXAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);

        // Dessiner l'axe des X
        g.drawLine(AXIS_MARGIN, height / 2, width - AXIS_MARGIN, height / 2);

        // Dessiner les graduations de l'axe des X
        for (int x = AXIS_MARGIN + TICK_SPACING; x < width - AXIS_MARGIN; x += TICK_SPACING) {
            if (x != width / 2) { // Exclure le zéro
                g.drawLine(x, height / 2 - TICK_SIZE / 2, x, height / 2 + TICK_SIZE / 2);
                g.drawString(Integer.toString((x - width / 2) / TICK_SPACING), x - TICK_LABEL_MARGIN, height / 2 - TICK_LABEL_MARGIN);
            }
        }
    }

    private void drawYAxis(Graphics g, int width, int height) {
        g.setColor(Color.BLACK);

        // Dessiner l'axe des Y
        g.drawLine(width / 2, AXIS_MARGIN, width / 2, height - AXIS_MARGIN);

        // Dessiner les graduations de l'axe des Y
        for (int y = AXIS_MARGIN + TICK_SPACING; y < height - AXIS_MARGIN; y += TICK_SPACING) {
            if (y != height / 2) { // Exclure le zéro
                g.drawLine(width / 2 - TICK_SIZE / 2, y, width / 2 + TICK_SIZE / 2, y);
                g.drawString(Integer.toString((height / 2 - y) / TICK_SPACING), width / 2 + TICK_LABEL_MARGIN, y + TICK_LABEL_MARGIN);
            }
        }
    }
}