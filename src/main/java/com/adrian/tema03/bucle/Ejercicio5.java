package com.adrian.tema03.bucle;

public class Ejercicio5 {
    public static void main(String[] args) {

        int contador;
        int limite;
        int multiple5;
        int multiple5Total;
        int par;
        int parTotal;
        int impar;
        int imparTotal;


        contador = 1;
        limite = 100;
        multiple5 = 0;
        par = 0;
        impar = 0;
        multiple5Total = 0;
        parTotal = 0;
        imparTotal = 0;

        while (contador <= limite){
            System.out.print(contador);

            if (contador % 5 == 0){
                System.out.println(" Es multiple de 5");
                multiple5 = multiple5 + 1;
                multiple5Total = multiple5Total + contador;

            }else if(contador % 2 == 0){
                System.out.println(" Es par");
                par = par + 1;
                parTotal = parTotal + contador;

            }else{
                System.out.println(" Es inpar");
                impar = impar + 1;
                imparTotal = imparTotal + contador;
            }

            contador = contador + 1;
        }

        System.out.println("El numero de multiples de 5 es " +multiple5+ " y la suma de todos ellos es " +multiple5Total);
        System.out.println("El numero de pares es " +par+ " y la suma de todos ellos es " +parTotal);
        System.out.println("El numero de impares es " +impar+ " y la suma de todos ellos es " +imparTotal);

    }
}
