/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados para imprimirlos en el 
main.
 */
package Guia4Encuentros7y8;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int num1,num2,opc;
        System.out.print("Ingrese el Primer numero: ");
        num1=leer.nextInt();
        System.out.print("Ingrese el Segundo numero: ");
        num2=leer.nextInt();
        
        //llamamos al subprograma menu que no devuelve ningun valor solo se ejecuta
        //lo que tiene dentro y luego leemos la opcion por teclado
        menu();
        opc=leer.nextInt();
        
        //segun halla sido su opción elegida sera su sentencia a imprimir por pantalla
        switch(opc){
            case 1:
                System.out.println("La suma es de: "+sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta es de: "+restar(num1,num2));
                break;
            case 3:
                System.out.println("El producto es de: "+producto(num1,num2));
                break;
            case 4:
                //nos aseguramos que la division sea coherente
                if(num2!=0){
                    System.out.println("El cociente es de: "+cociente(num1,num2));
                    break;
                }else{
                    System.out.println("No se puede dividir entre cero!!");
                }
        }
        //no nos olvidemos de cerrar el objeto Scanner
        leer.close();
    }    
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1_Sumar");
        System.out.println("2_Restar");
        System.out.println("3_Multiplicar");
        System.out.println("4_Dividir");
        System.out.print("Ingrese una opcion a seguir: ");
    }    
    public static int sumar(int x,int y){
        return (x+y);
    }
    public static int restar(int x, int y){
        return (x-y);
    }
    public static int producto(int x, int y){
        return (x*y);
    }
    public static float cociente(float x, float y){
        // Lo que se hace aqui es recibir los datos como reales para que admita
        // decimales y para devolver un valor en decimales si fuera el caso.
        float cociente= Math.round((x/y)*100.0f)/100.0f;
        return (cociente);
    }
}
