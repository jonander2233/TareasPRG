package tareast06.ejerciciosnavidad.estructurascondicionales;

import libpersonal.Eys;

public class Ejercicio02 {
    public static void ejer02(){
        int edad;
        Eys.imprimir("Indica tu edad para calcular el precio de tu entrada");
        edad = Eys.leerInt();
        if(edad<5){
            Eys.imprimir("Puedes entrar gratis");
        }else if (edad<11){
            Eys.imprimir("la entrada te costara 3eur");
        }else if (edad<18){
            Eys.imprimir("la entrada te costara 5eur");
        }else{
            Eys.imprimir("la entrada te costara 7eur");
        }
    }
}
