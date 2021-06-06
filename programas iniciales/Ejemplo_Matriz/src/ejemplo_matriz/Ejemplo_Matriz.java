/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_matriz;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Ejemplo_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejemplo de Matriz ");
        System.out.println("Ingrese la dimension de la matriz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matriz[][] = new int[n][n];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese un numero en la posicion ["+i+"] ["+j+"]: ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
            }
        }
        System.out.println("Matriz Original");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz Transpuesta");
        int aux;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){ if(i>j){
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("***************** ");
        System.out.println("***************** ");
        System.out.println("Ejemplo de Vector ");
        System.out.println("Ingrese la dimension del vector: ");
        int num = sc.nextInt();
        int[] vector = new int [num];
        int[] vectorOrd = new int [num];
        int i;
        int menor;
        for(i=0; i<num; i++)
        {
            System.out.println("Ingrese un numero en la posicion ["+i+"]: ");
            int valor2 = sc.nextInt();
            vector[i] = valor2;
        }
        System.out.println("Vector Original");
        System.out.println(Arrays.toString(vector));
        System.out.println("Vector Ordenado");
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));  
    }
}