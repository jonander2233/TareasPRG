package Tareast06.Seccion01;
import libPersonal.EYS;
public class test {
    public static void main (String[]args){
        int[] datos = new int [10];
        solicitarDatosArray(datos);
    }
    public static void solicitarDatosArray (int[]array){
        for (int i=0; i< array.length;i++){
            EYS.imprimirNum(i);
            array[i] = Integer.parseInt(EYS.leer());
        }
    }
    public static float mediaArray(int[] array){
        int suma =0;
        for (int i =0; i<array.length;i++){
            suma += array[i];
            
        }
        return (float)suma /array.length;
    }
}
