package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float sumatorio = 0;
        float numero;
        int i = 0;

        do {
            System.out.println("Ingrese un numero entero: ");
            numero = scanner.nextInt();

            if (numero > 0){
                sumatorio = sumatorio + numero;

                i++;
            }else{
                break;
            }

        }while (numero > 0);

        System.out.println("La media de los numero ingresados es " +(sumatorio / i));
    }
}