package tareast06.seccion01;

import libpersonal.Eys;

public class Ejercicio06 {
    public static void main (String []args){
        String frase = Eys.imprimirYLeer("Dime una frase");
        int veces  = Eys.imprimirYLeerNum("Cuantas veces quieres que se repita la frase?");

        for (int i= 0; i<veces;i++){
            Eys.imprimir(frase);
        }
    }
}
