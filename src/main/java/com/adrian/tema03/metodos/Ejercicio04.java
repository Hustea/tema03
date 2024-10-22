package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y ,a ,b;
        int numeroMayor;

        System.out.println("Ingrese el valor de x");
        x = scanner.nextInt();

        System.out.println("Ingrese el valor de y");
        y = scanner.nextInt();

        System.out.println("Ingrese el valor de a");
        a = scanner.nextInt();

        System.out.println("Ingrese el valor de b");
        b = scanner.nextInt();

        numeroMayor = Mayor(x, y, a, b);

        System.out.println("El mayor de los quatro es " + numeroMayor);
    }

    /**
     * Devuelve el mayor de 4 numeros
     * @param x El primer numero
     * @param y El segundo numero
     * @param a El tercer numero
     * @param b El quarto numero
     * @return El mayor entre a, b, x, y
     */
    public static int Mayor(int x, int y, int a, int b) {
        int mayor = x;

        if(mayor < y){
            mayor = y;
        }if(mayor < a){
            mayor = a;
        }if(mayor < b){
            mayor = b;
        }
        return mayor;

    }
}