package geoanalytique.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import geoanalytique.graphique.Graphique;

public class GeoAnalytiqueView extends JPanel {
    private List<Graphique> graphiques;
    private static final int AXIS_MARGIN = 50; // Marge pour l'axe des graduations
    private static final int TICK_SIZE = 5; // Taille des marques de graduation
    private static final int TICK_LABEL_MARGIN = 5; // Marge pour les labels de graduation
    private static final int TICK_SPACING = 20; // Espacement entre les graduations

    public GeoAnalytiqueView(List<Graphique> graphiques) {
        this.graphiques = graphiques;
        setBackground(Color.WHITE); // Définir la couleur de fond du JPanel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dessiner chaque objet graphique
        for (Graphique graphique : graphiques) {
            graphique.paint(g);
        }

        int width = getWidth();
        int height = getHeight();

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

    public void setGraphiques(List<Graphique> nouveauxGraphiques) {
        graphiques.addAll(nouveauxGraphiques); // Ajoutez tous les nouveaux graphiques à la liste existante
    }

    // Ajoutez une méthode pour effacer tous les graphiques
    public void clearGraphiques() {
        graphiques.clear(); // Vide la liste de graphiques
        repaint(); // Redessine le panneau pour refléter le changement
    }

    @Override
    public Dimension getPreferredSize() {
        return getParent().getSize(); // Adapter la taille au conteneur parent
    }
}
