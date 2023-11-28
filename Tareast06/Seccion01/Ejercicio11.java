package Tareast06.Seccion01;

import libPersonal.EYS;

class Ejercicio11 {
    public static void main (String []args){
        String nombreMayus, primerApellidoMayus, segundoApellidoMayus, nombre, primerApellido, segundoApellido, nombreMinus, primerApellidoMinus, segundoApellidoMinus;
        
        nombre = EYS.imprimirYLeer("Ingrese su nombre");
        nombre.trim();
        
        primerApellido = EYS.imprimirYLeer("Ingrese su primer apellido");
        primerApellido.trim();
        
        segundoApellido = EYS.imprimirYLeer("Ingrese su segundo apellido");
        segundoApellido.trim();

        nombreMinus=nombre.toLowerCase();
        primerApellidoMinus=primerApellido.toLowerCase();
        segundoApellidoMinus=segundoApellido.toLowerCase();
        
        EYS.imprimir("a)"+nombreMinus+" "+primerApellidoMinus+" "+segundoApellidoMinus);
        nombreMayus = nombre.toUpperCase();
        primerApellidoMayus = primerApellido.toUpperCase();
        segundoApellidoMayus = segundoApellido.toUpperCase();
        EYS.imprimir(nombreMayus+" "+primerApellidoMayus+" "+segundoApellidoMayus);
        String nombreCompleto = (nombre+""+primerApellido+""+segundoApellido);
        int longutudNombre = nombreCompleto.length();
        EYS.imprimir("su nombre contiene "+longutudNombre+" caracteres");
        
        if (nombreCompleto.length() > 5){
            String nombrePartido="";  
            for (int i=0; i<5;i++){
                nombrePartido+= nombreCompleto.charAt(i);
            }
            EYS.imprimir("b)"+nombrePartido);
        }
        if(nombreCompleto.length() >= 2){
            String ultimasDosLetras = nombreCompleto.substring(nombreCompleto.length() - 2);
            EYS.imprimir("c)"+ultimasDosLetras);
        }

        char ultimaLetra = nombreCompleto.charAt(nombreCompleto.length()-1);
        int sumaDeLetras=0;
        for (int i=0; i < nombreCompleto.length();i++){
            char letraCoincidencia = nombreCompleto.charAt(i);
            if (letraCoincidencia == ultimaLetra){
                sumaDeLetras++;
            }
        }
        EYS.imprimir("d)"+sumaDeLetras);

        String coincidenciasMayus="";
        for (int i=0; i<nombreCompleto.length();i++){
            char letraCoincidencia1 = nombreCompleto.charAt(i);
            if (letraCoincidencia1 == nombreCompleto.charAt(0)){
                coincidenciasMayus += letraCoincidencia1;
            }
        } 
        EYS.imprimir("E)"+coincidenciasMayus);

        EYS.imprimir("f) ***"+nombreMinus+" "+primerApellidoMinus+" "+segundoApellidoMinus+"***");
        
        String nombreInvertido ="";
        for (int i=nombreCompleto.length()-1;i>=0;i--){
            char letra = nombreCompleto.charAt(i);
            nombreInvertido += letra;
        }
        EYS.imprimir("g)"+nombreInvertido);
    }
}