package com.adrian.tema03.metodos.lib;

import java.util.Scanner;

public class IOEntero {
    public static void main(String[] args) {

        String mensaje = "Ingrese un numero:";
        int longitudMinima = 18;
        int longitudMaxima = 60;
        int x;
        x = solicitarInt(mensaje, longitudMinima, longitudMaxima);

        System.out.println(x);

    }


    /**
     * solicitar un texto y validar su longitud este comprendidda entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrara al usuario
     * @param longitudMinima Numero minimo de caracteres que debe tener el texto
     * @param longitudMaxima Numero maximo de caracteres que debe tener el texto
     * @return el texto leido validado
     */
    public static int solicitarInt(String mensaje, int longitudMinima, int longitudMaxima ) {
        Scanner scanner = new Scanner(System.in);
        int x;
        boolean valido;
        do {
            System.out.println(mensaje);
            x = scanner.nextInt();
            valido = x >= longitudMinima && x <= longitudMaxima;
            if(!valido){
                System.err.println("numero invalido");
            }
        }while(!valido);
        scanner.close();
        return x;
    }
}