package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumatorio = 0;
        int numero;

        do {
            System.out.println("Ingrese un numero entero: ");
            numero = scanner.nextInt();

            sumatorio = sumatorio + numero;
        }while(numero != 0);

        System.out.println(sumatorio);
    }
}