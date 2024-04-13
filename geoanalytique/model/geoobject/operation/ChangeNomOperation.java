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
    @Override
    public void changerNom() {
        geoObject.setNom(nouveauNom);
    }

/**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Change Nom Operation";
}

/**
 * Retourne l'arité de l'opération, c'est-à-dire le nombre d'arguments qu'elle prend.
 * @return L'arité de l'opération.
 */
@Override
public int getArite() {
    return 2;
}

/**
 * Définit l'argument à la position spécifiée.
 * @param num La position de l'argument à définir.
 * @param o L'argument à définir.
 */
@Override
public void setArgument(int num, Object o) {
    switch (num) {
        case 0:
            if (!(o instanceof GeoObject)) {
                throw new IllegalArgumentException("Argument must be a GeoObject");
            }
            this.geoObject = (GeoObject) o;
            break;
        case 1:
            if (!(o instanceof String)) {
                throw new IllegalArgumentException("Argument must be a String");
            }
            this.nouveauNom = (String) o;
            break;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}

/**
 * Retourne la classe de l'argument à la position spécifiée.
 * @param num La position de l'argument.
 * @return La classe de l'argument.
 */
@Override
public Class getClassArgument(int num) {
    switch (num) {
        case 0:
            return GeoObject.class;
        case 1:
            return String.class;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}

/**
 * Effectue le calcul de l'opération, qui dans ce cas est de changer le nom de l'objet géométrique.
 * @return Le résultat du calcul, qui dans ce cas est l'objet géométrique avec son nom changé.
 */
@Override
public Object calculer() {
    this.changerNom();
    return this.geoObject;
}
}
