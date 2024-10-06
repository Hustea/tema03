package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio9");

        int numero1;
        int numero2;
        int producto;
        int contador;

        producto = 0;
        contador = 1;

        System.out.println("Ingrese el primer numero a multiplicar");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el segundo numero a multiplicar");
        numero2 = Integer.parseInt(scanner.nextLine());

        scanner.close();
        while (contador <= numero2){
            producto = producto + numero1;
            contador = contador + 1;
        }

        System.out.println (producto);
    }
}
