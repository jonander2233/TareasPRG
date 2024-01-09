package tareast06.ejerciciosnavidad.conversionesdetipo;

import libpersonal.Eys;

public class Ejercicio01 {
    public static void ejer01() {
        int numIngresado;
        float dobleNum;
        numIngresado = Eys.imprimirYLeerInt("ingrese un numero entero");
        dobleNum = numIngresado * 2;
        Eys.imprimir("El doble de tu numero es " + dobleNum);
    }
}
