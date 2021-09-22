package Ejercicios;
import Ejercicios.Actividad_Clase;

/**
 *
 * @author CFGS
 */

public class Actividad {
    public static void main(String[] args) {
    
       Actividad_Clase a1 = new Actividad_Clase( "Frankz", "Bañon" ); 
       Actividad_Clase a2 = new Actividad_Clase("Carlos ", "Bermejo" );        
       Actividad_Clase a3 = new Actividad_Clase("Diego", "Caceres" ); 
       Actividad_Clase a4 = new Actividad_Clase("Victor ", "Caja" );    
       Actividad_Clase a5 = new Actividad_Clase("Constantin", "Carabut" ); 
       Actividad_Clase a6 = new Actividad_Clase("Victor Manuel", "De Pablo" );    
       Actividad_Clase a7 = new Actividad_Clase("Jorge", "Gonzalez" ); 
       Actividad_Clase a8 = new Actividad_Clase("Sergio ", "Gutierrez" );    
       Actividad_Clase a9 = new Actividad_Clase("Miguel Angel", "Martin" ); 
       Actividad_Clase a10 = new Actividad_Clase("Alejandro", "Plaza" );    
       Actividad_Clase a11 = new Actividad_Clase("Eizan", "Rosa" ); 
       Actividad_Clase a12 = new Actividad_Clase("Pedro Enrique ", "Vidal" );           
        
        
        System.out.printf(" %d              %s                  %s                  %.2f  %n", a1.ID, a1.nombre, a1.apellido, a1.getnota());
        System.out.printf(" %d              %s                  %s                  %.2f  %n", a2.ID, a2.nombre, a2.apellido, a2.getnota());
        System.out.printf(" %d              %s                  %s                  %.2f  %n", a3.ID, a3.nombre, a3.apellido, a3.getnota());
        System.out.printf(" %d              %s                  %s                  %.2f  %n", a4.ID, a4.nombre, a4.apellido, a4.getnota());

        
        
        
    }// Fin del main

} // Fin de la clase Actividad
