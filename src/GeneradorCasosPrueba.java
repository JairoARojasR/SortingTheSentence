/**
 * autor Jairo Alexis Rojas Ramirez - 1152142
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GeneradorCasosPrueba {

    static String[] palabras1 = {"Elephant", "Sunshine", "Guitar", "Waterfall",
        "Pizza", "Mountain", "Computer", "Chocolate", "Bicycle", "Rainbow"};

    public static void main(String[] args) {
        Random rand = new Random();

        generarCaso1(rand);
        generarCaso2(rand);
        generarCaso3(rand);
    }

    /**
     * Genera casos de prueba donde se comparan dos palabras
     * aleatorias. Genera 20 casos de este tipo.
     *
     * @param rand Un objeto de la clase Random para generar números aleatorios.
     */
    static void generarCaso1(Random rand) {
        for (int i = 1; i <= 20; i++) {
            int index1 = rand.nextInt(palabras1.length);
            int index2 = rand.nextInt(palabras1.length);
            while (index1 == index2) {
                index2 = rand.nextInt(palabras1.length);
            }
            String palabra1 = palabras1[index1];
            String palabra2 = palabras1[index2];
            int orden = rand.nextInt(2); // Genera un número aleatorio 0 o 1
            if (orden == 0) {
                System.out.println(palabra1 + "1 " + palabra2 + "2");
            } else {
                System.out.println(palabra2 + "2 " + palabra1 + "1");
            }
        }
    }

    /**
     * Genera casos de prueba con un número aleatorio de palabras (entre 3 y 9)
     * crea palabras en orden ascendente ordenadas. Genera 40 casos de este
     * tipo.
     *
     * @param rand Un objeto de la clase Random para generar números aleatorios.
     */
    static void generarCaso2(Random rand) {
        for (int i = 21; i <= 60; i++) {
            int numPalabras = rand.nextInt(7) + 3; // Genera un número aleatorio entre 3 y 9
            String[] caso = new String[numPalabras];
            ArrayList<String> palabrasDisponibles = new ArrayList<String>();
            for (String palabra : palabras1) {
                palabrasDisponibles.add(palabra);
            }
            int[] nums = new int[numPalabras];
            for (int j = 0; j < numPalabras; j++) {
                nums[j] = j + 1;
            }
            for (int j = 0; j < numPalabras; j++) {
                int index = rand.nextInt(palabrasDisponibles.size());
                caso[j] = palabrasDisponibles.get(index) + nums[j];
                palabrasDisponibles.remove(index);
            }
            System.out.println(String.join(" ", caso));
        }
    }

    /**
     * Genera casos de prueba con un número aleatorio de palabras (entre 3 y 9).
     * crea palabras sin orden especifico. 
     * Genera 40 casos de este tipo.
     *
     * @param rand Un objeto de la clase Random para generar números aleatorios.
     */
    static void generarCaso3(Random rand) {
        for (int i = 61; i <= 100; i++) {
            int numPalabras = rand.nextInt(7) + 3; // Genera un número aleatorio entre 3 y 9
            String[] caso = new String[numPalabras];
            ArrayList<String> palabrasDisponibles = new ArrayList<String>();
            for (String palabra : palabras1) {
                palabrasDisponibles.add(palabra);
            }
            int[] nums = new int[numPalabras];
            for (int j = 0; j < numPalabras; j++) {
                nums[j] = j + 1;
            }
            for (int j = 0; j < numPalabras; j++) {
                int index = rand.nextInt(palabrasDisponibles.size());
                caso[j] = palabrasDisponibles.get(index) + nums[j];
                palabrasDisponibles.remove(index);
            }
            ArrayList<String> CasosDisponibles = new ArrayList<>(Arrays.asList(caso));
            Collections.shuffle(CasosDisponibles);
            System.out.println(String.join(" ", CasosDisponibles));
        }
    }
}
