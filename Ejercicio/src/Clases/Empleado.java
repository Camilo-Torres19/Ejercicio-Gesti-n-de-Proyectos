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
public class Empleado {
   protected String dni;
   protected String nombres;
   protected String apellidos;
   protected String direccion;
   protected String telefonos;
   protected String email;
   protected Date fechaContrato;
   protected Empresa empresa;
   protected List<Proyecto> listaDeProyectos;
   protected List<Tarea> listaDeTareas;
}
