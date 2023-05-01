/**
 * autor Jairo Alexis Rojas Ramirez - 1152142
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = 100;
        boolean first = true;
        while (casos != 0) {
            // Leer la entrada del usuario
            String input = scanner.nextLine();

            // Llamar al método sortSentence y mostrar el resultado
            String result = sortSentence(input);

            if (first) {
                System.out.println("La oración ordenada es: ");
                first = false;
            } else {
                System.out.println("");
                System.out.println("La oración ordenada es: ");
            }
            System.out.println(result);
            casos--;
        }
    }

    /**
     * Toma una oración en formato String y la ordena en función del último
     * número presente en cada palabra. Devuelve la oración ordenada.
     *
     * @param s la oración a ordenar
     * @return la oración ordenada por el último número presente en cada palabra
     */
    public static String sortSentence(String s) {
        String[] palabras = s.split(" ");
        String[] palabrasOrdenadas = new String[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int indice = palabra.charAt(palabra.length() - 1) - '0';
            palabrasOrdenadas[indice - 1] = palabra.substring(0, palabra.length() - 1);
        }
        return String.join(" ", palabrasOrdenadas);
    }
}
