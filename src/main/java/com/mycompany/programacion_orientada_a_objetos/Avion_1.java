/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_orientada_a_objetos;

/**
 *
 * @author LAB-USR-AREQUIPA
 */

   abstract class Avion_1 {
    public String modelo;
    public int capacidad;

    public Avion_1(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public void volar() {
        System.out.println(modelo + " está volando a gran altura.");
    }

    public abstract void despegar();
}


class AvionComercial extends Avion_1{
    private String aerolinea;

    public AvionComercial(String modelo, int capacidad, String aerolinea) {
        super(modelo, capacidad);
        this.aerolinea = aerolinea;
    }

    @Override
    public void despegar() {
        System.out.println(modelo + " de " + aerolinea + " esta despegando con " + capacidad + " pasajeros.");
    }
}


class AvionMilitar extends Avion_1{
    private String pais;

    public AvionMilitar(String modelo, int capacidad, String pais) {
        super(modelo, capacidad);
        this.pais = pais;
    }

    @Override
    public void despegar() {
        System.out.println("Avión militar " + modelo + " del pais " + pais + " esta despegando.");
    }
}


