package com.adrian.tema03.ANSI;

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena = "";
        int color = 29;
        int fondo = 39;
        for (int i = 1; i <= 9; i++) {
            cadena = cadena + i;
            color = color +1 ;
            if (color == 38){
                color =30;
            }
            System.out.printf("\u001B[1;" + color + ";" +fondo+ "m %9s \u001B[0m \n" ,cadena);
        }
    }
}