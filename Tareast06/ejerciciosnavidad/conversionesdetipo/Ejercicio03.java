package tareast06.ejerciciosnavidad.conversionesdetipo;
import java.util.Scanner;
import libpersonal.Eys;

public class Ejercicio03 {
    public static void ejer03() {
        Scanner lector = new Scanner(System.in);
        char caracter;
        int ascii;
        Eys.imprimir("introduce un caracter");
        caracter=lector.next().charAt(0);
        ascii = (int) caracter;
        lector.close();
        Eys.imprimir("el codigo ascii para "+ caracter +" es "+ ascii);
    }
    
}