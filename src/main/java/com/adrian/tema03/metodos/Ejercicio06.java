package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidad, lineas;
        char caracter;
        System.out.println("Escribe un carater");
        caracter = scanner.next().charAt(0);


        System.out.println("Ingrese la cantidad de repeticiones por linia");
        cantidad = scanner.nextInt();

        System.out.println("Ingrese la cantidad de linias");
        lineas = scanner.nextInt();

        imprimirCaracteres(caracter, cantidad, lineas);
    }

    /**
     * Escribir un caracter una cantidad de veces determinada
     * @param caracter el caracter
     * @param cantidad la cantidad de veces
     */
    public static void imprimirCaracteres(char caracter, int cantidad, int lineas) {
        for(int i = 0; i < lineas; i++){
            for (int j = 0; j < cantidad; j++) {
                System.out.print(caracter);
            }
            System.out.println(caracter);
        }
    }
/*
    /**
     * solicitar un texto y validar su longitud
     * @param mensaje Mensaje que se le mostrara al usuario
     * @param longitud Numero de caracteres que debe tener el texto
     * @return el texto leido validado

    public static String solicitarString(String mensaje, int longitud) {
        Scanner scanner = new Scanner(System.in);
        String x;
        boolean valido;
        do {
            System.out.println(mensaje);
            x = scanner.nextLine();
            valido = x.length() < longitud +1 && x.length() > longitud -1;
            if(!valido){
                System.err.println("Longitud invalida");
            }
        }while(!valido);
        scanner.close();
        return x;
    }
    */
}