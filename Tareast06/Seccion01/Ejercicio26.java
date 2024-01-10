package tareast06.seccion01;
import java.util.Random;
import libpersonal.*;

public class Ejercicio26 {
    public static void ejer26(){
        int[][] matriz = new int[4][8];
        Matrices.RellenarMatriz(matriz, 1, 9);

        for(int x = 0; x < matriz.length; x ++){
            for(int y = 0; y < matriz[x].length; y ++){ 
                System.out.print(matriz[x][y]+" ");
            }
            Eys.imprimir("\n");
        }
    }
}
        // Eys.imprimir("fila"+ x + 1 + ": "+);