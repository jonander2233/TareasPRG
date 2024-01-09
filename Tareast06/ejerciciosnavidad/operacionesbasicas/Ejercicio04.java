package tareast06.ejerciciosnavidad.operacionesbasicas;
import libpersonal.*;
public class Ejercicio04 {
    static final int SEGUNDOS_EN_HORAS = 3600;
    static final int SEGUNDOS_EN_MINUTOS = 60;

    public static void ejer04(){
        int segundos,horas=0,minutos=0;
        segundos = Eys.imprimirYLeerInt("dime una cantidad de segundos");
        int segundosInicial = segundos;
        while (segundos >=SEGUNDOS_EN_HORAS) {
            segundos = segundos - SEGUNDOS_EN_HORAS;
            horas++;
        }
        while (segundos>=SEGUNDOS_EN_MINUTOS) {
            segundos = segundos - SEGUNDOS_EN_MINUTOS;
            minutos++;
        }
        Eys.imprimir(segundosInicial+" segundos son "+horas+"h "+minutos+"m y "+segundos+"s");
    }
}
