import java.io.*;
import java.util.Scanner;

public class EscrituraArchivo {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("¿Cómo se llama el archivo en el que quieres guardar todo? ");
        final String NOMBRE_ARCHIVO = scanner.nextLine();

        try {
            var escritor = new FileWriter(NOMBRE_ARCHIVO);


            System.out.println("Introduce las lineas de texto (para terminar, linea vacia) ");
            String linea;

            while (true){
                linea = scanner.nextLine();
                if (linea.isEmpty())
                    break;
                escritor.write(linea+"\n");
            }

            escritor.close();

            //ahora leo el archivo
            var lector = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

            System.out.println("Estupendo, ahora vas a ver lo que has guardado en el fichero");
            System.out.println("=======================");


            while (true){
                linea = lector.readLine();
                if (linea == null)
                    break;
                System.out.println(linea);
            }

            lector.close();



        } catch (IOException e) {
            System.out.println("Error de E/S");
            throw new RuntimeException(e);
        }








    }
}
