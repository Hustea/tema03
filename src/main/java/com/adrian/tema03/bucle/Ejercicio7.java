package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio7 {
    public static void  main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero del 1 al 10 ");
        numero = Integer.parseInt(scanner.nextLine());
        if (numero <= 10 & numero >= 0){
            while (inicio <= limite) {
                System.out.println(numero + " x " + inicio + " = " + numero * inicio);
                inicio = inicio + 1;
            }
        }else{
            System.err.println("ERROR: El numero introducido es invalido");
        }
    }
}
