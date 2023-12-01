package tareast06.seccion01;

import libpersonal.Eys;

public class Ejercicio09 {
    public static void main(String []args){
        String frase="";
        frase = Eys.imprimirYLeer("Dime una frase");
        String fraseImpares="",frasePares="";
        for (int i =0; i<frase.length();i++){
            char letra = frase.charAt(i);
            
            if(letra % 2 == 1){
                fraseImpares += letra;
            }else if (letra % 2 == 0){
                frasePares += letra;
            }
        }
        Eys.imprimir(fraseImpares);
    }
}
