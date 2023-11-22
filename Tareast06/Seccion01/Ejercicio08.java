package Tareast06.Seccion01;

import libPersonal.EYS;

public class Ejercicio08 {
    public static void main (String [] args){
        String texto = EYS.imprimirYLeer("dime una frase");
        texto=texto.trim();
        String[] palabras = texto.split("\\s+"); // el ["\\s+"] toma uno o varios espacios por si el usuario coloca más de un espacio entre palabras
        for ( int i =0; i<palabras.length; i++){
            String palabra =palabras[i];
            int tamano = palabra.length();
            System.out.printf("%-15s %d%n", palabra, tamano);
        }
    }
    
}
