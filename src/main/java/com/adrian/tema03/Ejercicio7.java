package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio7");

        final float cuotaBase = 500;
        float precioFinal;
        float descuento;
        int edad;
        String padresSocios;


        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(scanner.nextLine());

        if (edad < 0) {
            System.out.println("ERROR");

        }else if (edad < 18) {
            System.out.println("Tus padres son socios? S/N");
            padresSocios = String.join(scanner.nextLine());
            if (padresSocios == "S"){
                descuento = 175;
            }else{
                descuento = 125;
            }
        }else if(edad < 65){
            descuento = 0;

        }else{
            descuento = 250;
        }

        precioFinal = cuotaBase - descuento;

        System.out.println("La cuota te va a costar " +precioFinal+ "€");

        scanner.close();



    }
}
