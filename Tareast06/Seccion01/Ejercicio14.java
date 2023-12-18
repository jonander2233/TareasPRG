package    tareast06.seccion01;
import libpersonal.Arrays;
import libpersonal.Eys;
public class Ejercicio14 {  
    public static void ejer14 (){
        String resultado;
        char[] letras = new char[10];
        Eys.imprimir("introduce 10 letras");
        Eys.leerArrayChar(letras);              //pregunta al usuario el contenido del array y lo mete dentro de este
        resultado = Arrays.arrayDevolverPares(letras);
        Eys.imprimir(resultado);
    }
}
