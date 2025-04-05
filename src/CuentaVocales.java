import java.util.Scanner;

public class CuentaVocales {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Introduzca una frase ");
        String frase = scanner.nextLine();

        int contador = 0;

        char caracter;

        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            switch (caracter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    contador++;
            }
        }

        System.out.println("En la frase que has introducido hay "+contador+" vocales");
    }
}
