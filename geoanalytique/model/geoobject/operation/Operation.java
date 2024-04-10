package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
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
     * Déplace un point vers de nouvelles coordonnées.
     *
     * @param newX La nouvelle coordonnée X du point.
     * @param newY La nouvelle coordonnée Y du point.
     */
    void deplacer(int newX, int newY);

    /**
     * Calcule la distance entre le point de l'opération et un autre point spécifié.
     *
     * @param otherPoint Le point à partir duquel calculer la distance.
     * @return La distance entre les deux points.
     */
    double distanceAUnPoint(Point otherPoint);

    /**
     * Calcule le milieu entre deux points spécifiés.
     *
     * @param point1 Le premier point.
     * @param point2 Le deuxième point.
     * @return Le point milieu.
     */
    Point milieu(Point point1, Point point2);

    /**
     * Change le nom d'un objet.
     *
     * @param nouveauNom Le nouveau nom de l'objet.
     */
    void changerNom(String nouveauNom);

    /**
     * Calcule la médiatrice d'un segment défini par deux points.
     *
     * @param point1 Le premier point du segment.
     * @param point2 Le deuxième point du segment.
     * @return La droite représentant la médiatrice du segment.
     */
    Droite calculerMediatrice(Point point1, Point point2);

    /**
     * Calcule la bissectrice d'un angle défini par trois points.
     *
     * @param point1 Le premier point de l'angle.
     * @param point2 Le point de l'angle.
     * @param point3 Le troisième point de l'angle.
     * @return La droite représentant la bissectrice de l'angle.
     */
    Droite calculerBissectrice(Point point1, Point point2, Point point3);

    /**
     * Calcule la médiane d'un triangle défini par trois points.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     * @return La droite représentant la médiane du triangle.
     */
    Droite calculerMediane(Point point1, Point point2, Point point3);

   
    /**
     * Calcule l'orthocentre d'un triangle défini par trois points.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     * @return Le point représentant l'orthocentre du triangle.
     */
    Point calculerOrthocentre(Point point1, Point point2, Point point3);
    
    /**
     * Calcule le centre du cercle inscrit dans un triangle défini par trois points.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     * @return Le point représentant le centre du cercle inscrit dans le triangle.
     */
    Point calculerCentreCercleInscrit(Point point1, Point point2, Point point3);
    
    /**
     * Calcule le centre du cercle circonscrit à un triangle défini par trois points.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     * @return Le point représentant le centre du cercle circonscrit au triangle.
     */
    Point calculerCentreCercleCirconscrit(Point point1, Point point2, Point point3);
        
    /**
     * Calcule le centre de gravité d'un triangle défini par trois points.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     * @return Le point représentant le centre de gravité du triangle.
     */
    Point calculerCentreGravite(Point point1, Point point2, Point point3);
}

