/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author Santiago Ruiz 
 */
public class POOP4 {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        /**
         * Sirve para llamar a la clase Alumno, a sus atributos y a sus métodos.
         */
        Alumno alumno = new Alumno("Santiago","Computacion","sruizramirez.is@gmail.com",19, 320263635,3);
        alumno.horario(7);
        alumno.promedio(94);
        alumno.materias("A-106");
        alumno.examenes();
        alumno.tareas();
        System.out.println(alumno);
        
    }
    
}
