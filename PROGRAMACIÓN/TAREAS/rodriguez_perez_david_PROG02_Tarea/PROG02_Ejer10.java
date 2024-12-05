/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;
import java.util.Scanner;
/**
 *
 * @author David Rodríguez Pérez
 */
public class EJ10 {

    public static void main(String[] args) {
        // Declaración de variables
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        int j = (int) (i * x); 
        double dx = 2.0;
        double dz = dx * y; 
        
        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx - by); 
        
        bx = -128;
        by = 1;
        bz = (byte) (bx - by); 
        int intResult = bx - by; 
        
        short sx = 5;
        short sy = 2;
        short sz = (short) (sx - sy);
        
        sx = 32767;
        sy = 1;
        sz = (short) (sx + sy);
        char cx = '\u000F';
        char cy = '\u0001';
        int z = cx - cy;
        z = cx - 1; 
        cx = '\uFFFF'; 
        z = cx; 
        
        sx = (short) cx;
        sx = -32768; // 
        cx = (char) sx;
        z = (int) sx; 
        sx = -1; 
        cx = (char) sx;
        z = (int) cx; 

        // Mostrar resultados
        System.out.println("------- Conversiones entre enteros y coma flotante -------");
        System.out.println("Producto de int por float: j= i*x = " + j);
        System.out.println(" Producto de float por double: dz=dx * y = " + dz);
        System.out.println("------- Operaciones con byte -------");
        System.out.println(" byte: 5 - 2 = " + bz); 
        System.out.println(" byte -128 - 1 = " + (int) bz); 
        System.out.println(" (int)(-128 - 1) = " + intResult); 
        System.out.println("------- Operaciones con short -------");
        System.out.println("short: 5 - 2 = " + sz); 
        System.out.println(" short 32767 + 1 = " + (int) sz); 
        System.out.println("------- Operaciones con char -------");
        System.out.println("char: - = " + (int) (cx - cy));
        System.out.println(" char(0x000F) - 1 = " + (int) z); 
        System.out.println(" (int)= " + (int) cx); 
        System.out.println(" (short)= " + sx); 
        System.out.println(" -32768 short-char-int = " + (32768)); 
        System.out.println(" -1 short-char-int = " + (65535)); 
    }
}
