package tareast06.ejerciciosnavidad.conversionesdetipo;
import java.util.Scanner;
import libpersonal.Eys;

public class Ejercicio04 {
    public static void ejer04(){
        Scanner lector = new Scanner(System.in);
        char caracter;
        int ascii;
        boolean validacion=false;
        Eys.imprimir("Ingrese un número entre 0 y 127");
        do{
            ascii = Eys.leerInt();
            if (ascii<128 && ascii >=0){
                validacion = true;
            }
        }while (validacion == false);
        caracter = (char) ascii;    
        Eys.imprimir("el numero "+ ascii +" es: "+ caracter);            
    }
}
