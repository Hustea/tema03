package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio;
        System.out.println("Ingrese el valor del radio");
        radio = scanner.nextDouble();

        double resultadoArea = Area(radio);
        System.out.println("El area de un circulo con radio de " + radio + " es: " + resultadoArea);

        double resultadoLongitud = Longitud(radio);
        System.out.println("La longitud de un circulo con radio de " + radio + " es: " + resultadoLongitud);
    }

    public static double Area(double a) {
        return 3.141592 * (a * a);
    }
    public static double Longitud(double a) {
        return 3.141592 * a;
    }
}