/*
package com.adrian.tema03.ANSI;

public class Ejercicio3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= (10 - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/
package com.adrian.tema03.ANSI;

public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "";
        for (int i = 1; i <= 9; i++) {
            cadena = cadena + i;
            System.out.printf("%9s\n" ,cadena);
        }
    }
}