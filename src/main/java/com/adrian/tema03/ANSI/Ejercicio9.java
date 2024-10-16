package com.adrian.tema03.ANSI;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ciudad ="";
        String fecha ="";
        String horaTotal ="";
        int uvi, lluvia, velocidadViento, ano, mes, dia, hora, minutos, segundos;
        int colorVelocidad, colorTemperatura, colorLluvia, colorUvi;
        float temperatura, presion;


        System.out.print("Ingrese el nomre de la ciudad: ");
        ciudad = scanner.nextLine();

        do {
            System.out.print("Ingrese el dia (1-31): ");
            dia = scanner.nextInt();
        } while (dia < 1 || dia > 31);
        do {
            System.out.print("Ingrese el mes (1-12): ");
            mes = scanner.nextInt();
        } while (mes < 1 || mes > 12);
        do {
            System.out.print("Ingrese el año (2024-2200): ");
            ano = scanner.nextInt();
        } while (ano < 2024 || ano > 2200);
        do {
            System.out.print("Ingrese la hora (0-23): ");
            hora = scanner.nextInt();
        } while (hora < 0 || hora > 23);
        do {
            System.out.print("Ingrese los minutos (0-59): ");
            minutos = scanner.nextInt();
        } while (minutos < 0 || minutos > 59);
        do {
            System.out.print("Ingrese los segundos (0-59): ");
            segundos = scanner.nextInt();
        } while (segundos < 0 || segundos > 59);
        do{
            System.out.print("Ingrese la velocidad del viento (0-1000):");
            velocidadViento = scanner.nextInt();
        }while(velocidadViento < 0 || velocidadViento > 1000);
        do{
            System.out.print("Ingrese la temperatura C ((-50) - (70)):");
            temperatura = scanner.nextFloat();
        }while(temperatura < -50 || temperatura > 70);
        do{
            System.out.print("Ingrese la Presion atmosferica (0 - 4):");
            presion = scanner.nextFloat();
        }while(presion < 0 || presion > 4);
        do{
            System.out.print("Ingrese la probabilidad de lluvia (0 - 100):");
            lluvia = scanner.nextInt();
        }while(lluvia < 0 || lluvia > 100);
        do{
            System.out.print("Ingrese el indice de radiacion ultravioleta (0 - 11):");
            uvi = scanner.nextInt();
        }while(uvi < 0 || uvi > 11);

        scanner.close();
//colores
        if(velocidadViento < 30){
            colorVelocidad = 33;
        }else if(velocidadViento > 60){
            colorVelocidad = 31;
        }else{
            colorVelocidad = 32;
        }

        if(temperatura < 22){
            colorTemperatura = 36;
        }else if(temperatura > 35){
            colorTemperatura = 31;
        }else if(temperatura < 27){
            colorTemperatura = 33;
        }else{
            colorTemperatura = 32;
        }
        if(lluvia < 35){
            colorLluvia =33;
        }else if(lluvia > 70){
            colorLluvia =31;
        }else{
            colorLluvia =32;
        }
        if(uvi < 2){
            colorUvi =32;
        }else if(uvi < 5){
            colorUvi =34;
        }else if(uvi < 7){
            colorUvi =33;
        }else if(uvi <10){
            colorUvi =31;
        }else{
            colorUvi =35;
        }

//Abreviar fecha y hora
        fecha =dia+"/"+mes+"/"+ano;
        horaTotal =hora+":"+minutos+":"+segundos;
//imprimir
        System.out.printf("\u001B[1;37;44m ** DATOS ESTACION METEOROLOGICA ** \u001B[0m \n");
        System.out.printf("%-25s %s\n", "Ciudad:", ciudad);
        System.out.printf("%-25s %s\n", "Fecha:", fecha);
        System.out.printf("%-25s %s\n", "Hora de la mesura:", horaTotal);
        System.out.printf("\u001B[1;" + colorVelocidad + "m %-25s "+velocidadViento+"km/h \u001B[0m \n", "Velocidad viento:");
        System.out.printf("\u001B[1;" + colorTemperatura + "m %-25s "+temperatura+"C \u001B[0m \n", "Temperatura:");
        System.out.printf("%-25s %s hPa \n", "Presion atmosferica:", presion);
        System.out.printf("\u001B[1;" + colorLluvia + "m %-25s "+lluvia+" \u001B[0m \n", "Probabilidad lluvia:");
        System.out.printf("\u001B[1;" + colorUvi + "m %-25s "+uvi+" \u001B[0m \n", "UVI:");


    }
}