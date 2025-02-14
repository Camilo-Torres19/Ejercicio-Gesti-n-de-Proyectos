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
public class Promotor extends Empleado {
    //Promotor es una clase heredada de la clase empleado
    //Atributos de la clase 
    private List <Proyecto> listaDeProyectos;
    
    //Contructor por defecto
    
    public Promotor(){
        super(); // este metodo es una llamada a un método constructor de la clase padre.
    }
    
    //Contrustor con Parametros
    
    public Promotor(String n, String a){
        super(n,a);
    }
}
