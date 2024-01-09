package tareast06.ejerciciosnavidad.conversionesdetipo;

import libpersonal.Eys;

public class Ejercicio02 {
    public static void ejer02(){
        double numIntroducido;
        int division;
        numIntroducido=Eys.imprimirYLeerDouble("introduce un numero real ");
        division= (int) numIntroducido/2;
        Eys.imprimirInt(division);
    }
    
}
