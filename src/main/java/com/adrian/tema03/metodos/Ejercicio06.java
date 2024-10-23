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
     * Escribe un caracter una cantidad de veces determinada
     * @param caracter El caracter que debe imprimir
     * @param cantidad Cantidad de impresiones por linea
     * @param lineas Cantidad de lineas
     */
    public static void imprimirCaracteres(char caracter, int cantidad, int lineas) {
        for(int i = 0; i < lineas; i++){
            for (int j = 0; j < cantidad; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}