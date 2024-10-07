package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio6 {
    public static void  main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int i;
        int limite;
        int numero;
        int numeroValido;

        i = 1;
        limite = 10;
        numeroValido = 0;

        do{
            System.out.println("Ingrese un numero del 1 al 10 ");
            numero = Integer.parseInt(scanner.nextLine());

            if (numero <= 10 & numero >= 0){
                numeroValido = 1;
            }else{
                System.out.println("El numero introducido es invalido");
            }
        }while(numeroValido == 0);

        for (i =1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}
