/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_orientada_a_objetos;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
interface Avion_2 {
    void despegar();   
    void aterrizar();  
    void volar();       
}


class AvionComercial implements Avion_2 {
    private String modelo;
    private int capacidad;
    private String aerolinea;

  
    public AvionComercial(String modelo, int capacidad, String aerolinea) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.aerolinea = aerolinea;
    }

    @Override
    public void despegar() {
        System.out.println(modelo + " de " + aerolinea + " esta despegando con " + capacidad + " pasajeros.");
    }

    @Override
    public void aterrizar() {
        System.out.println(modelo + " de " + aerolinea + " ha aterrizado.");
    }

    @Override
    public void volar() {
        System.out.println(modelo + " de " + aerolinea + " esta volando a gran altura.");
    }
}


class AvionMilitar implements Avion_2 {
    private String modelo;
    private int capacidad;
    private String pais;

   
    public AvionMilitar(String modelo, int capacidad, String pais) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.pais = pais;
    }

    @Override
    public void despegar() {
        System.out.println("Avion militar " + modelo + " del pais " + pais + " está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("Avion militar " + modelo + " del pais " + pais + " ha aterrizado.");
    }

    @Override
    public void volar() {
        System.out.println("Avion militar " + modelo + " del pais " + pais + " esta realizando maniobras a alta velocidad.");
    }
}
