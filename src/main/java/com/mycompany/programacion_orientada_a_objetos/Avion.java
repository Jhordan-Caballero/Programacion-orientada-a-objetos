

package com.mycompany.programacion_orientada_a_objetos;

import java.util.Objects;

/**
 *
 * @author jcaba
 */
public class Avion {

    static String getTotalAviones() {
        
        return null;
        
    }
    private String modelo;
    private int año;
    private String empresa;

<<<<<<< HEAD
    Avion(String modelo, int año, String empresa1
    ) {
=======
    Avion(String modelo, int año, String empresa) {
>>>>>>> 58df784c0ee46ef3af421c07c588bb830d8bb670
        
    }

       public void setModelo (String modelo){
           this.modelo = modelo;
       }
       public String getModelo (){
           return modelo;
       }
       public void setAño (int año){
           this.año = año;
       }
       public int getAño () {
           return año;
       }
       public void setEmpresa (String empresa){
           this.empresa = empresa;
       }            
       public String getEmpresa (){
           return empresa;
       }
       @Override
    public String toString() {
        return "Avion{" +
               "modelo='" + modelo + '\'' +
               ", año=" + año +
               ", empresa='" + empresa + '\'' +
               '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Avion avion = (Avion) obj;
        return año == avion.año &&
               Objects.equals(modelo, avion.modelo) &&
               Objects.equals(empresa, avion.empresa);
    }
    
  
    @Override
    public int hashCode() {
        return Objects.hash(modelo, año, empresa);
    }
    
  
    public boolean esModerno() {
        return año >= 2000;
    }
    

    public int calcularAntiguedad(int añoActual) {
        return añoActual - año;
    }

   
}

