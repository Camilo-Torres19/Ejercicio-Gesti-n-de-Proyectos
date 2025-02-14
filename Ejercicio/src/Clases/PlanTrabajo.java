/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 *
 * @author camilo.torreso
 */
public class PlanTrabajo {
    
  //Atributos de la clase
  
  private Tarea tarea;
  private Empleado trabajador;
  private Date fechaInicio;
  private Date fechaFin;
  private String descripcion;
  
  //Contructor por defecto
 
  public PlanTrabajo(){
      
  }
  
  //Contrustor con Parametros 
 
  public PlanTrabajo(Tarea t, Empleado emple){
      tarea = t;
      trabajador = emple;
  }
}
