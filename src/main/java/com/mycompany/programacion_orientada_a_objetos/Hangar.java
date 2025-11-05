/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_orientada_a_objetos;

/**
 *
 * @author jcaba
 */
class Hangar<T> {
    private T avion;

    public Hangar(T avion) {
        this.avion = avion;
    }

    public T getAvion() {
        return avion;
    }

    public void setAvion(T avion) {
        this.avion = avion;
    }

    public void mostrarAvion() {
        System.out.println("El hangar contiene: " + avion.toString());
    }

    public <U> void mostrarInformacionExtra(U info) {
        System.out.println("Información adicional: " + info);
    }
}