package tareast06.seccion01;

import libpersonal.Eys;

public class Ejercicio08 {
    public static void ejer08 (){
        String texto = Eys.imprimirYLeer("dime una frase");
        texto=texto.trim();
        String[] palabras = texto.split("\\s+");
        for ( int i =0; i<palabras.length; i++){
            String palabra =palabras[i];
            int tamano = palabra.length();
            System.out.printf("%-15s %d%n", palabra, tamano);
        }
    }
    
}
