package com.adrian.tema03.metodos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idioma;
        String nom;

        System.out.println("Nombre:");
        nom = scanner.nextLine();

        do {
            System.out.println("Seleccione un idioma \n Valenciano[1] Castellano[2] Ingles[3]");
            idioma = scanner.nextInt();
        } while (idioma != 1 && idioma != 2 && idioma != 3);

        resultadoTexto(nom, idioma);

        scanner.close();
    }


    /**
     * Asignar valores String a numeros
     *
     * @return String de un valor asignado
     */
    public static void resultadoTexto(String nom, int num) {
        String resultado = "";

        switch (num) {
            case 1 -> resultado = "Bon dia ";
            case 2 -> resultado = "Buenos dias ";
            case 3 -> resultado = "Good morning ";
        }
        resultado += nom;

        System.out.println(resultado); // Yo habria puesto un return, pero el ejercicio lo especifica asi.
    }
}
