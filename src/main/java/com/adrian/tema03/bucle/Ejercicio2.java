package com.adrian.tema03.bucle;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numero;
        int sumatorio;
        int limite;

        numero = 1;
        sumatorio = 1;
        limite = 1000;

        do {
            numero = numero +1;
            sumatorio = sumatorio + numero;
        } while (limite > numero);

        System.out.println (sumatorio);
    }
}
