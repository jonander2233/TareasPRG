package tareast06.seccion01;
import java.util.Random;
import libpersonal.*;

public class Ejercicio26 {
    public static int[][] matriz = new int[4][8];
    public static void a(){
        Matrices.rellenarMatriz(matriz, 1, 9);
        for(int x = 0; x < matriz.length; x ++){
            for(int y = 0; y < matriz[x].length; y ++){ 
                System.out.print(matriz[x][y]+" ");
            }
            Eys.imprimir("\n");
        }
    }
    public static void b(){
        Matrices.rellenarMatriz(matriz, 1, 9);
        for (int x =0; x<matriz.length; x++){
            for(int y=0; x<matriz[x].length; y++){
                
            }
        }
    }
    public static void c(){
        Matrices.rellenarMatriz(matriz, 1, 9);
        int suma=0;
        for(int x = 0; x < matriz.length; x ++){
            for(int y = 0; y < matriz[x].length; y ++){ 
                suma += matriz[x][y]; 
                System.out.print(matriz[x][y]+" "); 
            }
            Eys.imprimir("-La suma de la fila es: "+ suma+"\n");
        }
        
    }
    public static void d(){
        Matrices.rellenarMatriz(matriz, 1, 9);
        int valMax=0,valMin=99999999;
        for (int x=0;x<matriz.length; x++){
            for (int y = 0; y < matriz[x].length; y++){
                if(valMax<matriz[x][y]){
                    valMax=matriz[x][y];
                }
                if(valMin>matriz[x][y]){
                    valMin=matriz[x][y];
                }
            }

        }
        Eys.imprimir("El valor maximo es: " + valMax + " Mientras que el valor minimo es :" + valMin);
    }
}