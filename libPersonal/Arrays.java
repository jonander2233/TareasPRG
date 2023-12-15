package libpersonal;
import java.util.Random;
public class Arrays {
    public static String arrayDevolverPares(char[]letras){
    StringBuilder resultado = new StringBuilder();          //llamada a stringBuilder y lo llama "resultado"

    for (int i=1;i<letras.length;i+=2){
        resultado.append(letras[i]);         //concatena los elementos del array
    }
    return resultado.toString();            //devuelve el conjunto de elemntos en forma de string 
    }



    public static String arrayDevolverImpares(char[]letras){
    StringBuilder resultado = new StringBuilder();          //llamada a stringBuilder y lo llama "resultado"

    for (int i=0;i<letras.length;i+=2){
        resultado.append(letras[i]);         //concatena los elementos del array
    }
    return resultado.toString();            //devuelve el conjunto de elemntos en forma de string 
    }
    /*
    public static int[] arrayAleatorio(int length, int min, int max){
        if (length <1)
            return null;
        if (min > max)
            return null;
        int[] resultado=new Int[length];
        for(int i=0;i<resultado.length;i++){
            resultado[i] = random.nextInt(max - min + 1) + min;
        }
        return resultado;
    }
    public static int[] sumaArrays(int[] a1, int[] a2){
        if (a1.length != a2.length)
            return null;
        
    }
    public static int 
 */
}
