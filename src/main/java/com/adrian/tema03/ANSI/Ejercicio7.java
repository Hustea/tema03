
/*
package com.adrian.tema03.ANSI;

public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena = "";
        String cadena2 = "";
        for (int i = 1; i <= 9; i++) {
            cadena = cadena + i;
            cadena2 = i + cadena2;
            System.out.printf("%9s" ,cadena);
            System.out.println(cadena2);
        }
    }
}
*/

package com.adrian.tema03.ANSI;

public class Ejercicio7 {
    public static void main(String[] args) {
        String cadena = "";
        for (int i = 1; i <= 9; i++) {
            cadena = cadena + i;
            System.out.printf("%9s" ,cadena);
            for(int j = i - 1; j >= 0; j--){
                System.out.print(cadena.charAt(j));
            }
            System.out.println();
        }
    }
}