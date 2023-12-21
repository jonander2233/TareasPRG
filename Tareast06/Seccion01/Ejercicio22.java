package tareast06.seccion01;
import libpersonal.*;

public class Ejercicio22 {
    public static void ejer22(){
        int largo=10;
        int[] arrayP = new int[largo];
        int[] arrayS = new int[arrayP.length];
        Arrays.rellenarAleatorio(arrayP,0,20);
        // for(int i =0;i<arrayP.length;i++){
        //     arrayP[i]=Eys.imprimirYLeerNum("introduce un numero para la posicion "+ i);            
        // }
        Eys.imprimirArrayEnteros(arrayP);
        Eys.imprimir("--------------------");
        for(int i=0;i<arrayP.length; i++){
            if(arrayP[i]>10){
                arrayS[i]=arrayP[i];
            }else{
                arrayS[i]=-1;
            } 
        }
        Eys.imprimirArrayEnteros(arrayS);
    }
}
