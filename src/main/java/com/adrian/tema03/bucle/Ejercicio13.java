package com.adrian.tema03.bucle;

import java.util.Scanner;
import java.util.Random;


public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int moneda;
        int i = 0;
        int intentos = 1000000;
        int cara = 0;
        int cruz = 0;
        float porcentajeCara;
        float porcentajeCruz;

        do {
            moneda = rnd.nextInt(2);

            if(moneda == 1){
                cara = cara +1;

            }else{
                cruz = cruz +1;
            }

            i++;
        }while(intentos > i);

        porcentajeCara = (float)cara / intentos * 100;
        porcentajeCruz = (float)cruz / intentos * 100;

        System.out.println("Han salido " +cara+ " veces CARA y " +cruz+ " veces CRUZ");
        System.out.println(porcentajeCara+ "% CARA");
        System.out.println(porcentajeCruz+ "% CRUZ");
    }
}