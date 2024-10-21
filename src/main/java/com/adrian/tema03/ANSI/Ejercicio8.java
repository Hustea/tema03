package com.adrian.tema03.ANSI;

public class Ejercicio8 {
    public static void main(String[] args) {
        int color = 29;
        int fondo = 39;
        for (int negrita = 0; negrita <= 1; negrita++) {
            for ( color = 30; color <= 37; color++) {
                for (fondo = 40; fondo <= 47; fondo++) {
                    System.out.print("\u001B["+negrita+";"+color+";"+fondo+"m "+negrita+";"+color+";"+fondo+" \u001B[0m");
                }
                System.out.println();
            }
        }
    }
}