package tareast06.seccion01;
import libpersonal.Eys;
public class Ejercicio03 {
    public static void ejer03 (){
        Eys.imprimir("texto de ejemplo");
        String texto= Eys.leer();
        Eys.imprimir("tu frase contiene: "+nPalabras(texto)+" palabras");

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