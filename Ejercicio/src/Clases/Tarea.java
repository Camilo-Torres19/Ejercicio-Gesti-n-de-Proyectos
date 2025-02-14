/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;
import java.util.List;

/**
 *
 * @author camilo.torreso
 */
public class Tarea {
    //Atributos de la clase
  private String descripcion;
  private String tipo;
  private Date fechaInicioEstimada;
  private Date fechaInicioReal;
  private int duracionEstimada;
  private int DuracionReal;
  private List<Empleado> listaDeEmpleados;
  private Proyecto proyecto;
  private List<Documento> listaDeDocumentos;
  
  //Contructor por defecto
 
  public Tarea(){
     
 }
 
 //Contrustor con Parametros
 
 public Tarea(String d, String t){
     descripcion = d;
     tipo = t;
 }
}
