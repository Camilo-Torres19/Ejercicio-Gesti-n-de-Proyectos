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
public class ManoDeObra {
    
    //Atributos de la clase
  
  private Empleado trabajador;
  private Proyecto proyecto;
  private Date fechaInicio;
  private Date fechaFin;
  private String rol;
  
  //Contructor por defecto
  
  public ManoDeObra(){
      
  }
  
  //Contrustor con Parametros
  
  public ManoDeObra(Empleado e, Proyecto p){
      trabajador = e;
      proyecto = p;
  }
}
