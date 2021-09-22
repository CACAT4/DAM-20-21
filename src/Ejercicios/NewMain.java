package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author CFGS
 */

public class NewMain {
    public static void main(String[] args) {
        String titulo = "Introduccion ";
        String mensajeInicial = "holA k asE ";
        String mensaje = "Por favor, introduce una frase ";
         String mensaje2 = " Elija entre mayusculas y minusculas";    
          
        
        JOptionPane.showInputDialog(titulo, args);
        //JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.MESSAGE_TYPE_PROPERTY(), null, args, null);
        JOptionPane.showInputDialog(mensaje, mensajeInicial);
        JOptionPane.showOptionDialog(null, mensaje2, titulo, 0, 0 , null, args, mensajeInicial);

        
    }// Fin del main


} // Fin de la clase NewMain
