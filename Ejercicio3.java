/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes 
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).

El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €

 */
package Guia4Encuentros7y8;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        float Monto;
        String Divisa;
        
        System.out.print("Ingrese la cantidad de EUROS: ");
        Monto=leer.nextFloat();
        menu();
        System.out.print("\nIngrese el nombre de la Divisa a cambiar: ");
        Divisa=leer.next();
        
        cambioDeDivisas(Monto,Divisa);
    }
    public static void cambioDeDivisas(float Euros,String Moneda){
        float Cambio;
        
        switch(Moneda){
            case "Libra Esterlina":
                Cambio=Math.round((Euros/0.86)*100.0f)/100.0f;
                System.out.println("El cambio en Libras es de: "+Cambio);
                System.out.println(Euros+" Euros = "+Cambio+" Libras");
                break;
            case "Dolar":
                Cambio=Math.round((Euros/1.28611)*100.0f)/100.0f;
                System.out.println("El cambio en Dolares es de: "+Cambio);
                System.out.println(Euros+" Euros = "+Cambio+" Dolares");
                break;
            case "Yen Japones":
                Cambio=Math.round((Euros/129.852)*100.0f)/100.0f;
                System.out.println("El cambio en Yenes es de: "+Cambio);
                System.out.println(Euros+" Euros = "+Cambio+" Yenes");
            default:
                System.out.println("La moneda Ingresada no se puede cambiar en este sitio!!");
        }
    }
    public static void menu(){
        System.out.println("\nCambio de Divisas");
        System.out.println("1_Euro/Libra Esterlina");
        System.out.println("    0.86 libras es un 1 €");
        System.out.println("2_Euro/Dolar");
        System.out.println("    1.28611 $ es un 1 €");
        System.out.println("3_Euro/Yen Japones");
        System.out.println("    129.852 yenes es un 1 €");
    }
}
