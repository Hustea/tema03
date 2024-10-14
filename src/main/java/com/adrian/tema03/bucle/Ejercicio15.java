package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, m, s;
        int i = 0;

        do {
            System.out.println("Pon la hora: ");
            h = scanner.nextInt();

            System.out.println("pon los minutos: ");
            m = scanner.nextInt();

            System.out.println("pon los segundos: ");
            s = scanner.nextInt();

            if (h < 0 || h > 24) {
                System.out.println("Has puesto la hora mal");
                i++;
            }
            if (m < 0 || m > 60) {
                System.out.println("Has puesto los minutos mal");
                i++;
            }
            if (s < 0 || s > 60) {
                System.out.println("Has puesto los segundos mal");
                i++;
            }
        } while (i != 0);
        System.out.println("Son las " + h + ":" + m + ":" + s);
    }
}
