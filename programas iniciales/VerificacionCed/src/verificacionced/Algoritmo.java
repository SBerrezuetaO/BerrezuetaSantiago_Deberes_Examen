/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificacionced;

/**
 *
 * @author santy
 */
public class Algoritmo {
    public static String valida(String x){
    int suma=0;
    if(x.length()!=10){
      System.out.println("Ingrese su cedula de 10 digitos");
      return "Cedula no Verificada";
    }else{

      int a[]=new int [x.length()/2];
      int b[]=new int [(x.length()/2)];
      int c=0;
      int d=1;
      //transformacion de String a Int
      for (int i = 0; i < x.length()/2; i++) {
        a[i]=Integer.parseInt(String.valueOf(x.charAt(c)));
        c=c+2;
        if (i < (x.length()/2)-1) {
          b[i]=Integer.parseInt(String.valueOf(x.charAt(d)));
          d=d+2;
        }
      }
   
      for (int i = 0; i < a.length; i++) {//se usa los 9 difgitos de la cedula
        a[i]=a[i]*2;//si es impar se multiplica por 2
        if (a[i] >9){
          a[i]=a[i]-9;//si es mayor a nueve el resultado se resta 9
        }
        suma=suma+a[i]+b[i];//se suman todos los resultados
      } 
      int aux=suma/10;
      int dec=(aux+1)*10;
      if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length()-1))))
          return "Cedula Verificada";//el resultado se resta de la decena inmediata superior y debe ser el decimo digito
      else
        if(suma%10==0 && x.charAt(x.length()-1)=='0'){
          return "Cedula Verificada";//si la suma es 10, es cero su ultimo digito
          
        }else{
          return "Cedula no Verificada";//no cumple con el resultado el ultimo digito
        }
    }
    }
}
