package Tareast06;

public class test {
    public static void main(String[] args) {
        // Datos de ejemplo
        String nombre1 = "Juan";
        int edad1 = 25;
        String nombre2 = "María";
        int edad2 = 30;

        // Imprimir encabezado
        System.out.printf("%-15s %-5s%n", "Nombre", "Edad");
        // %-15s indica una cadena de 15 caracteres justificada a la izquierda
        // %-5s indica una cadena de 5 caracteres justificada a la izquierda
        // %n representa un salto de línea

        // Imprimir datos
        System.out.printf("%-15s %-5d%n", nombre1, edad1);
        System.out.printf("%-15s %-5d%n", nombre2, edad2);
    }
}
    

