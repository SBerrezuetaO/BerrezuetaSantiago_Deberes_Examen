/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruct_repeticion;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Estruct_Repeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tablas de multiplicar con las estructuras de repeticion.");
        Scanner sc = new Scanner(System.in);
        int n;
        int b=1;
        int c;
        System.out.print("Introduce un número entero: ");                                                         
        n = sc.nextInt();//el numero del que se sacara la tabla
        System.out.println("Tabla del " + n + " con For");
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
        System.out.println("Tabla del " + n + " con while");
        while (b <= 10) { 
            c = (n * b) ; 
            System.out.println (n + " * " + b + " = " + c ) ; 
            b++; 
        } 
        System.out.println("Tabla del " + n + " con do while");
        b=1;
        c=0;
        do{ 
            c = (n * b) ; 
            System.out.println (n + " * " + b + " = " + c ) ; 
            b++; 
        }while (b <= 10);
    }
    
}
