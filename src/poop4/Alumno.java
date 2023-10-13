/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Santiago Ruiz
 * Clase que contiene los métodos de lo que hace un alumno
 */
public class Alumno {
    
    public String nombre, carrera, correo;
    public int edad, numDeCuenta, semestre;
    
    /**
     * Constructor vacio de Alumno
     */
    public Alumno(){}
    /**
     * Constructor lleno de Alumno
     * @param nombre Nombre del alumno en String
     * @param carrera Carrera del alumno en String
     * @param correo Correo del alumno en String
     * @param edad Edad del alumno en primitivo entero
     * @param numDeCuenta Número de cuenta del alumno en primitivo entero
     * @param semestre Número del semestre que cursa el alumno en primitivo entero 
     */
    
    public Alumno(String nombre, String carrera, String correo, int edad, int numDeCuenta, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.correo = correo;
        this.edad = edad;
        this.numDeCuenta = numDeCuenta;
        this.semestre = semestre;
    } 
    /**
     * Metodo horario
     * @param horas Regresa a que hora entra el alumno
     */
     public void horario (int horas){
          System.out.println("Hoy entro a las "+horas+" horas");
     }
     /**
      * Metodo promedio
      * @param x Regresa el promedio del alumno
      */
     public void promedio (int x){
          System.out.println("Mi promedio es de "+x);
     }
     /**
      * Metodo materias
      * @param salon Regresa en que salón tendrá una materia el alumno
      */
     public void materias (String salon){
          System.out.println("Mi clase calculo me toca en el salon "+salon);
     }
     /**
      * Metodo examenes
      * Imprime que examen tendrá el alumno
      */
     public void examenes ( ){
          System.out.println("Tengo examen de cultura y comunicacion");
     }
     /**
      * Metodo tareas
      * Imprime que tareas tiene el alumno
      */
     public void tareas ( ){
          System.out.println("Tengo una serie de calculo de tarea");
     }
     /**
      * Método sobreescrito que muestra los valores de los atributos
      * @return Regresa una cadena con los datos del alumno
      */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", carrera=" + carrera + ", correo=" + correo + ", edad=" + edad + ", numDeCuenta=" + numDeCuenta + ", semestre=" + semestre + '}';
    }
     
}
