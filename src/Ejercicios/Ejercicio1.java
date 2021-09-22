package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI = 3.141516;
        
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduzca el radio de el círculo para calcular su área: ");
        double ra = esc.nextDouble();
      
        double res = ra * ra * PI;
        System.out.println("El resultado del área de " + ra + " es: " + res);
         esc.close();
    }// Fin del main

} // Fin de la clase Ejercicio1
