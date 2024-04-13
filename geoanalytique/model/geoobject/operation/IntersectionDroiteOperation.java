package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

public class IntersectionDroiteOperation implements Operation {
    private Droite droite1;
    private Droite droite2;

    public  IntersectionDroiteOperation(Droite droite1, Droite droite2) {
        this.droite1 = droite1;
        this.droite2 = droite2; 
    }

    @Override
    public Point calculer() {
        // Vérifier si les droites sont parallèles (Deux droites paralleles ont la meme pente)
        if (droite1.getPente() == (droite2.getPente())) {
            return null; // Les droites sont parallèles, pas d'intersection
        }
    
        /** Si deux droites ont une intersection alors il existe un point I(x,y) qui appartient aux deux droites.
        Donc en ce point les deux equations de droites sont égales : y = m1x + b1 = m2x + b2*/

        // Calculer les coordonnées du point d'intersection
        float xIntersection = (droite2.getOrdonneeOrigine() - droite1.getOrdonneeOrigine()) / (droite1.getPente() - droite2.getPente());
        float yIntersection = droite1.getPente() * xIntersection + droite1.getOrdonneeOrigine();
    
        return new Point(xIntersection, yIntersection);
    }
    
   /**
 * Retourne le titre de l'opération.
 * @return Le titre de l'opération.
 */
@Override
public String getTitle() {
    return "Intersection Droite Operation";
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
    if (!(o instanceof Droite)) {
        throw new IllegalArgumentException("Argument must be a Droite");
    }
    switch (num) {
        case 0:
            this.droite1 = (Droite) o;
            break;
        case 1:
            this.droite2 = (Droite) o;
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
    return Droite.class;
}

/**
 * Change le nom de l'opération.
 * @param nouveauNom Le nouveau nom de l'opération.
 */
@Override
public void changerNom(String nouveauNom) {
    // Cette méthode n'a pas de sens pour cette classe, car le nom de l'opération est fixe.
    throw new UnsupportedOperationException("Cannot change name of this operation");
}
    
}
