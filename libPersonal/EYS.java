package libPersonal;
import java.util.Scanner;
public class EYS {
    private static Scanner lector = new Scanner(System.in);
    public static String leer(){
       lector = new Scanner(System.in);
        String texto = lector.nextLine();
        return texto;
    }
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static String imprimirYLeer(String texto){
        System.out.println(texto);
        String respuesta = lector.nextLine();
        return respuesta;
    }
    public static int imprimirYLeerNum(String texto){
        System.out.println(texto);
        int respuesta = lector.nextInt();   
        return respuesta;
    }
    public static int leerNum(){
        int respuesta = lector.nextInt();
        return respuesta;
        
    }
}
