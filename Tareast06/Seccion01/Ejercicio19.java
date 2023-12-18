package tareast06.seccion01;
import libpersonal.Arrays;

public class Ejercicio19 {
    public static void ejer19 (){
        int tamanoArray = 100, min=0, max=100;
        int[] arrayNums = new int[tamanoArray];
        Arrays.rellenarAleatorio(arrayNums, min, max);
        for (int i = 0; i < arrayNums.length; i++) {
            System.out.println("Elemento " + i + ": " + arrayNums[i]);
        }
    }
}