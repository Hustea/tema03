package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio9");

        int ano;


        System.out.println("Ingrese un año");
        ano = Integer.parseInt(scanner.nextLine());


        scanner.close();


        if (ano % 400 == 0) {
            System.out.println("Es bisiesto");

        }else if (ano % 100 == 0) {
            System.out.println("No es bisiesto");

        }else if (ano % 4 == 0) {
            System.out.println("es bisiesto");

        }else{
            System.out.println("No es bisiesto");

        }
    }
}
