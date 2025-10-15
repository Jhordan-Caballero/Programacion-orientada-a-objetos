/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacion_orientada_a_objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jcaba
 */
public class Programacion_orientada_a_objetos {
    public static void main(String[] args) {
        Avionturistico turistico1 = new Avionturistico("Boeing 737", 180);
        Avionturistico turistico2 = new Avionturistico("Airbus A320", 150);
        
        Avionmilitar militar1 = new Avionmilitar("Caza", "Misiles aire-aire");
        Avionmilitar militar2 = new Avionmilitar("Transporte", "Tropas y equipo");
        
        Avionprivado privado1 = new  Avionprivado ("esa XYZ", "Nueva York");
        Avionprivado privado2 = new Avionprivado("Familiar Perez", "Paris");
  
        Avion_3 [] aviones = {turistico1, turistico2, militar1, militar2, privado1, privado2};                                                                                   
        
        System.out.println("=== DEMOSTRACION DE AVIONES ===\n");
        
        // Probar todos los métodos
        for (Avion_3 avion : aviones) {
            avion.informacion();
            avion.despegar();
            avion.aterrizar();
            System.out.println("---");

}}}