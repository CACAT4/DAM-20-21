package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */

public class Ejercicio20 {
    public static void main(String[] args) {
        
        Scanner es = new Scanner(System.in);
        System.out.println("Introduzca el numero que desea comprobar: ");
        int numPedido = es.nextInt();
        int cont = 0;
            for (int i = 1; i <= numPedido ; i++) {
                int numRes = numPedido%i;
           
               if (numRes == 0) {
                   cont++;
               }                 
            }          
                  if (cont>2) {
                   System.out.println("El número NO es primo.");
               } else if (cont == 2) {
                   System.out.println("El número ES primo.");
               }

    }// Fin del main

} // Fin de la clase Ejercicio20
