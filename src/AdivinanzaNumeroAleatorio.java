import java.util.Random;
import java.util.Scanner;

public class AdivinanzaNumeroAleatorio {

    public static void mostrarPista(int numeroIntroducido, int numeroAdivinar){

        if (numeroAdivinar < numeroIntroducido)
            System.out.println("PISTA: El numero a adivinar es menor que el que has introducido");
        else if (numeroAdivinar > numeroIntroducido)
            System.out.println("PISTA: El numero a adivinar es mayor que el que has introducido");

    }

    public static void main(String[] args) {

        //esta es una version de la adivinanza de un numero pero con intentos limitados

        Random random = new Random();
        final int SECRET_NUMBER = random.nextInt(100) + 1; // Genera un número int aleatorio entre 1 y 100

        final int INTENTOS = 10;

        var scanner = new Scanner(System.in);

        System.out.println("Este script se trata de un juego que consiste en adivinar un numero. Tienes "+INTENTOS+" intentos");
        System.out.println("¿Qué numero crees que es?");
        int numero = scanner.nextInt();

        int intentosConsumidos = 0;

        if (numero == SECRET_NUMBER)
            System.out.println("¡Enhorabuena, has acertado!");
        else{

            int diferencia;

            intentosConsumidos++;

            while (intentosConsumidos < INTENTOS){
                diferencia = INTENTOS-intentosConsumidos;
                mostrarPista(numero, SECRET_NUMBER);
                System.out.print("Has fallado, intentalo otra vez, te quedan "+diferencia+" intentos. Pruebe otro numero: ");
                numero = scanner.nextInt();
                if (numero == SECRET_NUMBER){
                    System.out.println("¡Enhorabuena!. Has acertado a los "+intentosConsumidos+" intentos");
                    break;
                }

                intentosConsumidos++;


            }

            if (intentosConsumidos == INTENTOS)
                System.out.println("Vaya, no pudiste adivinarlo. El numero a adivinar era "+SECRET_NUMBER);



        }


    }
}
