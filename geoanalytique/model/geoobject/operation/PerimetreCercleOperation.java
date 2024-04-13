package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;

/**
 * Cette classe représente une opération pour calculer le périmètre d'un cercle.
 */
public class PerimetreCercleOperation implements Operation {
        
        private float rayon;
    
        /**
         * Constructeur pour initialiser une opération PerimetreCercle avec son rayon.
         *
         * @param rayon Le rayon du cercle.
         */
        public PerimetreCercleOperation(float rayon) {
            this.rayon = rayon;
        }
    
        /**
         * Calcule le périmètre du cercle.
         *
         * @return Le périmètre du cercle.
         */
        @Override
        public Double calculer() {
            return 2 * Math.PI * rayon;
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