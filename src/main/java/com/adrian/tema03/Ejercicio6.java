package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cantidad;
        int centimos;
        int valoresMonedas;
        int valor;
        int numMonedas;

        System.out.print("Ingrese la cantidad de dinero en euros: ");
        cantidad = Double.parseDouble(scanner.nextLine());

        centimos = cantidad * 100;

        valoresMonedas = {200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("La cantidad mínima de monedas es:");

        for (int valor : valoresMonedas) {
            int numMonedas = centimos / valor;
            centimos %= valor;

            if (numMonedas > 0) {
                System.out.println(numMonedas + " monedas de " + valor / 100.0 + "€");
            }
        }
    }
}