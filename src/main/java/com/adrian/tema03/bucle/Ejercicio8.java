package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;

        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();


        int factorial = 1;

        for (i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

