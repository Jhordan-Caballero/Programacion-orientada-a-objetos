/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacion_orientada_a_objetos;

/**
 *
 * @author jcaba
 */
public class Programacion_orientada_a_objetos {

    public static void main(String[] args) {
        Avion avion1 = new Avion();
        avion1.setModelo("Boeing 747");
        avion1.setAño(2018);
        avion1.setEmpresa("Sky");
        
        System.out.println("Modelo: " + avion1.getModelo());
        System.out.println("Año: " + avion1.getAño());
        System.out.println("Empresa: " + avion1.getEmpresa());
        
        Avion avion2 = new Avion();
        avion2.setModelo("Boeing 737");
        avion2.setAño(2020);
        avion2.setEmpresa("Latam");
        
        System.out.println("Modelo: " + avion2.getModelo());
        System.out.println("Año: " + avion2.getAño());
        System.out.println("Empresa: " + avion2.getEmpresa());
        
        Avion avion3 = new Avion();
        avion3.setModelo("Airbus A320");
        avion3.setAño(2015);
        avion3.setEmpresa("Avianca");
        
        System.out.println("Modelo: " + avion3.getModelo());
        System.out.println("Año: " + avion3.getAño());
        System.out.println("Empresa: " + avion3.getEmpresa());
        
        Avion avion4 = new Avion();
        avion4.setModelo("Airbus A380");
        avion4.setAño(2013);
        avion4.setEmpresa("Sky");
        
        System.out.println("Modelo: " + avion4.getModelo());
        System.out.println("Año: " + avion4.getAño());
        System.out.println("Empresa: " + avion4.getEmpresa());
        
        Avion avion5 = new Avion();
        avion5.setModelo("Concorde");
        avion5.setAño(2019);
        avion5.setEmpresa("Latam");
        
        System.out.println("Modelo: " + avion5.getModelo());
        System.out.println("Año: " + avion5.getAño());
        System.out.println("Empresa: " + avion5.getEmpresa());
    }
}
