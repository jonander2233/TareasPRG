package Tareast06.Seccion01;
import libPersonal.EYS;
public class Ejercicio03 {
    public static void main (String []args){
        EYS.imprimir("texto de ejemplo");
        String texto= EYS.leer();
        EYS.imprimir("tu frase contiene: "+nPalabras(texto)+" palabras");

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