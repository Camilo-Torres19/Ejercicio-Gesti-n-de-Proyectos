/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.util.Date;

/**
 *
 * @author camilo.torreso
 */
public class Version {
    //Atributos de la clase
  private Date fecha;
  private String descripcion;
  private File archivo;
  private Documento docuemnto;

  //Contructor por defecto
  public Version(){
      
  }
  
  public Version(Date fecha, String desc){
      this.fecha = fecha;
      descripcion = desc;
  }

}
