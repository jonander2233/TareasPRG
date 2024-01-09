package libpersonal;

public class Operaciones {
    public static double descuento (double porcentaje,double num){
        double precioConDescuento = num - (num * (porcentaje/100));
        return precioConDescuento;
    }
}
