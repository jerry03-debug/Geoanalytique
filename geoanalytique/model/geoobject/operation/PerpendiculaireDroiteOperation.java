package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

public class PerpendiculaireDroiteOperation implements Operation {


    private Droite droite;
    private Point point;

    public PerpendiculaireDroiteOperation(Droite droite, Point point) {
        this.droite = droite;
        this.point = point;
    }

    @Override
    public Droite calculer() {
    // Calculer la pente de la droite donnée: deux droites parallèles ont la même pente
    float pente = -1/this.droite.getPente();

    // Calculer l'ordonnée à l'origine de la nouvelle droite parallèle
    float ordonneeOrigine = this.point.getOrdonnee() - pente * this.point.getAbscisse();

    // Retourner une nouvelle droite avec la même pente, mais passant par le point donné
    return new Droite(ordonneeOrigine, pente);
}

    /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Perpendiculaire Droite Operation";
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
            if (!(o instanceof Droite)) {
                throw new IllegalArgumentException("Argument must be a Droite");
            }
            this.droite = (Droite) o;
            break;
        case 1:
            if (!(o instanceof Point)) {
                throw new IllegalArgumentException("Argument must be a Point");
            }
            this.point = (Point) o;
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
            return Droite.class;
        case 1:
            return Point.class;
        default:
            throw new IllegalArgumentException("Invalid argument index: " + num);
    }
}
    
}