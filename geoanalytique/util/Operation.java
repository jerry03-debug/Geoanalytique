package geoanalytique.util;

import geoanalytique.model.Point;

/**
 * L'interface Operation définit les opérations pouvant être effectuées sur des objets géométriques.
 */
public interface Operation {
    /**
     * Renvoie le titre de l'opération.
     *
     * @return Le titre de l'opération.
     */
    String getTitle();

    /**
     * Renvoie le nombre d'arguments de l'opération.
     *
     * @return Le nombre d'arguments de l'opération.
     */
    int getArite();

    /**
     * Définit un argument de l'opération.
     *
     * @param num Le numéro de l'argument.
     * @param o   L'objet à définir comme argument.
     */
    void setArgument(int num, Object o);

    /**
     * Renvoie la classe de l'argument spécifié.
     *
     * @param num Le numéro de l'argument.
     * @return La classe de l'argument.
     */
    Class getClassArgument(int num);

    /**
     * Effectue le calcul de l'opération et renvoie le résultat.
     *
     * @return Le résultat du calcul de l'opération.
     */
    Object calculer();

    
    /**
     * Change le nom d'un objet.
     *
     * @param nouveauNom Le nouveau nom de l'objet.
     */
    void changerNom(String nouveauNom);
}

