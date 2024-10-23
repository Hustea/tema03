package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String resultado;

        do{
            System.out.println("Ingrese un numero");
            num = scanner.nextInt();
            if(num < 0){
                break;
            }
            resultado = tabla(num);
            System.out.println(resultado);
            System.out.println();
        }while(num >= 0);
    }

    /**
     * Crear tablas de multiplicacion
     * @param num el numero que se debe multiplicar
     * @return tabla de multiplicar
     */
    public static String tabla(int num) {
        String resultado ="";
        int mul;
        for (int i = 1; i <= 10; i++) {
            mul = num * i;
            resultado += num+" * "+i+" = "+mul+"\n";

        }
        return resultado;
    }
}
