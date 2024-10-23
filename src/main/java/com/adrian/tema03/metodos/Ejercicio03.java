package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        int numeroMayor;

        System.out.println("Ingrese el valor de x");
        x = scanner.nextInt();

        System.out.println("Ingrese el valor de y");
        y = scanner.nextInt();

        numeroMayor = mayor(x, y);

        System.out.println("El mayor de los dos es " + numeroMayor);
    }

    /**
     * Devuelve el mayor de  dos numeros
     * @param a El primer numero
     * @param b El segundo numero
     * @return El mayor entre a y b
     */
    public static int mayor(int a, int b) {
        if(a<b){
            return b;
        }else{
            return a;
        }
    }
}