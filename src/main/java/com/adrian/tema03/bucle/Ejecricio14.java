package com.adrian.tema03.bucle;

import java.util.Scanner;
import java.util.Random;


public class Ejecricio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int dado;
        final int INTENTOS = 1000000;
        int cara1 = 0;
        int cara2 = 0;
        int cara3 = 0;
        int cara4 = 0;
        int cara5 = 0;
        int cara6 = 0;
        float probabilidadCara1;
        float probabilidadCara2;
        float probabilidadCara3;
        float probabilidadCara4;
        float probabilidadCara5;
        float probabilidadCara6;

        for(int i = 0; i < INTENTOS; i++) {
            dado = rnd.nextInt(1, 7);

            switch(dado){
                case 1:
                    cara1++;
                    break;
                case 2:
                    cara2++;
                    break;
                case 3:
                    cara3++;
                    break;
                case 4:
                    cara4++;
                    break;
                case 5:
                    cara5++;
                    break;
                case 6:
                    cara6++;
                    break;
                default:
            }
        }

        probabilidadCara1 = (float)cara1 / INTENTOS * 100;
        probabilidadCara2 = (float)cara2 / INTENTOS * 100;
        probabilidadCara3 = (float)cara3 / INTENTOS * 100;
        probabilidadCara4 = (float)cara4 / INTENTOS * 100;
        probabilidadCara5 = (float)cara5 / INTENTOS * 100;
        probabilidadCara6 = (float)cara6 / INTENTOS * 100;

        System.out.println("La cara 1 ha salido " +cara1+ " veces en " + INTENTOS + " intentos, por lo tanto tiene " +probabilidadCara1+ "% deprobabilidad de salir" );
        System.out.println("La cara 2 ha salido " +cara2+ " veces en " + INTENTOS + " intentos, por lo tanto tiene " +probabilidadCara2+ "% deprobabilidad de salir" );
        System.out.println("La cara 3 ha salido " +cara3+ " veces en " + INTENTOS + " intentos, por lo tanto tiene " +probabilidadCara3+ "% deprobabilidad de salir" );
        System.out.println("La cara 4 ha salido " +cara4+ " veces en " + INTENTOS + " intentos, por lo tanto tiene " +probabilidadCara4+ "% deprobabilidad de salir" );
        System.out.println("La cara 5 ha salido " +cara5+ " veces en " + INTENTOS + " intentos, por lo tanto tiene " +probabilidadCara5+ "% deprobabilidad de salir" );
        System.out.println("La cara 6 ha salido " +cara6+ " veces en " + INTENTOS + " intentos, por lo tanto tiene " +probabilidadCara6+ "% deprobabilidad de salir" );
    }
}