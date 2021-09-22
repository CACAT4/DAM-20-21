package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner es = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int num1 = es.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int num2 = es.nextInt();        
        
         int contDivision = 1;
         int contPrimo= 0;
         for (int i = num1; i <= num2; i++) {   
                while(contDivision<=num2){
                   int numResultado = i%contDivision; 
                    contDivision++;
                        if (numResultado == 0) {
                              contPrimo++ ;
                         } else if (contPrimo != 2 ) {
                              System.out.println(i);
                              break;
                         }  
                }
             
   
               
             
            
            
          }
     
        
        
        
        
        
        
        
        
        
        
        
        /*   for (int i = num1; i <= numPedido ; i++) {
                int numRes = numPedido%i;
           
               if (numRes == 0) {
                   cont++;
               }                 
            }          
                  if (cont>2) {
                   System.out.println("El número NO es primo.");
               } else if (cont == 2) {
                   System.out.println("El número ES primo.");
               }       */
         
        
        
        
        
        
    }// Fin del main

} // Fin de la clase Ejercicio21
