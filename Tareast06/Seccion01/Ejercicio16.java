package tareast06.seccion01;
import java.util.Random;

import libpersonal.Eys;
class Ejercicio16 {
    public static void main (String []args){
        Random aleatorio = new Random();        
        double[] notas = new double[30];            //creo un array y un puntero llamado "aleatorio"
        int notaMax = 10;
        for (int i=0; i<notas.length;i++){          //recorro el Array y le doy a cada posicion un numero aleatorio de 0 a "notaMax(10)"
        notas[i] = aleatorio.nextInt(notaMax);    
        }
        for (int i=0; i<notas.length;i++){          //recorro el array y si la nota es mayor que 5 
            if (notas[i] > 4){
                
            }
        }
        
        Eys.imprimir("la media de los alumnos que han aprobado es de: ");
    }
    
}