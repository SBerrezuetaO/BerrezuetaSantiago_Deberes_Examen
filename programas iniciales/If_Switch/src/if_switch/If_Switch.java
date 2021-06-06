/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_switch;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class If_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejemplo Etructuras If");
        System.out.println("Ingrese su edad: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt(); //la edad ingresada
        if(valor<12){
            System.out.println("Entras en la categoria Niño");
        }else if (12<=valor && valor<=18){
            System.out.println("Entras en la categoria Adolecente");
        }else if(18<valor && valor<=65){
            System.out.println("Entras en la categoria Adulto");
        }else{
            System.out.println("Entras en la categoria Adulto Mayor");
        }
        
        
        System.out.println("Ejemplo Etructuras Switch");
        System.out.println("Elija un numero dia de la semana(1,2,3,4,5,6,7): ");
        int dia = sc.nextInt(); //la edad ingresada
        switch(dia){
            case 1:System.out.println("Hoy es Lunes");
            break;
            case 2:System.out.println("Hoy es Martes");
            break;
            case 3:System.out.println("Hoy es Miercoles");
            break;
            case 4:System.out.println("Hoy es Jueves");
            break;
            case 5:System.out.println("Hoy es Viernes");
            break;
            case 6:System.out.println("Hoy es Sabado");
            break;
            case 7:System.out.println("Hoy es Domingo");
            break;
        }
    }
    
}
