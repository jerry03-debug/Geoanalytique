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