package libpersonal;
import java.util.Scanner;
public class Eys {
    private static Scanner lector = new Scanner(System.in);
    public static String leer(){
        lector = new Scanner(System.in);
        String texto = lector.nextLine();
        return texto;
    }
// --------------------------Enteros--------------------------------------------------------
    public static int imprimirYLeerNum(String texto){
        System.out.println(texto);
        int respuesta = lector.nextInt();   
        return respuesta;
    }
    public static int leerNum(){
        int respuesta = lector.nextInt();
        return respuesta;
        
    }
    public static void imprimirNum(int num){
        System.out.println(num);
    }
// --------------------------Char--------------------------------------------------------
    public static char leerChar(){
        String texto =lector.nextLine();
        char caracter = texto.charAt(0); 
        return caracter;
    }
// --------------------------String--------------------------------------------------------
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static String imprimirYLeer(String texto){
        System.out.println(texto);
        String respuesta = lector.nextLine();
        return respuesta;
    }
// --------------------------Arrays--------------------------------------------------------
    public static void leerArrayChar(char[] letras){
        for (int i=0; i<letras.length;i++){
            letras[i] = Eys.leerChar(); 
        }
    }        
    public static void leerArrayNum(int[]nums){
        for (int i=0; i < nums.length ;i++){
            nums[i] = Eys.leerNum();
        }
    }
    public static void leerArrayDouble(double[]nums){
        for (int i=0; i < nums.length ;i++){
            nums[i] = Eys.leerNum();
        }
    }
    public static void imprimirArrayEnteros (int[]arrayInt){
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Elemento " + i + ": " + arrayInt[i]);
        }
    }
}
    