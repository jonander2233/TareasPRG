package Tareast06.Seccion01;

import libPersonal.EYS;

public class Ejercicio10 {
    public static void main (String []args){
        String palabra = EYS.imprimirYLeer("Dime una palabra");
        boolean esONo = palindroma(palabra);
        if (esONo == true){
            EYS.imprimir("es palindroma");
        }else{
            EYS.imprimir("no es palindroma");
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
