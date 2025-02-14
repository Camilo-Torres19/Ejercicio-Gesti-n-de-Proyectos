/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.*;

/**
 *
 * @author camilo.torreso
 */
public class Proyecto {
    //Atributos de la clase
  private String nombreClave;
  private String denominacion;
  private Date fechaInicio;
  private Date fechaFin;
  private String estado;
  private Empresa empresa;
  private List<Empleado> listaDeEmpleados;
  private Promotor empleadoPromotor;
  private List<Tarea> listaDeTareass;
  
  //Contructor por defecto
 
  public Proyecto(){
     
 }
 
 //Contrustor con Parametros
 
 public Proyecto(String nombreClave, String deno){
     this.nombreClave = nombreClave;
     this.denominacion = deno;
 }
}
