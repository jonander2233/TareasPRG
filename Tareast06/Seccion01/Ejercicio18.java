package tareast06.seccion01;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio18 {
  
    public static void ejer18 () {
    
        int[] array1 = generarArray();
        int[] array2 = generarArray();

        // Generar un array suma con la suma de los elementos de los dos arrays
        int[] arraySuma = new int[10];
        for (int i = 0; i < array1.length; i++) {
            arraySuma[i] = array1[i] + array2[i];
        }

        // Mostrar el array suma
        System.out.println("Array Suma: " + Arrays.toString(arraySuma));

        // Generar un array división con la división de los elementos de los dos arrays iniciales
        double[] arrayDivision = new double[10];
        for (int i = 0; i < array1.length; i++) {
            arrayDivision[i] = (double) array1[i] / array2[i];
        }

        // Mostrar el array división
        System.out.println("Array División: " + Arrays.toString(arrayDivision));
    }

    // generar un array de 10 elementos de tipo entero entre 1 y 10
    private static int[] generarArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        return array;
    }
}


    

