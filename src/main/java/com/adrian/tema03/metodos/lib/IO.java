package com.adrian.tema03.metodos.lib;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {

        String mensaje = "Dime tu nomnre:";
        int longitudMinima = 2;
        int longitudMaxima = 30;
        String nombre;
        nombre = solicitarString(mensaje, longitudMinima, longitudMaxima);

        System.out.println(nombre);

    }


    /**
     * solicitar un texto y validar su longitud este comprendidda entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrara al usuario
     * @param longitudMinima Numero minimo de caracteres que debe tener el texto
     * @param longitudMaxima Numero maximo de caracteres que debe tener el texto
     * @return el texto leido validado
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima ) {
        Scanner scanner = new Scanner(System.in);
        String x;
        boolean valido;
        do {
            System.out.println(mensaje);
            x = scanner.nextLine();
            valido = x.length() >= longitudMinima && x.length() <= longitudMaxima;
            if(!valido){
                System.err.println("Longitud invalida");
            }
        }while(!valido);
        scanner.close();
        return x;
    }
}







