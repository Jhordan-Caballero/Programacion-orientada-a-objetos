/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_orientada_a_objetos;

/**
 *
 * @author jcaba
 */

    interface ComportamientoVuelo {
    void ejecutarManiobra(String nombreAvion);
}

public class Lambda {
    // Mismo método de control
    static void controlarVuelo(String avion, ComportamientoVuelo comportamiento) {
        System.out.print("Torre de control ordena: ");
        comportamiento.ejecutarManiobra(avion);
  public static void main(String[] args) {
        // ¡Con lambda podemos crear comportamientos al vuelo!
        
        // Despegues
        controlarVuelo("IBE-123", (avion) -> 
            System.out.println(avion + " → Despegando con potencia media"));
            
        controlarVuelo("EZY-999", (avion) -> 
            System.out.println(avion + " → 🚀 Despegue rápido! Máxima potencia"));
        
        // Aterrizajes
        controlarVuelo("UAL-456", (avion) -> 
            System.out.println(avion + " → ⚠️ Aterrizaje emergencia. Todo listo"));
            
        controlarVuelo("BAW-777", (avion) -> 
            System.out.println(avion + " → Aterrizaje suave en pista 27L"));
        
        // Maniobras especiales
        controlarVuelo("RED-789", (avion) -> 
            System.out.println(avion + " → 🎯 Realizando looping a 5000 pies"));
            
        controlarVuelo("FTR-001", (avion) -> {
            System.out.println(avion + " → 🛩️ Iniciando maniobras acrobáticas:");
            System.out.println("   - Barrel roll completado");
            System.out.println("   - Vuelo invertido activado");
        });
        
        // Patrones de espera
        controlarVuelo("DLH-888", (avion) -> 
            System.out.println(avion + " → ⭕ Manteniendo patrón de espera a 10000 pies"));
    }
}