package tareast06.seccion01;

import libpersonal.Eys;

public class Ejercicio07 {
    public static void main (String [] args){
        String texto = Eys.imprimirYLeer("dime una frase");
        texto=texto.trim();         //elimina los espacios al principio y al final
        String[] palabras = texto.split("\\s+"); // el ["\\s+"] toma uno o varios espacios por si el usuario coloca más de un espacio entre palabras
        for ( int i =0; i<palabras.length; i++){
            Eys.imprimir(palabras[i]);

        }
    }
    
}
