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

    @Override
    public void deplacer(int newX, int newY) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deplacer'");
    }

    @Override
    public double distanceAUnPoint(Point otherPoint) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'distanceAUnPoint'");
    }

    @Override
    public Point milieu(Point point1, Point point2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'milieu'");
    }

    @Override
    public void changerNom(String nouveauNom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changerNom'");
    }
    
}
