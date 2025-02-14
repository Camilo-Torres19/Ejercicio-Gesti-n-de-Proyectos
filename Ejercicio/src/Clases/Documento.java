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
public class Documento {
    //Atributos de la clase
  private String codigo;
  private String descripcion;
  private String tipo;
  private Tarea tarea;
  private List<Version> listaDeVersiones;
  
  //Contructor por defecto
 
  public Documento(){
      
  }
  
  //Contrustor con Parametros
  
  public Documento(String c, String d){
      this.codigo = c;
      this.descripcion= d;
  }
}
