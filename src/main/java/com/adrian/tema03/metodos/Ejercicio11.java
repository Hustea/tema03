package com.adrian.tema03.metodos;

import java.util.Random;

public class Ejercicio11 {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            System.out.println("Resultado partido"+i+"  "+resultadoQuinela());
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
        int numeroAleatorio = random.nextInt(min, max);

        return numeroAleatorio;
    }

    /**
     * Asignar valores String a numeros
     * @return String de un valor asignado
     */
    public static String resultadoQuinela() {
        String resultado;
        int asignacion = aleatorio(1, 4);

        if(asignacion==1){
            resultado ="1";
        }else if(asignacion==2){
            resultado ="X";
        }else{
            resultado ="2";
        }
        return resultado;
    }
}

