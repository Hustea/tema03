package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio4");

        int numero1;
        int numero2;

        System.out.println("Ingrese un numero");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese otro numero");
        numero2 = Integer.parseInt(scanner.nextLine());

        if (numero1 <= numero2) {
            System.out.println(numero1+" "+numero2);

        }else{
            System.out.println(numero2+" "+numero1);
        }

        scanner.close();



    }
}