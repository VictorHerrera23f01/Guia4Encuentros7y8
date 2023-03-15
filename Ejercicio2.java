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
            // Le enviamos el objeto Scanner a la funcion que una vez halla echo su trabajo  
            // nos traera un resultado que directamente lo evaluamos dentro de un condicional
            // y se aplican las respectivas sentencias
            if(tomarEdad(leer)>18){
                System.out.println(tomarNombre(leer)+" es mayor de edad");
            }else{
                System.out.println(tomarNombre(leer)+" es menor");
            }
            
             //aqui leemos la variable continuar para modificar la condicion del bucle
             //y asi salir de el una vez no sea la palabra "si" con la que se inicializó
            System.out.print("\nDesea continuar: ");
            continuar=leer.next();
        }
        //no nos olvidemos de cerrar el objeto Scanner
        leer.close();
    }
    
    public static String tomarNombre(Scanner teclado){
        //Recibimos el objeto Scanner y a la funcion le ponemos el tipo de valor
        //que devolvera al metodo main; y un nombre acorde a lo que va a realizar.
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
