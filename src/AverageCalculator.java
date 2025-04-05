import java.util.Map;
import java.util.Scanner;

public class AverageCalculator {

    public static double getPromedio(int[] numeros){

        int suma = 0;

        for (int numero : numeros)
            suma += numero;

        return (double) suma /numeros.length;
    }

    public static double getPromedio(double[] numeros){

        double suma = 0;

        for (double numero : numeros)
            suma += numero;

        return suma /numeros.length;
    }


    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Este script va a calcular el promedio de numeros, ¿Con qué tipo de numeros deseas trabajar? i (enteros) o d (double) ");
        char opcion = scanner.nextLine().charAt(0);


        boolean decimal = opcion == 'd';

        System.out.print("¿Cuántos numeros deseas introducir para calcular el promedio? ");
        int cantidad = scanner.nextInt();

        if (!decimal) {

            int[] numeros = new int[cantidad];

            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Introduzca el número para la posición " + i + ": ");
                numero = scanner.nextInt();
                numeros[i] = numero;
            }

            double promedio = getPromedio(numeros);

            System.out.println("El promedio de los números introducidos es " + promedio);
        }
        else { //para numeros decimales

            double[] numerosDecimales = new double[cantidad];

            double numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Introduzca el número para la posición " + i + ": ");
                numero = scanner.nextDouble();
                numerosDecimales[i] = numero;
            }

            double promedio = getPromedio(numerosDecimales);

            System.out.println("El promedio de los números introducidos es " + promedio);
        }
    }
}
