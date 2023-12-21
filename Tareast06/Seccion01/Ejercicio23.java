package tareast06.seccion01;
import libpersonal.*;
public class Ejercicio23 {
    public static void ejer23(){
        int longitudArray=10;
        int min=0,max=10;
        int[] arrayV = new int[longitudArray]; 
        int[] arrayP = new int[longitudArray]; 
        Arrays.rellenarAleatorio(arrayV ,min ,max );
        Eys.imprimirArrayEnteros(arrayV);
        arrayP = Arrays.devolverInverso(arrayV);
        Eys.imprimir("--------------------------");
        Eys.imprimirArrayEnteros(arrayP);
    }
}
