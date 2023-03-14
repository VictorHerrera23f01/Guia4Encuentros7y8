/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y 
terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los 
caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación. 

Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:     @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Guia4Encuentros7y8;
import java.util.Scanner;

public class Ejercicio11DeLaTeoria {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        String palabra;
        
        System.out.println("Ingrese la palabra terminada en un punto: ");
        palabra=leer.next();
        
        System.out.println(transformacion(palabra));
    }
    public static String transformacion(String palabra){
        for (int i=1;i<=palabra.length();i++){
            switch(palabra.substring((i-1), i).toLowerCase()){
                case "a":
                    palabra=palabra.substring(0, (i-1))+"@"+palabra.substring(i);
                    break;
                case "e":
                    palabra=palabra.substring(0, (i-1))+"#"+palabra.substring(i);
                    break;
                case "i":
                    palabra=palabra.substring(0, (i-1))+"$"+palabra.substring(i);
                    break;
                case "o":
                    palabra=palabra.substring(0, (i-1))+"%"+palabra.substring(i);
                    break;
                case "u":
                    palabra=palabra.substring(0, (i-1))+"*"+palabra.substring(i);
                    break;
                    
                    /*
                    >>>>>>    palabra = palabra.substring(0, i-1) + "@" + palabra.substring(i);    <<<<<
                    
                    Esta línea de código reemplaza cualquier ocurrencia de la letra "a" en la cadena de texto "palabra" con 
                    el carácter "@" en la misma posición.

                    La línea se divide en tres partes:

                    "palabra.substring(0, i-1)" - esta parte de la línea toma una subcadena de "palabra" desde el principio hasta 
                    el índice justo antes del índice donde se encontró la letra "a". Si "i" es 1, esto devuelve una cadena vacía. 
                    Si "i" es mayor a 1, esto devuelve una subcadena de "palabra" desde el principio hasta el carácter justo antes 
                    de la primera "a" encontrada.
                    
                    "@" - esta parte de la línea simplemente es el carácter "@" que reemplazará la letra "a".
                    
                    palabra.substring(i) - esta parte de la línea toma una subcadena de "palabra" desde el índice justo después 
                    de la letra "a" hasta el final de la cadena. Si "i" es igual a la longitud de "palabra", esto devuelve una cadena 
                    vacía. Si "i" es menor a la longitud de "palabra", esto devuelve una subcadena de "palabra" desde la letra 
                    inmediatamente después de la "a" hasta el final de la cadena.
                    
                    La línea de código une estas tres partes en una sola cadena de texto usando el operador de concatenación "+". 
                    Finalmente, el resultado se asigna de vuelta a la variable "palabra", reemplazando la cadena original con la 
                    versión modificada que reemplaza todas las letras "a" con el carácter "@".
                    */
                    
            }
        }
        return (palabra);
    }
    
}
