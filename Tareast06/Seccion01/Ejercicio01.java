package tareast06.seccion01;
import libpersonal.Eys;
public class Ejercicio01 {
    public static void ejer01 (){
        Eys.imprimir(ejer1("texto de prueba"));
    }    

    public static String ejer1(String frase){
        char letra = frase.charAt(0);
        letra = Character.toUpperCase(letra);
        String resultado = frase.substring(1);
        String resultadoFinal = letra + resultado;
        return resultadoFinal;
    }
}
