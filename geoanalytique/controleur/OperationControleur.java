package geoanalytique.controleur;

import geoanalytique.model.Cercle;
import geoanalytique.model.geoobject.operation.AireCercleOperation;

/**
 * Cette classe contient les méthodes pour effectuer des opérations sur des objets géométriques.
 */
public class OperationControleur {

    /**
     * Effectue une opération pour calculer l'aire d'un cercle.
     * 
     * @param cercle Le cercle sur lequel effectuer l'opération.
     */
    public void operation(Cercle cercle) {
        System.out.println("------------------------------ Operation Cercle -------------");

        // Créer une instance de l'opération pour calculer l'aire du cercle
        AireCercleOperation aire = new AireCercleOperation(cercle.getRayon());

        // Afficher le résultat du calcul de l'aire du cercle
        System.out.println("Aire du cercle: " + aire.calculer());
    }
}
