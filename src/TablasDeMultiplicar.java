import java.util.Scanner;

public class TablasDeMultiplicar {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("¿De que numero quieres averiguar su tabla de multiplicar? ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int multiplicacion = numero*i;
            System.out.println(numero+" * "+i+" = "+multiplicacion);

        }

    }
}
