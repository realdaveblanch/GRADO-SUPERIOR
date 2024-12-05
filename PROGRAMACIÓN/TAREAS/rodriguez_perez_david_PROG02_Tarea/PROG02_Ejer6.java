/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

/**
 *
 * @author David Rodríguez Pérez
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        enum meses{Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre};
        
        //Variable de tipo m y se le asigna el mes de Marzo
        meses m = meses.Marzo;
        System.out.print("Valor de m pre-reasignación: " + m + "\n");
        
        //Se asigna a la variable m el valor del string "MARZO"
        m = meses.valueOf("Marzo");
        System.out.print("Valor de m tras reasignar a string: " + m + "\n");
        
        
        
        
        
    }
    
}
