
package tareast06.seccion01;
import libpersonal.Eys;
public class Ejercicio13 {
    public static void ejer13() {
        int[] numeros = new int[10];
        float suma=0;
        Eys.imprimir("Introduce 10 numeros");
        for (int i=0; i < numeros.length ;i++){
            numeros[i] = Eys.leerNum();
        }
        for (int i=0; i < numeros.length ;i++){
            suma += numeros[i];
        }
        float media = suma /numeros.length;
        Eys.imprimir("la media de los numeros ingresados es: "+media);
    }
}
