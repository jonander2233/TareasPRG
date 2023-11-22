package Tareast06.Seccion01;
import libPersonal.EYS;
public class Ejercicio01 {
    public static void main (String[]args){
        EYS.imprimir(ejer1("texto de prueba"));
    }    

    public static String ejer1(String frase){
        char letra = frase.charAt(0);
        letra = Character.toUpperCase(letra);
        String resultado = frase.substring(1);
        String resultadoFinal = letra + resultado;
        return resultadoFinal;
    }
}
