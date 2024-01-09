package tareast06.seccion01;
import libpersonal.*;
public class Ejercicio24 {
    public static void ejer24(){
        int longitudArray = 3;
        int[] arrayNums = new int[longitudArray];
        int[] arraySumar = new int[arrayNums.length];
        Arrays.rellenarAleatorio(arrayNums, 0, 10);
        Eys.imprimirArrayEnteros(arrayNums);
        Eys.imprimir("------------------------");
        arraySumar = Arrays.sumatorio(arrayNums);
        Eys.imprimirArrayEnteros(arraySumar);
    }
}