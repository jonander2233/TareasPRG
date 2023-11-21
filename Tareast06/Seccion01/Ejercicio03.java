package Tareast06.Seccion01;
import libPersonal.imprimir;
import libPersonal.leer;
public class Ejercicio03 {
    public static void main (String []args){
        imprimir.normal("dime una frase");
        String texto= leer.texto();
        imprimir.normal("tu frase contiene: "+nPalabras(texto)+" palabras");

    }
    public static int nPalabras(String texto){
        int cantidadDePalabras=1;
        for (int i=0; i<texto.length();i++){
            char letra = texto.charAt(i);
            if (letra == ' '){
                cantidadDePalabras++;
            }
        }
        return cantidadDePalabras;
    }
}