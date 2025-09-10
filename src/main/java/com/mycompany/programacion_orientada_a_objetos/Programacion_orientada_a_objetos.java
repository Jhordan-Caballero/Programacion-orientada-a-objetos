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
    private static List<Avion> aviones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        inicializarAviones();
        mostrarMenu();
    }
    
    private static void inicializarAviones() {
        aviones.add(new Avion("Boeing 747", 2018, "Sky"));
        aviones.add(new Avion("Boeing 737", 2020, "Latam"));
        aviones.add(new Avion("Airbus A320", 2015, "Avianca"));
        aviones.add(new Avion("Airbus A380", 2013, "Sky"));
        aviones.add(new Avion("Concorde", 2019, "Latam"));
    }
    
    private static void mostrarMenu() {
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Mostrar aviones");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        mostrarAviones();
                        break;
                    case 2:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                opcion = 0;
            }
            
        } while (opcion != 2);
    }
    
    private static void mostrarAviones() {
        System.out.println("\n=== LISTA DE AVIONES ===");
        
        if (aviones.isEmpty()) {
            System.out.println("No hay aviones registrados.");
        } else {
            for (int i = 0; i < aviones.size(); i++) {
                System.out.println((i + 1) + ". " + aviones.get(i));
            }
        }
    }
}
