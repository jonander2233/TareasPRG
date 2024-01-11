package tareast06.seccion01;
import java.util.Random;
import libpersonal.*;

public class Ejercicio26 {
    public static int FILAS=4;
    public static int COLUMNAS=8;
    public static int[][] matriz = new int[FILAS][COLUMNAS];
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
    public static void e(){
        Matrices.rellenarMatriz(matriz, 1, 9);
        int valor=0,contador=0;
        double resultado;
        for (int x=0;x<matriz.length;x++){
            for (int y=0;y<matriz[x].length;y++){
                contador++;
                valor += matriz[x][y];
            }
        }
        resultado = valor / contador;
        Eys.imprimir("la media de todos los valores de la matriz es: " + resultado);
    }
    public static void f (){
        Matrices.rellenarMatriz(matriz, 1, 9);
        int fila = Eys.imprimirYLeerInt("Dime la fila?("+FILAS+")");
        int columna = Eys.imprimirYLeerInt("Dime la columna?("+COLUMNAS+")");
        int resultado = matriz[fila][columna];
        Eys.imprimir("el numero almacenado en esa posicion es: "+ resultado);


    }
}
