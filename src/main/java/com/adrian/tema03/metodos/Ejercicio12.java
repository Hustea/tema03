package com.adrian.tema03.metodos;

import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int nota;
        String calificacion;

        for(int i = 1; i <= 50; i++){
            nota = aleatorio(min, max);
            calificacion = resultadoTexto(nota);
            System.out.println(calificacion);
        }
    }


    /**
     * Generar un resultado aleatorio
     * @param min numero minimo del resultado
     * @param max numero maximo del resultado
     * @return numero aleatrrio
     */
    public static int aleatorio(int min, int max) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(min, max+1);

        return numeroAleatorio;
    }


    /**
     * Asignar valores String a numeros
     * @return String de un valor asignado
     */
    public static String resultadoTexto(int num) {
        String resultado = "";

        if (num < 5){
            resultado = "INSUFICIENTE";
        }else if(num < 6){
            resultado = "SUFICIENTE";
        }else if(num < 7){
            resultado = "BIEN";
        }else if(num < 9){
            resultado = "NOTABLE";
        }else{
            resultado = "SOBRESALIENTE";
        }
        return resultado;
    }
}
