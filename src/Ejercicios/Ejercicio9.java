package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author CFGS
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        final double IVA = 0.21;

        Scanner esc = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto para calcular el importe + IVA: ");
        double r = esc.nextDouble();

        double res = r * IVA + r;
        System.out.println("El precio final es; " + res);

    }// Fin del main

} // Fin de la clase Ejercicio9
