package com.adrian.tema03.metodos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int porrasJugador;
        int porrasMaquina;
        int opcion;

        do {
            System.out.println("JUEGO DE DADOS ONCE");
            System.out.println("Jugar 1");
            System.out.println("Salir 0");
            System.out.print("\nElige una opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion == 1) {
                porrasMaquina = 0;
                porrasJugador = juego();
                if (porrasMaquina >= 5) {
                    System.out.println("La maquina ha gana");
                } else if (porrasJugador >= 5) {
                    System.out.println("Has ganado");
                }
            }
        } while (opcion != 0);
        scanner.close();
    }
    /**
     * Aqui es donde empieza la partida
     * @return Devolvera el resultado del jugador
     * @throws InterruptedException Esto no me lo han explicado pero supongo que es si hay alguna interrupcion que haga expecion (que vaya el sleep basicamente)
     */
    public static int juego() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        boolean plantado = false;
        int puntosJugador = 0;
        int porrasJugador = 0;
        int puntosMaquina;
        int porrasMaquina = 0;
        char plantarse;

        do {

            puntosJugador = jugador(puntosJugador);

            if (puntosJugador < 11) {
                System.out.print("¿Deseas plantarte con " + puntosJugador +" puntos? (s/n): ");
                plantarse = scanner.nextLine().charAt(0);
                plantado =  plantarse == 's' || plantarse == 'S';

                if (plantado) {
                    plantado = false;


                    puntosMaquina = maquina(puntosJugador);


                    if (puntosMaquina > 11) {
                        System.out.println("La maquina se ha pasado. Obtienes una porra");
                        porrasJugador++;
                        puntosJugador = 0;
                    } else if (puntosMaquina > puntosJugador) {
                        if (puntosMaquina == 11) {
                            System.out.println("¡ONCE!");
                            System.out.println("La maquina obtiene dos porras");
                            porrasMaquina += 2;
                            puntosJugador = 0;
                        } else {
                            System.out.println("La maquina ha mejorado tu puntuación y obtiene una porra");
                            puntosJugador = 0;
                            porrasMaquina++;
                        }
                    } else { // Empate
                        System.out.println("Empate!! Porra para los dos");
                        porrasMaquina++;
                        porrasJugador++;
                        puntosJugador = 0;
                    }


                    System.out.println("* " + porrasJugador + " PLAYER  -  CPU " +porrasMaquina + " *");
                    System.out.print("\nPulsa intro para continuar...");
                    scanner.nextLine();
                }

            } else if (puntosJugador == 11) {

                porrasJugador += 2;
                puntosJugador = 0;
                System.out.println("ONCE");
                System.out.println("\n¡Bonificación! Doble porra");

                System.out.println("* " + porrasJugador + " Tu  -  La maquina " +porrasMaquina + " *");
                System.out.print("\nPulsa intro para continuar...");
                scanner.nextLine();
            } else {

                System.out.println("Te has pasado");
                System.out.println("Porra para la Maquina");
                porrasMaquina += 1;
                puntosJugador = 0;
                System.out.println("* " + porrasJugador + " Tu  -  La maquina " +porrasMaquina + " *");
                System.out.print("\nPulsa intro para continuar...");
                scanner.nextLine();
            }

        } while (porrasJugador < 5 && porrasMaquina < 5);
        return porrasJugador;
    }

    /**
     * Aqui es donde se tirara del 1 al 6 (Si se quiere modificar la posibilidad de uno u otro vaya a su variable)
     * @param min el minimo de la tirada
     * @param max el maximo de la tirada
     * @return devolvera la tirada
     */
    public static int proabilidad(int min, int max) {
        Random proabilidad = new Random();
        int aleatorio = proabilidad.nextInt(min, max);
        return aleatorio;
    }

    /**
     * Aqui es donde jugara el jugador
     * @param puntosPlayer El puntuaje del jugador donde saldra y si sigue jugando no pierda los puntos
     * @return //devolvera el valor de los puntos
     * @throws InterruptedException Lee el principio
     */
    public static int jugador(int puntosPlayer) throws InterruptedException {
        int tiradaPlayer;
        System.out.println("Jugador lanza el dado");
        tiradaPlayer = proabilidad(1, 7);
        System.out.println(tiradaPlayer);
        puntosPlayer += tiradaPlayer;
        System.out.println("\nTu puntuación actual es " + puntosPlayer);
        return puntosPlayer;
    }

    /**
     * Aqui es donde la cpu intentara igualar o superar al jugador
     * @param puntosJugador el valor del jugador para intentar igualar o superar
     * @return devolvera lo que saco la cpu
     * @throws InterruptedException Lee el principio parte 2
     */
    public static int maquina(int puntosJugador) throws InterruptedException {
        int puntosMaquina = 0;
        int tiradaMaquina;
        while (puntosMaquina < puntosJugador) {
            System.out.println("La maquina lanza el dado");
            tiradaMaquina = proabilidad(1, 7);
            System.out.println(tiradaMaquina);
            puntosMaquina += tiradaMaquina;
            System.out.println("La puntuación actual de la Maquina es " +puntosMaquina);
        }
        return puntosMaquina;
    }
}