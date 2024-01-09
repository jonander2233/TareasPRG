package tareast06.ejerciciosnavidad.estructurascondicionales;

import libpersonal.Eys;

public class Ejercicio01 {
    public static void ejer01(){
        int hora;
        boolean validacion=false;
        do{
            hora = Eys.imprimirYLeerInt("Dime una hora del dia en formato 24h");
            if(hora<24 && hora>=0){
                validacion=true;
            }else{
                Eys.imprimir("error, numero invalido\n");
            }
        }while(validacion==false);

        if(hora>6 && hora<21){
            Eys.imprimir("Es de dia");
        }else{
            Eys.imprimir("Es de noche");
        }
    }
}
