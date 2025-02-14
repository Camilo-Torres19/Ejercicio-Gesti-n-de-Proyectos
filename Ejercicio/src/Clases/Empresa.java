/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author camilo.torreso
 */
public class Empresa {
    //Atributos de la clase
   private String nit;
   private String nombre;
   private String tipo;
   private String web;
   private int telefono;
   private String email;
   private String direccion;
   private List<Proyecto> listaDeProyectos;
   private List<Empleado> listaDeEmpleados;
   
   //Contructor por defecto
  
   public Empresa(){
       
   }
   
   //Contrustor con Parametros
   
   public Empresa(String nit, String nombre){
       this.nit = nit;
       this.nombre = nombre;
   }
   
}
