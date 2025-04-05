import java.util.Random;
import java.util.Scanner;

public class AdivinanzaIlimitada {

    public static void mostrarPista(int numeroIntroducido, int numeroAdivinar){

        //esta es una version de la adivinanza de un numero pero de forma ilimitada

        if (numeroAdivinar < numeroIntroducido)
            System.out.println("PISTA: El numero a adivinar es menor que el que has introducido");
        else if (numeroAdivinar > numeroIntroducido)
            System.out.println("PISTA: El numero a adivinar es mayor que el que has introducido");
    }



    public static void main(String[] args) {

        System.out.println("Este script se trata de un juego que consiste en adivinar un numero. Los intentos son ilimitados");
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Genera un número int aleatorio entre 1 y 100

        var scanner = new Scanner(System.in);

        int numero;

        int contadorIntentos = 0;

        do {
            System.out.println("¿Qué numero crees que es?");
            numero = scanner.nextInt();

            mostrarPista(numero, secretNumber);

            contadorIntentos++;

        }while (numero != secretNumber);

        if (contadorIntentos == 0)
            System.out.println("¡Enhorabuena, acertaste a la primera");
        else
            System.out.println("Enhorabuena, has acertado despues de "+contadorIntentos+" intentos");


    }
}
