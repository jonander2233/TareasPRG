package tareast06.seccion01;
import libpersonal.*;

public class Ejercicio21 {
    public static void ejer21(){
        boolean salir = false;
        int tamano = 10,opcion=0;
        int[] arrayNums = new int[tamano];
        while (salir==false) {
            opcion = Eys.imprimirMenu4("Rellenar Array","Visualizar el contenido del array", "Visualizar contenido par", "Visualizar contenido multiplo de 3");
            switch (opcion) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    crearArray(arrayNums);
                    Eys.imprimir("\n \n \n \n");
                    break;
                case 2:
                    visualizarArray(arrayNums);
                    Eys.imprimir("\n \n \n \n");
                    break;
                case 3:
                    visualizarPares(arrayNums);
                    Eys.imprimir("\n \n \n \n");
                    break;
                case 4:
                    Arrays.imprimirMultiplos(arrayNums,3);
                    Eys.imprimir("\n \n \n \n");
                    break;
            
                default:
                    break;
    
    
    
            }
        }

    }

    public static void crearArray(int[] vector){
        Arrays.rellenarAleatorio(vector, 0, 50);
    }
    public static void visualizarArray(int[] vector){
        Eys.imprimirArrayEnteros(vector);
    }
    public static void visualizarPares(int[] vector){
        Arrays.imprimirParesOImpares(vector, true);
    }
    public static void visualizarMultiple3(int[] vector){
        Arrays.obtenerMultiplos(vector, 3);

    }
    
}
