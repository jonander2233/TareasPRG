package Tareast06.Seccion01;
import libPersonal.Arrays;
import libPersonal.EYS;
public class Ejercicio14 {
    public static void main (String[]args){
        String resultado;
        char[] letras = new char[10];
        EYS.imprimir("introduce 10 letras");
        EYS.leerArrayChar(letras);              //pregunta al usuario el contenido del array y lo mete dentro de este
        resultado = Arrays.arrayDevolverPares(letras);
        EYS.imprimir(resultado);
    }
}
