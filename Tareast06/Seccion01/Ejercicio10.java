package tareast06.seccion01;

import libpersonal.Eys;

public class Ejercicio10 {
    public static void ejer10 (){
        String palabra = Eys.imprimirYLeer("Dime una palabra");
        boolean esONo = palindroma(palabra);
        if (esONo == true){
            Eys.imprimir("es palindroma");
        }else{
            Eys.imprimir("no es palindroma");
        }
    }    
    public static boolean palindroma(String palabra){
        int nCaracteres = palabra.length();
        boolean resultado;
        String palabraDelReves="";
        for (int i=nCaracteres-1; i>=0; i--){
            palabraDelReves += palabra.charAt(i);
        }
        if (palabra.equals(palabraDelReves)){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}
