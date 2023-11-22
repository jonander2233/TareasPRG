package Tareast06.Seccion01;
import libPersonal.EYS;

public class Ejercicio05 {
    public static void main(String []args){
        String texto,palabraLarga="";
        int nCaracteres=palabraLarga.length();
        EYS.imprimir("Dime un texto");
        texto = EYS.leer();
        palabraLarga = palabraMasLarga("texto de prueba");
        EYS.imprimir("La palabra más larga es: "+palabraLarga+"que contiene "+ nCaracteres+" letras");
        
    }
    public static String palabraMasLarga(String texto){
        String[] palabra = texto.split(" ");           //divide el texto cada vez que encuentra un " "
        String palabraMasLarga = palabra[0];           //inicializa la palabra más larga con la primera palabra
        for (int i=1; i<palabra.length; i++){          //[i<palabra.lenght] no recorre los caracteres sino que recorre el Array 
            if (palabra[i].length() > palabraMasLarga.length()){
                palabraMasLarga = palabra[i];
            }
        }
        return palabraMasLarga;
    }
}
