import java.util.Scanner;

public class Ejercicio08 {
    private static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {

        String mensaje = "Ingrese un numero de 4 digitos:";
        int longitudMinima = 1000;
        int longitudMaxima = 9999;
        int x;
        x = solicitarInt(mensaje, longitudMinima, longitudMaxima);

        boolean esCapicua = capicua(x);

        if(esCapicua == true){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }

    }

    /**
     * Comprueba si el numero ingresado es capicua
     * @param num numero que queremos saber si es capicua
     * @return booleano confirmacion de si es capicua
     */
    public static boolean capicua(int num) {
        boolean resultado = false;
        int num1, num2, num3, num4;
        num1 = num % 10;
        num2 = (num % 100) - num1;
        num3 = (num % 1000) - num % 100;
        num4 = (num % 10000) - num % 1000;

        num2=num2/10;
        num3=num3/100;
        num4=num4/1000;

        if(num1 == num4 && num2 == num3){
            resultado = true;
        }
        return resultado;
    }

    /**
     * solicitar un texto y validar su longitud este comprendidda entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrara al usuario
     * @param longitudMinima Numero minimo de caracteres que debe tener el texto
     * @param longitudMaxima Numero maximo de caracteres que debe tener el texto
     * @return el texto leido validado
     */
    public static int solicitarInt(String mensaje, int longitudMinima, int longitudMaxima ) {
        int x;
        boolean valido;
        do {
            System.out.println(mensaje);
            x = scanner.nextInt();
            valido = x >= longitudMinima && x <= longitudMaxima;
            if(!valido){
                System.err.println("numero invalido");
            }
        }while(!valido);

        return x;
    }

    public static void liberacion(){
        scanner.close();
    }
}
