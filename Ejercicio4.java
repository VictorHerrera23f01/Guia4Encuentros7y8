/*
Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.

Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
17 si es primo.

 */
package Guia4Encuentros7y8;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int num;
        
        System.out.print("Ingrese un numero a evaluar: ");
        num=leer.nextInt();
        
        if(numeroPrimo(num)){
            System.out.println("El numero es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    public static boolean numeroPrimo(int numero){
        for(int i=2; i<numero; i++){
            /* De esta manera nos aseguramos que el numero solo tenga el divisor
            1 y si mismo, por eso pasamos por alto el primer valor de i y el 
            ultimo porque queremos encontrar un divisor que no sea 1 y el mismo numero */
            if(numero%i==0){
                //si encuntra un divisor entre 1 y el numero ingresado no es primo
                return false;
            }
        }
        return true;
    }
    
}
