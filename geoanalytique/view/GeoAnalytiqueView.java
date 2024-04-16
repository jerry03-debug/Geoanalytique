package geoanalytique.view;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import geoanalytique.controleur.GeoAnalytiqueControleur;
import geoanalytique.graphique.Graphique;

/**
 * Cette classe représente la vue principale de l'application GeoAnalytique.
 * Elle affiche les graphiques géométriques dans un JPanel et les gère via un contrôleur.
 */
public class GeoAnalytiqueView extends JPanel {
    private List<Graphique> graphiques; // Liste des graphiques à afficher
    private GeoAnalytiqueControleur controleur; // Le contrôleur pour gérer les opérations sur les graphiques

    /**
     * Constructeur de la classe GeoAnalytiqueView.
     * 
     * @param graphiques La liste des graphiques à afficher dans la vue.
     */
    public GeoAnalytiqueView(List<Graphique> graphiques) {
        this.graphiques = graphiques;
        this.controleur = new GeoAnalytiqueControleur(graphiques);
        setBackground(Color.WHITE); // Définir la couleur de fond du JPanel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dessiner chaque objet graphique
        for (Graphique graphique : graphiques) {
            graphique.paint(g);
        }

        // Obtenir la largeur et la hauteur du JPanel
        int width = getWidth();
        int height = getHeight();

        // Recalculer les points pour l'axe des X et l'axe des Y
        controleur.recalculPoints(width, height, g);
    }

    /**
     * Définit une nouvelle liste de graphiques à afficher dans la vue.
     * 
     * @param nouveauxGraphiques La nouvelle liste de graphiques.
     */
    public void setGraphiques(List<Graphique> nouveauxGraphiques) {
        graphiques.addAll(nouveauxGraphiques); // Ajouter tous les nouveaux graphiques à la liste existante
    }

    /**
     * Efface tous les graphiques de la vue.
     */
    public void clearGraphiques() {
        graphiques.clear(); // Vider la liste de graphiques
        repaint(); // Redessiner le panneau pour refléter le changement
    }

    /**
     * Obtient la liste des graphiques actuellement affichés dans la vue.
     * 
     * @return La liste des graphiques.
     */
    public List<Graphique> getGraphiques() {
        return graphiques;
    }

    @Override
    public Dimension getPreferredSize() {
        return getParent().getSize(); // Adapter la taille au conteneur parent
    }
}
