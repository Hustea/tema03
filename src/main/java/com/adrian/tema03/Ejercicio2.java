package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio2");

        double numero1;
        double numero2;

        System.out.println("Ingrese un numero");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese otro numero");
        numero2 = Integer.parseInt(scanner.nextLine());

        if (numero1 < numero2) {
            System.out.println("El primer numero es menor que el segundo");

        }else if(numero1 == numero2){
            System.out.println("El primer numero es igual al segundo ");

        }else{
            System.out.println("El primer numero es mayor que el segundo");
        }

        scanner.close();



    }
}
