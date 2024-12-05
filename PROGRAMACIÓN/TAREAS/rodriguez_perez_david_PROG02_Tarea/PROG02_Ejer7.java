/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;
import java.util.Scanner;

/**
 *
 * @author David Rodríguez Pérez
 */
public class EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        double c1,c2;
        
        System.out.print("--- Calculadora de ecuación de primer grado ---\n");
        System.out.print("\"C1x +C2 = 0\"\n");
        System.out.print("Introduzca el valor para C1:");
        c1 = m.nextDouble();
        System.out.print("\nIntroduza el valor para C2:");
        c2 = m.nextDouble();
        
        //Cálculos
        if(c1 != 0 && c2 != 0){
            double x = -c2/c1;
            
            System.out.printf("El resultado de la operación es: %.2f", x);
            
        }else{
            System.out.print("El valor de C1 o C2 no puede ser 0");
        }
        
    }
    
}
