/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;
import java.util.Scanner;
/**
 *
 * @author David Rodríguez Pérez
 */
public class EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x,y;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el valor de x: ");
        x = entrada.nextDouble();
        System.out.print("Introduzca el valor de y:");
        y = entrada.nextDouble();
        System.out.print("Valores introducidos: x = " + x + "y = " + y + "\n");
        
        
        double suma = x + y;
        double resta = x - y;
        double multiplicacion = x * y;
        double division = x / y ; 
        double potencia = Math.pow(x, 2);
        double raizCuadrada = Math.sqrt(x);

        // Mostrar resultados
        System.out.printf("x = %.1f%n", x);
        System.out.printf("y = %.1f%n", y);
        System.out.printf("x + y = %.1f%n", suma);
        System.out.printf("x - y = %.1f%n", resta);
        System.out.printf("x * y = %.1f%n", multiplicacion);
        System.out.printf("x / y = %.1f%n", division);
        System.out.printf("x ^ 2 = %.1f%n", potencia);
        System.out.printf("√y = %.1f%n", raizCuadrada);
        
    }
    
}
