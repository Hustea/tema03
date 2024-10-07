package com.adrian.tema03.bucle;

public class Ejercicio4 {
    public static void main(String[] args) {

        int contador;
        int limite;
        int impar;

        contador = 1;
        limite = 100;
        impar = 0;

        while (contador <= limite){
            if (contador % 2 != 0){
                System.out.println (contador);
                impar = impar + 1;
            }
            contador = contador + 1;
        }

        System.out.println (impar);
    }
}
