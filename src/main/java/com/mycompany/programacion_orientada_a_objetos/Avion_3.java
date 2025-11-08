/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_orientada_a_objetos;

/**
 *
 * @author jcaba
 */
    interface Avion_3 {
        void despegar(); 
        void aterrizar();
        default void informacion (){
            System.out.println("Este avion es generico");
        }      
    }

    class Avionturistico implements Avion_3 {
        private String modelo;
        private int capacidad;
        public Avionturistico (String modelo, int capacidad){
            this.modelo = modelo;
            this.capacidad = capacidad;         
        }

    @Override 
    public void despegar (){
     System.out.println("Avion turistico" + modelo + "despegando con" + capacidad + "de capacidad de paasajeros");
        }
    @Override 
    public void aterrizar (){
    System.out.println("Avion turistico" + modelo + "aterrizando suavemente");
        }
    @Override 
    public void informacion (){
    System.out.println("Avion turistico modelo = " + modelo + "con capacidad de " + capacidad );
        }
    }

     class Avionprivado implements Avion_3 {
         private String propietario;
         private String destino;
         public Avionprivado (String propietario, String destino){
                 this.propietario = propietario;
                 this.destino = destino;
         }             

    @Override 
    public void despegar (){
     System.out.println("Avion privado de" + propietario + "con destino a " + destino);
        }
    @Override 
    public void aterrizar (){
    System.out.println("Avion a punto de aterrizar al destino " + destino);
        }   
    }
    class AvionMilitar implements Avion_3 {
        private String tipo;
        private String armamento;
        public AvionMilitar (String tipo, String armamento){
            this.tipo = tipo;
            this.armamento= armamento;         
        }

    @Override 
    public void despegar (){
     System.out.println("Avion militar tipo " + tipo + "despegando con armamento " + armamento + "de manera sigilosa");
        }
    @Override 
    public void aterrizar (){
    System.out.println("Avion militar despegando con municion" + armamento + "a punto de ser usado");
        }
    @Override 
    public void informacion (){
    System.out.println("Avion turistico tipo = " + tipo + "con municion =  " + armamento );
        }
    }
