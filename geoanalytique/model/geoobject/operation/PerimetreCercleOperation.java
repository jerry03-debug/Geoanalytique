package geoanalytique.model.geoobject.operation;

import geoanalytique.util.Operation;

public class PerimetreCercleOperation implements Operation {
        
        private float rayon;
    
        public PerimetreCercleOperation(float rayon) {
            this.rayon = rayon;
        }
    
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
