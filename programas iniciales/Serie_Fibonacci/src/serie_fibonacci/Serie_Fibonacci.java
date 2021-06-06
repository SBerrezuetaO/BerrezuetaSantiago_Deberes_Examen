/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serie_fibonacci;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Serie_Fibonacci {
    
public Scanner teclado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Serie de Fibonacci de 12 elemento");
        int elementos = 12; //se puede editar el numero de elementos de la serie
        int num1=0;
        int num2=1;
        int suma=1;
        
        for(int i=1; i<elementos; i++){
            System.out.println(num1);
            suma = num1 +num2;
            num1 = num2;
            num2 = suma; 
        }
        
        
        
    }
    
}
