/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author HP
 */
public class Estudiante extends Persona {
    private final int codigoEstudiante;
    private final float notaFinal;
//constructor
    public Estudiante(int codigoestudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoestudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Codigo Estudiante:"+ codigoEstudiante+
                "/nNotaFinal:"+notaFinal+
                "/nNombre:"+getNombre()+
                "/nApellido:"+getApellido()+
                "/nEdad:"+getEdad( ));
    }
    
}
