/**
 * Cette classe contient la méthode principale de l'application GeoAnalytique.
 * Elle lance l'interface utilisateur graphique (GUI) de l'application.
 */
package geoanalytique;

import geoanalytique.gui.GeoAnalytiqueGUI;
/**
 * Cette classe représente le point d'entrée principal de l'application.
 */
public class Main {

     /**
     * Constructeur par défaut de la classe Main.
     * Ce constructeur est utilisé pour créer une instance de la classe Main.
     */
    public Main() {
        // Le constructeur par défaut peut être utilisé pour initialiser des objets ou effectuer d'autres opérations.
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Méthode run invoquée par le thread de l'interface graphique pour initialiser et afficher la GUI.
             */
            public void run() {
                new GeoAnalytiqueGUI().setVisible(true);
            }
        });
    }
}
