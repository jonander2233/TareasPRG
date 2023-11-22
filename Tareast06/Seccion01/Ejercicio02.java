package Tareast06.Seccion01;
import libPersonal.EYS;
public class Ejercicio02 {
    public static void main(String []args){
        String frase,vocales="aeiouáéíóúàèìòùäëïöü",consonantes="bcdfghjklmnñpqrstvwxyz";
        int contadorVocales=0,contadorConsonantes=0;
        EYS.imprimir("introduce una frase");
        frase = EYS.leer();
        frase = frase.toLowerCase();
        for (int i = 0; i<frase.length();i++ ){
            frase.charAt(i);
            char letra = frase.charAt(i);
            if (vocales.indexOf(letra)!= -1){
                contadorVocales++;
            }
            if (consonantes.indexOf(letra)!= -1){
                contadorConsonantes++;
            }
        }
        EYS.imprimir("tu frase contiene: "+ contadorConsonantes+" consonantes y "+contadorVocales+" vocales.");
    }
    
}