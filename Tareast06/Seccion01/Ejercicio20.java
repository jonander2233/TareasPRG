package tareast06.seccion01;
import libpersonal.Arrays;
import libpersonal.Eys;

public class Ejercicio20 {
    public static void ejer20 (){
        boolean numEncontrado = false;
        int tamanoArray = 5;
        int numeroABuscar = 22;
        int min=0, max= 10;
        int[] arrayNums = new int[tamanoArray];
        Arrays.rellenarAleatorio(arrayNums, min, max);

        numEncontrado = Arrays.obtenerSiNumEstaEnArray(arrayNums, numeroABuscar);
        Eys.imprimirArrayEnteros(arrayNums);
        if (numEncontrado == true){
            Eys.imprimir("el numero se encuentra en el array");
        }
        else if(numEncontrado==false){
            Eys.imprimir("no se ha encontrado el numero en el array");
        }
    }
}
