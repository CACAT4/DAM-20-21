package Ejercicios;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author CFGS
 */
public class Actividad_Clase {
    
//AtomicInteger cont = new AtomicInteger(0);

public int ID = 1;
double nota = Math.random() * 9 + 1;
String apellido;
String nombre;
   
    public int getID() {
        return ID;
    }

    public double getnota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Actividad_Clase (int ID, double nota, String nombre, String apellido) {
        ID++;
        this.nombre=nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.ID=ID;
        
    }
    
        public Actividad_Clase ( String nombre, String apellido) {
           this.nombre=nombre;
           this.apellido = apellido;
        }
    
}
