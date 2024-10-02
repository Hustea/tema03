package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio1");

        double numero;

        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(scanner.nextLine());

        if (numero % 2 == 0) {
            System.out.println("El numero es par");

        }else{
            System.out.println("El numero es inpar");
        }

        scanner.close();



    }
}
