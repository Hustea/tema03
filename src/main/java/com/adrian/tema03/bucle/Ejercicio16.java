package com.adrian.tema03.bucle;

import java.util.Scanner;
import java.util.Random;


public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int dadoJugador, dadoMaquina;
        int totalJugador = 0;
        int totalMaquina = 0;
        int puntosJugador = 0;
        int puntosMaquina = 0;
        String confirmarJuego = "N";

        do{
            System.out.println(" VAMOS A JUGAR");
            do{
                String confirmarDado = "S";
                do{
                    dadoJugador = rnd.nextInt(1, 7);
                    totalJugador = totalJugador + dadoJugador;
                    System.out.println("Has sacado un " +dadoJugador);
                    System.out.println("Tu puntuacion actual es " +totalJugador);
                    if(totalJugador > 11){
                        puntosMaquina = puntosMaquina + 1;
                        System.out.println("Has sobrepasado el limite, la maquina obtiene 1 porra.");
                        System.out.println("tu tienes " +puntosJugador+ " porras, la maquina tiene " +puntosMaquina+ " porras.");
                        break;
                    }else if(totalJugador == 11){
                        puntosJugador = puntosJugador + 2;
                        System.out.println("PUNTUACION PERFECTA, obtienes 2 porra.");
                        System.out.println("tu tienes " +puntosJugador+ " porras, la maquina tiene " +puntosMaquina+ " porras.");
                    }else{
                        System.out.println("¿Quieres volver a tirar el dado? S/N");
                        confirmarDado = scanner.nextLine();
                    }
                }while(confirmarDado.equals("S"));

                if(puntosJugador >= 5){
                    System.out.println("HAS GANADO");

                }else if(puntosMaquina >= 5){
                    System.out.println("HAS PERDIDIO");

                }else{

                    do {
                        dadoMaquina = rnd.nextInt(1, 7);
                        totalMaquina = totalMaquina + dadoMaquina;
                        System.out.println("La maquina ha sacado un " +dadoMaquina);
                        System.out.println("su puntuacion actual es " +totalMaquina);
                        if(totalMaquina > 11){
                            puntosJugador = puntosJugador + 1;
                            System.out.println("La maquina a sobrepasado el limite, tu obtienes 1 porra.");
                            System.out.println("tu tienes " +puntosJugador+ " porras, la maquina tiene " +puntosMaquina+ " porras.");
                        }else if(totalMaquina == 11){
                            puntosMaquina = puntosMaquina + 2;
                            System.out.println("PUNTUACION PERFECTA,  la maquina obtiene 2 porras.");
                            System.out.println("tu tienes " +puntosJugador+ " porras, la maquina tiene " +puntosMaquina+ " porras.");
                        }else if(totalMaquina > totalJugador){
                            puntosMaquina = puntosMaquina + 1;
                            System.out.println("La maquina ha superado tu puntuacion y gana 1 porra");
                            System.out.println("tu tienes " +puntosJugador+ " porras, la maquina tiene " +puntosMaquina+ " porras.");
                        }
                    }while(totalMaquina <= totalJugador);

                    if(puntosJugador >= 5){
                        System.out.println("HAS GANADO");

                    }else if(puntosMaquina >= 5){
                        System.out.println("HAS PERDIDIO");
                    }

                }
                totalJugador = 0;
                totalMaquina = 0;
            }while(puntosJugador < 5 && puntosMaquina < 5);

            puntosJugador = 0;
            puntosMaquina = 0;

            System.out.println("¿Deseasvolver a jugar? S/N");
            confirmarJuego = scanner.nextLine();

        }while(confirmarJuego.equals("S"));



    }
}