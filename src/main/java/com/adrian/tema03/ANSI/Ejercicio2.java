package com.adrian.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora, minutos, segundos;

        do {
            System.out.print("Ingrese la hora (0-23): ");
            hora = scanner.nextInt();
        } while (hora < 0 || hora > 23);

        do {
            System.out.print("Ingrese los minutos (0-59): ");
            minutos = scanner.nextInt();
        } while (minutos < 0 || minutos > 59);

        do {
            System.out.print("Ingrese los segundos (0-59): ");
            segundos = scanner.nextInt();
        } while (segundos < 0 || segundos > 59);

        System.out.printf("La hora formateada es: %02d:%02d:%02d%n", hora, minutos, segundos);

        scanner.close();
    }
}