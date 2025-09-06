/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_orientada_a_objetos;

import java.util.Objects;

/**
 *
 * @author jcaba
 */
public class Avion {

    static String getTotalAviones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String modelo;
    private int año;
    private String empresa;

    Avion(String boeing_747, int i, String boeing) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Avion(Avion avion1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
    // Sobrescritura de hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(modelo, año, empresa);
    }
    
    // Método para verificar si el avión es moderno
    public boolean esModerno() {
        return año >= 2000;
    }
    
    // Método para mostrar antigüedad
    public int calcularAntiguedad(int añoActual) {
        return añoActual - año;
    }

    boolean obtenerInfoCompleta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

