package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        System.out.println("Ingrese el valor de x");
        x = scanner.nextInt();
        System.out.println("Ingrese el valor de y");
        y = scanner.nextInt();

        int resultado = sumar(x, y);
        System.out.println("La suma de " + x + " y " + y + " es: " + resultado);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}