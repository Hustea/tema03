package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor de n:");
        int n = scanner.nextInt();

        System.out.println("Valor de m:");
        int m = scanner.nextInt();

        scanner.close();

        long resultado = equacion(n, m);

        System.out.println(resultado);

    }


    /**
     * Asignar valores String a numeros
     *
     * @return String de un valor asignado
     */
    public static long equacion(int x, int y) {
        long a = factorial(x);
        long b = factorial(y);
        long c = factorial(x-y);
        long aux = b * c;

        long resultado = a/aux;
        return resultado;

    }

    /**
     * Devolver el factorial de un numero
     * @param num Numero inicial
     * @return Factorial de num
     */
    public static long factorial(int num) {
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
