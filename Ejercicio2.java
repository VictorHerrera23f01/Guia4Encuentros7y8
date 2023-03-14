/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package Guia4Encuentros7y8;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){               
        Scanner leer=new Scanner(System.in);
        
        //Iniciamos la variable continuar en "si" para que entre en el bucle
        String nombre,continuar="si";
        
        while(continuar.equalsIgnoreCase("si")){
            // Le enviamos el objeto Scanner a la funcion que nos traera un resultado 
            // que directamente lo evaluamos dentro de un condicional
            if(tomarEdad(leer)>18){
                System.out.println(tomarNombre(leer)+" es mayor de edad");
            }else{
                System.out.println(tomarNombre(leer)+" es menor");
            }
            
            System.out.print("\nDesea continuar: ");
            continuar=leer.next();
        }
    }
    
    public static String tomarNombre(Scanner teclado){
        //Recibimos el objeto Scanner y a la funcion le ponemos el tipo de valor
        //que devolvera al main; y un nombre acorde a lo que va a realizar.
        System.out.print("Ingrese el nombre: ");
        String nom=teclado.next();
        return (nom);
    }
    public static int tomarEdad(Scanner teclado){
        System.out.print("Ingrese su edad: ");
        int edad= teclado.nextInt();
        return(edad);
    }
}
