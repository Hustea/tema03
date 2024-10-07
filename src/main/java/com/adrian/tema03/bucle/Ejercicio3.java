package com.adrian.tema03.bucle;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int producto;
        int contador;
        int negativo;

        producto = 0;
        contador = 1;
        negativo = 0;

        System.out.println("Ingrese el primer numero a multiplicar");
        numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el segundo numero a multiplicar");
        numero2 = Integer.parseInt(scanner.nextLine());
        scanner.close();


        if (numero1 > 0 & numero2  > 0) {
        }else if ( numero1 < 0 & numero2 < 0){

            numero1 = numero1 * -1;
            numero2 = numero2 * -1;

        }else if ( numero1 < 0 & numero2 > 0){
            numero1 = numero1 * -1;
            negativo = 1;
        }else{
            numero2 = numero2 * -1;
            negativo = 1;
        }


        while (contador <= numero2){
            producto = producto + numero1;
            contador = contador + 1;
        }

        if (negativo == 1){
            producto = producto * -1;
        }

        System.out.println (producto);
    }
}
