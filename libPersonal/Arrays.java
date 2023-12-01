package libpersonal;

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


    

}
