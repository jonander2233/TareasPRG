package tareast06.seccion01;
public class test {
    public static void a() {
        int matriz[][] = new int[4][3];
        System.out.println(matriz.length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=2;
            }
        }
    }
}
