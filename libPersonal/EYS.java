package libPersonal;
import java.util.Scanner;
public class EYS {
    public static String leer(){
        Scanner lector = new Scanner(System.in);
        String texto = lector.nextLine();
        return texto;
    }
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static String imprimirYLeer(String texto){
        System.out.println(texto);
        Scanner lector = new Scanner(System.in);
        String respuesta = lector.nextLine();
        return respuesta;
    }
    public static int imprimirYLeerNum(String texto){
        System.out.println(texto);
        Scanner lector = new Scanner(System.in);
        int respuesta = lector.nextInt();
        return respuesta;
        
    }
}
