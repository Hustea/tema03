package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del que quieres optener el factorial");
        int num = scanner.nextInt();

        float resultado = factorial(num);
        System.out.println("El factorial de "+num+" es "+resultado);

    }
    public static float factorial(int num) {
        float resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
