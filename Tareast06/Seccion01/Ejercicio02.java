package tareast06.seccion01;
import libpersonal.Eys;
public class Ejercicio02 {
    public static void ejer02(){
        String frase,vocales="aeiouáéíóúàèìòùäëïöü",consonantes="bcdfghjklmnñpqrstvwxyz";
        int contadorVocales=0,contadorConsonantes=0;
        Eys.imprimir("introduce una frase");
        frase = Eys.leer();
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
        Eys.imprimir("tu frase contiene: "+ contadorConsonantes+" consonantes y "+contadorVocales+" vocales.");
    }
    
}