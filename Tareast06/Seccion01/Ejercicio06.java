package Tareast06.Seccion01;

import libPersonal.EYS;

public class Ejercicio06 {
    public static void main (String []args){
        String frase = EYS.imprimirYLeer("Dime una frase");
        int veces  = EYS.imprimirYLeerNum("Cuantas veces quieres que se repita la frase?");

        for (int i= 0; i<veces;i++){
            EYS.imprimir(frase);
        }
    }
}
