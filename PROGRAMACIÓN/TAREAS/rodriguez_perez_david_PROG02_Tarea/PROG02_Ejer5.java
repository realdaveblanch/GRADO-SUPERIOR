/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Pérez
 * En este código se pide al usuario dos inputs y se comprueba si uno es múltiplo del otro
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int a,b;
        String resultado;
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("--- Comprobación de multiplos ---\n");
        System.out.print("Indica si el primer número es múltiplo del segundo.\n\n");
        System.out.print("Introduzca el primer número :");
        a = teclado.nextInt();
        System.out.print("\n\nIntroduzca el segundo número :");
        b = teclado.nextInt();
        
        //Opereaciones
        resultado = (a % b == 0)? "es múltiplo" : "no es múltiplo";
        
        //Result
        System.out.print("--- Resultado ---\n");
        System.out.printf("El número %d, %s de %d.\n", a, resultado, b);
        
        
    }//Cierre del método
    
}//Cierre de la clase
