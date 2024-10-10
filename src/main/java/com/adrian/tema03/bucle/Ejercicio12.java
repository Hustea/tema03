package com.adrian.tema03.bucle;

import java.util.Scanner;
import java.util.Random;


public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int aleatorio = rnd.nextInt(100);
        int i = 0;
        int intentos, numero;

        System.out.println("Ingrese el numero de intentos: ");
        intentos = scanner.nextInt();

        do {
            System.out.println("Adivina el numero: ");
            numero = scanner.nextInt();

             if(numero < aleatorio){
                 System.out.println("El numero secreto es mayor");
             }else if(numero > aleatorio){
                System.out.println("El numero secreto es menor");
             }else{
                 System.out.println("Has acertado el numero FELICIDADES");
                 break;
             }

             i++;
        }while(intentos > i);

        System.out.println("El numero secreto era " +aleatorio);
    }
}