package tareast06.ejerciciosnavidad.operacionesbasicas;

import libpersonal.Eys;

public class Ejercicio03 {
    public static void ejer03(){
        int precioOriginal=0;
        float cantidadDescuento,precioFinal,porcentaje,descuento;
        precioOriginal = Eys.imprimirYLeerInt("Ingrese el precio del producto");
        porcentaje = Eys.imprimirYLeerInt("Ahora ingrese el porcentaje de descuento a aplicar");
        
        cantidadDescuento= porcentaje/100;
        descuento = cantidadDescuento*precioOriginal;
        precioFinal = precioOriginal - descuento;
        Eys.imprimir("El precio final del producto sera de "+precioFinal+" euros");
    }
}
