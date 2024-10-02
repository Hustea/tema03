package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio5");

        int nota;

        System.out.println("Ingrese su nota");
        nota = Integer.parseInt(scanner.nextLine());



        if (nota < 0) {
            System.out.println("ERROR");

        }else if (nota < 5) {
            System.out.println("INSUFICIENTE");

        }else if(nota < 6){
            System.out.println("SUFICIENTE");

        }else if(nota < 7){
            System.out.println("BIEN");

        }else if(nota < 9){
            System.out.println("NOTABLE");

        }else if(nota < 11){
            System.out.println("SOBRESALIENTE");

        }else{
            System.out.println("ERROR");
        }

        scanner.close();



    }
}
