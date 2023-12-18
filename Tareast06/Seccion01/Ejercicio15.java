package tareast06.seccion01;
import libpersonal.Eys;
public class Ejercicio15 {
    public static void ejer15 (){
    int[] numeros = new int[20];
    Eys.imprimir("dime 20 numeros");
    Eys.leerArrayNum(numeros);
    Eys.imprimir("\n \n \n \n \n");
    int contador = 0;
    for (int fila=0; fila<5;fila++){
        for (int columna=0; columna<4;columna++) {
            System.out.print(numeros[contador] + "\t");
            contador++;
        }
        System.out.println();
    }
    
    }
}