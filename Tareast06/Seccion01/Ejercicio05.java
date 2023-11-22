package Tareast06.Seccion01;

import libPersonal.imprimir;
import libPersonal.leer;

public class Ejercicio05 {
    public static void main(String []args){
        String texto,palabraLarga="";
        int nCaracteres=palabraLarga.length();
        imprimir.normal("Dime un texto");
        texto = leer.texto();
        palabraLarga = palabraMasLarga("texto de prueba");
        imprimir.normal("La palabra más larga es: "+palabraLarga+"que contiene "+ nCaracteres+" letras");
        
    }
    public static String palabraMasLarga(String texto){
        String[] palabra = texto.split(" ");           //divide el texto cada vez que encuentra un " "
        String palabraMasLarga = palabra[0];           //inicializa la palabra más larga con la primera palabra
        for (int i=1; i<palabra.length; i++){          //coje la palabra y
            if (palabra[i].length() > palabraMasLarga.length()){
                palabraMasLarga = palabra[i];
            }
        }
        return palabraMasLarga;
    }
}
