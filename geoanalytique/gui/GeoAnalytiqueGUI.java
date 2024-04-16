package geoanalytique.gui;

import geoanalytique.model.Cercle;
import geoanalytique.model.Point;
import geoanalytique.model.Segment;
import geoanalytique.view.GeoAnalytiqueView;
import geoanalytique.controleur.GeoAnalytiqueControleur;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GeoAnalytiqueGUI extends javax.swing.JFrame {

    private GeoAnalytiqueView repereOrthogonal = new GeoAnalytiqueView(new ArrayList<>());
    private GeoAnalytiqueControleur controleur = new GeoAnalytiqueControleur(repereOrthogonal.getGraphiques());

    public GeoAnalytiqueGUI() {
        initComponents();
        tableauDessin.setLayout(new BorderLayout());
        tableauDessin.add(repereOrthogonal, BorderLayout.CENTER);
    }

    private static final int TICK_SPACING = 30; // Espacement entre les graduations

    private void initComponents() {
        tableauDessin = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenu();
        btnCercle = new javax.swing.JMenuItem();
        btnPoint  = new javax.swing.JMenuItem();
        btnDroite = new javax.swing.JMenuItem();
        btnSegment = new javax.swing.JMenuItem();
        btnEllipse = new javax.swing.JMenuItem();
        btnCarre = new javax.swing.JMenuItem();
        btnClear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableauDessin.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tableauDessinLayout = new javax.swing.GroupLayout(tableauDessin);
        tableauDessin.setLayout(tableauDessinLayout);
        tableauDessinLayout.setHorizontalGroup(
                tableauDessinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 990, Short.MAX_VALUE)
        );
        tableauDessinLayout.setVerticalGroup(
                tableauDessinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 568, Short.MAX_VALUE)
        );

        jMenu1.setText("Outils");

        jMenuItem1.setText("selectionner");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("deselectionner");

        jMenu1.add(jMenuItem2);

        btnClear.setText("Effacer");
        jMenu1.add(btnClear);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jMenuBar1.add(jMenu1);

        jMenuItem3.setText("Dessiner");

        btnPoint.setText("Point");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });
        jMenuItem3.add(btnPoint);


        btnCercle.setText("Cercle");
        btnCercle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercleActionPerformed(evt);
            }
        });
        jMenuItem3.add(btnCercle);

        btnDroite.setText("Droite");
        jMenuItem3.add(btnDroite);

        btnSegment.setText("Segment");
        btnSegment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegmentActionPerformed(evt);
            }
        });
        jMenuItem3.add(btnSegment);

        btnEllipse.setText("Ellipse");
        jMenuItem3.add(btnEllipse);

        btnCarre.setText("Carre");
        btnCarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarreActionPerformed(evt);
            }
        });
        jMenuItem3.add(btnCarre);

        jMenuBar1.add(jMenuItem3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(tableauDessin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tableauDessin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        // Efface tous les graphiques de GeoAnalytiqueView
        repereOrthogonal.clearGraphiques();
    }

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {
        // Afficher une boîte de dialogue pour demander les coordonnées du point
        String xString = JOptionPane.showInputDialog(this, "Entrez la coordonnée X du point :", "Coordonnée X", JOptionPane.QUESTION_MESSAGE);
        String yString = JOptionPane.showInputDialog(this, "Entrez la coordonnée Y du point :", "Coordonnée Y", JOptionPane.QUESTION_MESSAGE);

        // Vérifier si l'utilisateur a appuyé sur "Annuler" ou fermé la boîte de dialogue
        if (xString != null && yString != null) {
            try {
                // Convertir les coordonnées en entiers
                int x = Integer.parseInt(xString);
                int y = Integer.parseInt(yString);

                // Récupérer les dimensions du repère
                int width = repereOrthogonal.getWidth();
                int height = repereOrthogonal.getHeight();

                // Calculer les graduations de l'axe des X et Y
                int tickSpacing = TICK_SPACING;

                // Calculer les coordonnées par rapport au centre du repère
                int centerX = width / 2;
                int centerY = height / 2;
                int repereX = centerX + (x * tickSpacing); // Utiliser la graduation pour ajuster la position
                int repereY = centerY - (y * tickSpacing); // Utiliser la graduation pour ajuster la position

                // Créer un nouveau point avec les coordonnées calculées par rapport au repère
                Point point = new Point(repereX, repereY);

                // Ajouter le point en tant qu'objet à la liste des graphiques via le contrôleur
                controleur.addObject(point);

                // Rafraîchir l'affichage de GeoAnalytiqueView
                repereOrthogonal.repaint();
            } catch (NumberFormatException e) {
                // Afficher un message d'erreur si les coordonnées ne sont pas valides
                JOptionPane.showMessageDialog(this, "Veuillez entrer des coordonnées valides.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnSegmentActionPerformed(java.awt.event.ActionEvent evt) {
    // Afficher une boîte de dialogue pour demander les coordonnées du premier point
    String x1String = JOptionPane.showInputDialog(this, "Entrez la coordonnée X du premier point :", "Coordonnée X du premier point", JOptionPane.QUESTION_MESSAGE);
    String y1String = JOptionPane.showInputDialog(this, "Entrez la coordonnée Y du premier point :", "Coordonnée Y du premier point", JOptionPane.QUESTION_MESSAGE);

    // Vérifier si l'utilisateur a appuyé sur "Annuler" ou fermé la boîte de dialogue
    if (x1String != null && y1String != null) {
        try {
            // Convertir les coordonnées du premier point en entiers
            int x1 = Integer.parseInt(x1String);
            int y1 = Integer.parseInt(y1String);

            // Afficher une boîte de dialogue pour demander les coordonnées du deuxième point
            String x2String = JOptionPane.showInputDialog(this, "Entrez la coordonnée X du deuxième point :", "Coordonnée X du deuxième point", JOptionPane.QUESTION_MESSAGE);
            String y2String = JOptionPane.showInputDialog(this, "Entrez la coordonnée Y du deuxième point :", "Coordonnée Y du deuxième point", JOptionPane.QUESTION_MESSAGE);

            // Vérifier si l'utilisateur a appuyé sur "Annuler" ou fermé la boîte de dialogue
            if (x2String != null && y2String != null) {
                try {
                    // Convertir les coordonnées du deuxième point en entiers
                    int x2 = Integer.parseInt(x2String);
                    int y2 = Integer.parseInt(y2String);

                    // Récupérer les dimensions du repère
                    int width = repereOrthogonal.getWidth();
                    int height = repereOrthogonal.getHeight();

                    // Calculer les graduations de l'axe des X et Y
                    int tickSpacing = TICK_SPACING;

                    // Calculer les coordonnées du premier point par rapport au centre du repère
                    int centerX = width / 2;
                    int centerY = height / 2;
                    int repereX1 = centerX + (x1 * tickSpacing);
                    int repereY1 = centerY - (y1 * tickSpacing);

                    // Calculer les coordonnées du deuxième point par rapport au centre du repère
                    int repereX2 = centerX + (x2 * tickSpacing);
                    int repereY2 = centerY - (y2 * tickSpacing);

                    // Créer deux nouveaux point avec les coordonnées calculées par rapport au repère
                    Point point1 = new Point(repereX1, repereY1);
                    Point point2 = new Point(repereX2, repereY2);

                    // Créer un nouveau segment avec les coordonnées calculées par rapport au repère
                    Segment segment = new Segment(point1, point2);

                    // Ajouter le segment en tant qu'objet à la liste des graphiques via le contrôleur
                    controleur.addObject(segment);

                    // Rafraîchir l'affichage de GeoAnalytiqueView
                    repereOrthogonal.repaint();
                } catch (NumberFormatException e) {
                    // Afficher un message d'erreur si les coordonnées du deuxième point ne sont pas valides
                    JOptionPane.showMessageDialog(this, "Veuillez entrer des coordonnées valides pour le deuxième point.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            // Afficher un message d'erreur si les coordonnées du premier point ne sont pas valides
            JOptionPane.showMessageDialog(this, "Veuillez entrer des coordonnées valides pour le premier point.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
}


    private void btnCercleActionPerformed(java.awt.event.ActionEvent evt) {
        // Afficher une boîte de dialogue pour demander les coordonnées du centre
        String centerXString = JOptionPane.showInputDialog(this, "Entrez la coordonnée X du centre du cercle :", "Coordonnée X du centre", JOptionPane.QUESTION_MESSAGE);
        String centerYString = JOptionPane.showInputDialog(this, "Entrez la coordonnée Y du centre du cercle :", "Coordonnée Y du centre", JOptionPane.QUESTION_MESSAGE);

        // Vérifier si l'utilisateur a appuyé sur "Annuler" ou fermé la boîte de dialogue
        if (centerXString != null && centerYString != null) {
            try {
                // Convertir les coordonnées du centre en entiers
                int centerX = Integer.parseInt(centerXString);
                int centerY = Integer.parseInt(centerYString);

                // Afficher une boîte de dialogue pour demander le rayon du cercle
                String rayonString = JOptionPane.showInputDialog(this, "Entrez le rayon du cercle :", "Rayon du cercle", JOptionPane.QUESTION_MESSAGE);

                // Vérifier si l'utilisateur a appuyé sur "Annuler" ou fermé la boîte de dialogue
                if (rayonString != null) {
                    try {
                        // Convertir le rayon en entier
                        int rayon = Integer.parseInt(rayonString);

                        // Récupérer les dimensions du repère
                        int width = repereOrthogonal.getWidth();
                        int height = repereOrthogonal.getHeight();

                        // Calculer les graduations de l'axe des X et Y
                        int tickSpacing = TICK_SPACING;

                        // Calculer les coordonnées du centre par rapport au centre du repère
                        int repereCenterX = (width / 2) + (centerX * tickSpacing);
                        int repereCenterY = (height / 2) - (centerY * tickSpacing);

                        // Créer un nouveau point avec les coordonnées calculées par rapport au repère
                        Point pointCentre = new Point(repereCenterX, repereCenterY);

                        // Recalculer le rayon pour respecter la graduation
                        int repereRayon = rayon * tickSpacing;

                        // Créer un nouveau cercle avec les coordonnées calculées par rapport au repère
                        Cercle cercle = new Cercle(pointCentre, repereRayon);

                        // Ajouter le cercle en tant qu'objet à la liste des graphiques via le contrôleur
                        controleur.addObject(cercle);

                        // Rafraîchir l'affichage de GeoAnalytiqueView
                        repereOrthogonal.repaint();
                    } catch (NumberFormatException e) {
                        // Afficher un message d'erreur si le rayon n'est pas valide
                        JOptionPane.showMessageDialog(this, "Veuillez entrer un rayon valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (NumberFormatException e) {
                // Afficher un message d'erreur si les coordonnées du centre ne sont pas valides
                JOptionPane.showMessageDialog(this, "Veuillez entrer des coordonnées valides pour le centre du cercle.", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }



    private void btnCarreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: Implémentez l'ajout d'un carré
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeoAnalytiqueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuItem btnCarre;
    private javax.swing.JMenuItem btnClear;
    private javax.swing.JMenu jMenuItem3;
    private javax.swing.JMenuItem btnPoint;
    private javax.swing.JMenuItem btnDroite;
    private javax.swing.JMenuItem btnEllipse;
    private javax.swing.JMenuItem btnSegment;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem btnCercle;
    private javax.swing.JPanel tableauDessin;
    // End of variables declaration
}
