/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion_orientada_a_objetos;

/**
 *
 * @author jcaba
 */
public class Avion {
    private String modelo;
    private int año;
    private String empresa;
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
}
