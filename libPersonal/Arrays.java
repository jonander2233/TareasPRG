package libpersonal;
import java.util.Random;


public class Arrays {
    public static Random aleatorio = new Random();

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



    //metodo para rellenar con números aleatorios un array
    public static void rellenarAleatorio (int[]arrayNumeros, int min, int max){
        for(int i=0; i< arrayNumeros.length; i++){
            arrayNumeros[i] = aleatorio.nextInt(max- min + 1) + min; 
        }
    }


}
