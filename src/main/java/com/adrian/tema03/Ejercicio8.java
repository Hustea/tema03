package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio8");

        int dado;

        System.out.println("Ingrese el resultadodel dado");
        dado = Integer.parseInt(scanner.nextLine());
        scanner.close();

        switch(dado){
            case 1 -> System.out.println("6");
            case 2 -> System.out.println("5");
            case 3 -> System.out.println("4");
            case 4 -> System.out.println("3");
            case 5 -> System.out.println("2");
            case 6 -> System.out.println("1");
            default -> System.err.println("ERROR: numero incorrecto");

        }

    }
}
