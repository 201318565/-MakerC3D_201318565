package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
        private String EtVerdadera;
            private String EtFalsa;

    public NodoC3D(String cad) {
        this.cad = cad;
 
    }
    
    
       public NodoC3D(String cadena, String EtVerdadera,String EtFalsa) {
           this.cad = cadena;
           this.EtVerdadera = EtVerdadera;
        this.EtFalsa = EtFalsa;
                
    }
    
    public String getCad(){
        return cad;        
    }
        public String getVerdadero(){
        return EtVerdadera;        
    }
    
            public String getFalso(){
        return EtFalsa;        
    }
}
