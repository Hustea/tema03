package com.adrian.tema03;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ejercicio9");

        int lado1;
        int lado2;
        int lado3;

        System.out.println("Ingrese la longitud del primer lado");
        lado1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la longitud del segundo lado");
        lado2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la longitud del tercer lado");
        lado3 = Integer.parseInt(scanner.nextLine());

        scanner.close();


        if (lado1 == lado2 & lado2 == lado3) {
            System.out.println("es un Triangulo equilatero");

        }else if (lado1 != lado2 & lado1 != lado3 & lado2 != lado3) {
            System.out.println("es un Triangulo escaleno");

        }else{
            System.out.println("es un Triangulo isosceles");

        }
    }
}
