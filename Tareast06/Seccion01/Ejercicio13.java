package Tareast06.Seccion01;
import libPersonal.EYS;
public class Ejercicio13 {
    public static void main(String[]args) {
        int[] numeros = new int[10];
        float suma=0;
        EYS.imprimir("Introduce 10 numeros");
        for (int i=0; i < numeros.length ;i++){
            numeros[i] = EYS.leerNum();
        }
        for (int i=0; i < numeros.length ;i++){
            suma += numeros[i];
        }
        float media = suma /numeros.length;
        EYS.imprimir("la media de los numeros ingresados es: "+media);
    }
}
