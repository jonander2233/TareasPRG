package tareast06.seccion01;
import libpersonal.Arrays;

public class Ejercicio19 {
    public static void ejer19 (){
        int tamanoArray = 100, min=0, max=100, multiplo = 5;
        int[] arrayNums = new int[tamanoArray];
        Arrays.rellenarAleatorio(arrayNums, min, max);
        int[] arrayMultiplos = Arrays.obtenerMultiplos(arrayNums,multiplo);


        for (int i = 0; i < arrayMultiplos.length; i++) {
            System.out.println("Elemento " + i + ": " + arrayMultiplos[i]);  
        }
    }
}