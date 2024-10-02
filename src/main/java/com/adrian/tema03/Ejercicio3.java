package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio3");

        double numero;

        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(scanner.nextLine());

        if (numero < 18) {
            System.out.println("Eres menor de edad");

        }else{
            System.out.println("Eres mayor de edad");
        }

        scanner.close();



    }
}
