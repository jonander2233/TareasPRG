package Tareast06.Seccion01;

import libPersonal.EYS;

public class Ejercicio07 {
    public static void main (String [] args){
        String texto = EYS.imprimirYLeer("dime una frase");
        texto=texto.trim();
        String[] palabras = texto.split("\\s+"); // el ["\\s+"] toma uno o varios espacios por si el usuario coloca más de un espacio entre palabras
        for ( int i =0; i<palabras.length; i++){
            EYS.imprimir(palabras[i]);

        }
    }
    
}
