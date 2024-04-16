package geoanalytique.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.graphique.Graphique;

public class GeoAnalytiqueView extends JPanel {
    private List<Graphique> graphiques;
    private GeoAnalytiqueControleur  controleur = new GeoAnalytiqueControleur(graphiques);

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

        controleur.recalculPoints(width, height, g);


    }

    public void setGraphiques(List<Graphique> nouveauxGraphiques) {
        graphiques.addAll(nouveauxGraphiques); // Ajoutez tous les nouveaux graphiques à la liste existante
    }

    // Ajoutez une méthode pour effacer tous les graphiques
    public void clearGraphiques() {
        graphiques.clear(); // Vide la liste de graphiques
        repaint(); // Redessine le panneau pour refléter le changement
    }

    public List<Graphique> getGraphiques() {
        return graphiques;
    }


    @Override
    public Dimension getPreferredSize() {
        return getParent().getSize(); // Adapter la taille au conteneur parent
    }
}
