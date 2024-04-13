package geoanalytique.model.geoobject.operation;

import geoanalytique.model.GeoObject;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour changer le nom d'un objet géométrique.
 */
public class ChangeNomOperation implements Operation {
    private GeoObject geoObject;
    private String nouveauNom;

    /**
     * Constructeur de l'opération de changement de nom.
     *
     * @param geoObject  L'objet géométrique à renommer.
     * @param nouveauNom Le nouveau nom à attribuer à l'objet.
     */
    public ChangeNomOperation(GeoObject geoObject, String nouveauNom) {
        this.geoObject = geoObject;
        this.nouveauNom = nouveauNom;
    }

    /**
     * Méthode pour changer le nom de l'objet géométrique.
     */
    public void changerNom() {
        geoObject.setNom(nouveauNom);
    }
}
