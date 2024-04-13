package geoanalytique.model.geoobject.operation;

import geoanalytique.model.Droite;
import geoanalytique.model.Point;
import geoanalytique.util.Operation;

/**
 * Cette classe est utilisée pour calculer le centre du cercle inscrit dans un triangle.
 */
public class CercleInscritOperation implements Operation{

    private Point point1;
    private Point point2;
    private Point point3;

    /**
     * Constructeur de la classe CalculCentreCercleInscrit.
     *
     * @param point1 Le premier point du triangle.
     * @param point2 Le deuxième point du triangle.
     * @param point3 Le troisième point du triangle.
     */
    public CercleInscritOperation(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    /**
     * Cette méthode calcule le centre du cercle inscrit dans le triangle.
     *
     * @return Le point représentant le centre du cercle inscrit.
     */

     /**Le centre du cercle circonscrit à un triangle est l'intersection des bissectrices des angles du triangle. */

     public Point calculer() {
        // Crée une instance de CalculBissectrice avec les trois points du triangle
        BissectriceTriangleOperation bissectrice = new BissectriceTriangleOperation(point1, point2, point3);
        
        // Calcule la bissectrice de l'angle au point1 (défini par les points point2, point3, point1)
        Droite bissectriceA = bissectrice.calculer();
        
        // Calcule la bissectrice de l'angle au point2 (défini par les points point3, point1, point2)
        Droite bissectriceB = bissectrice.calculer();
    
        // Renvoie le point d'intersection des deux bissectrices, qui est le centre du cercle inscrit dans le triangle
        IntersectionDroiteOperation intersection = new IntersectionDroiteOperation(bissectriceA, bissectriceB );
        return intersection.calculer();
    }

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