package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();

        int resultado = sumatorio(num);
        System.out.println("El resultado es:"+resultado);

    }

    /**
     * Hacer una especie de factorial pero con sumas
     * @param num numero del "factorial"
     * @return El resultado de las sumas
     */
    public static int sumatorio(int num) {
        int resultado =0;
        for (int i = 1; i <= num; i++) {
            resultado += i;
        }
        return resultado;
    }
}
