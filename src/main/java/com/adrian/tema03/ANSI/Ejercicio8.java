package com.adrian.tema03.ANSI;

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena = "";
        int color = 29;
        int fondo = 39;
        for (int negrita = 0; negrita <= 1; negrita++) {
            for (int j = 1; j <= 8; j++) {
                color = color +1;
                if (color == 38){
                    color =30;
                }
                for (int i = 1; i <= 8; i++) {
                    fondo = fondo +1 ;
                    if (fondo == 48){
                        fondo =40;
                    }
                    System.out.printf("\u001B["+negrita+";"+color+";"+fondo+"m "+negrita+";"+color+";"+fondo+" \u001B[0m" ,cadena);
                }
                System.out.println();
            }
        }
    }
}