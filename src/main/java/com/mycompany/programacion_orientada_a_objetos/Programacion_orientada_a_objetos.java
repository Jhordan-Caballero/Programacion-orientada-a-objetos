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
        
        List<Lista_java> aviones = new ArrayList<>();
        aviones.add(new Lista_java("azul", 4));
        aviones.add(new Lista_java("rojo", 8));
        aviones.add(new Lista_java("verde",5));
        aviones.add(new Lista_java("blanco", 3));
        aviones.add(new Lista_java("negro", 4));
        aviones.add(new Lista_java("dorado", 8));
        aviones.add(new Lista_java("rosado", 2));
        aviones.add(new Lista_java("amarillo", 10));
        aviones.add(new Lista_java("violeta", 4));
        aviones.add(new Lista_java("plomo", 7));
        aviones.add(new Lista_java("naranja", 3));
        aviones.add(new Lista_java("celeste", 8));
        
        aviones.remove(2);
        
        Lista_java primerAvion = aviones.get(0);
        System.out.println("Primer avion: " + primerAvion.getClass());
        
        for (int i = 0; i< aviones.size(); i++){
        Lista_java avion = aviones.get(i);
        System.out.println("Indice " + i + avion.color()+ avion.tamaño);
    }
    }
}