package tareast06.ejerciciosnavidad.estructurascondicionales;
import libpersonal.*;
public class Ejercicio03 {
    public static void ejer03(){
        int edad;
        double precio,descuento=0,precioFinal;
        char respuesta;
        boolean fNumerosa,discapacidad;
        Eys.imprimir("Indica tu edad para calcular el precio de tu entrada");
        edad = Eys.leerInt();
        if(edad<5){
            precio=0;
        }else if (edad<11){
            precio=3;
        }else if (edad<18){
            precio=5;
        }else{
            precio=7;
        }
        Eys.imprimir("Eres de familia numerosa? S/N");
        respuesta = Eys.leerChar();
        if (respuesta =='S'){
            fNumerosa = true;
        }else{
            fNumerosa = false;
        }
        Eys.imprimir("Tienes discapacidad del 33%? S/N");
        respuesta = Eys.leerChar();
        if (respuesta =='S'){
            discapacidad = true;
        }else{
            discapacidad = false;
        }
        if(fNumerosa == true){
            descuento += 20;
        }
        if(discapacidad ==true){
            descuento+= 50;
        }
        precioFinal = Operaciones.descuento(descuento, precio);
        Eys.imprimir("tu precio sera de " + precioFinal + " eur");
    }
}
