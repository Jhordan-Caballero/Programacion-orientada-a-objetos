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
    public Avion_turistico (String modelo, int capacidad){
        this.modelo = modelo;
        this.capacidad = capacidad;         
    }
}
@Override 
public void despegar (){
 System.out.println("Avion turistico" + modelo "despegando con" + capacacidad + "de capacidad de paasajeros")
}
@Override 
public void aterrizar (){
System.out.println("Avion turistico" + modelo "aterrizando suavemente")
}
@Override 
public void informacion (){
System.out.println("Avion turistico modelo = " + modelo "con capacidad de " + capacacidad )
}
