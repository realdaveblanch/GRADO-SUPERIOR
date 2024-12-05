/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;
import java.util.Scanner;
/**
 *
 * @author David Rodríguez Pérez
 */
public class EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x, uno,dos,tres,cuatro,cinco;
        int digitos;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número de 5 dígitos para x: ");
        x = entrada.nextLine();
        
        if(x.length() != 5){
            System.out.print("El número no es de 5 dígitos.");
        }else{
            if(x.isBlank()){
                System.out.print("El número no puede estar vacío.");
            }else{
                System.out.print("Los dígitos separados son: ");
                uno = x.substring(0,1);
                dos = x.substring(1,2);
                tres = x.substring(2,3);
                cuatro = x.substring(3,4);
                cinco = x.substring(4,5);
                
                System.out.printf("%s %s %s %s %s", uno,dos,tres,cuatro,cinco);
            }
        }
    }
    
}
