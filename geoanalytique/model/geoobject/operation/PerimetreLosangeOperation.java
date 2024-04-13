package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un losange.
 */
public class PerimetreLosangeOperation implements Operation {

   private PerimetreCarreOperation perimetreCarre;
    /**
     * Constructeur pour initialiser une opération PerimetreCarre avec ses sommets.
     * Il crée une instance de PerimetreCarre avec les mêmes sommets.
     *
     * @param sommet1 Le premier sommet du Carre.
     * @param sommet2 Le deuxième sommet du Carre.
     * @param sommet3 Le troisième sommet du Carre.
     * @param sommet4 Le quatrième sommet du Carre.
     */
    public PerimetreLosangeOperation(Point sommet1, Point sommet2, Point sommet3, Point sommet4) {
        this.perimetreCarre = new PerimetreCarreOperation(sommet1, sommet2, sommet3, sommet4);
    }

    /**
     * Calcule le périmètre du Carre rectangle en utilisant l'opération PerimetreCarreQuelconque.
     *
     * @return Le périmètre du Carre rectangle.
     */
    @Override
    public Double calculer() {
        return perimetreCarre.calculer();
    }

    // Les autres méthodes non implémentées...
    
    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }

    @Override
    public int getArite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArite'");
    }

    @Override
    public void setArgument(int num, Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setArgument'");
    }

    @Override
    public Class getClassArgument(int num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClassArgument'");
    }


    @Override
    public void changerNom(String nouveauNom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changerNom'");
    }
    

}
