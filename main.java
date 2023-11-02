package ahorcado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // escojer la palabra
        List<String> palabrasGrupales = cargarPalabrasDesdeArchivo("palabrasSecretas.txt");
        int random = (int) (Math.random() * palabrasGrupales.size());
        String palabraSecreta = palabrasGrupales.get(random);

        // poner '_' por cada letra
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        Arrays.fill(palabraAdivinada, '_');

        int intentos = 10;

        System.out.println("La palabra tiene " + palabraSecreta.length() + " caracteres.");

        while (intentos > 0) {
            System.out.println("****************************************");
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Palabra adivinada: ");
            mostrarPalabraAdivinada(palabraAdivinada);

            char caracter = obtenerCaracter(scanner);

            boolean acierto = actualizarPalabraAdivinada(palabraSecreta, palabraAdivinada, caracter);

            if (acierto) {
                if (Arrays.equals(palabraAdivinada, palabraSecreta.toCharArray())) {
                    System.out.println("¡Felicidades, ganaste! La palabra era: " + palabraSecreta);
                    break;
                }
            } else {
                intentos--;
                System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
                if (intentos == 0) {
                    System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
                }
            }
        }
    }


    public static void mostrarPalabraAdivinada(char[] palabraAdivinada) {
        for (char c : palabraAdivinada) {
            System.out.print(c + " ");
        }
        System.out.println();
    }


    public static char obtenerCaracter(Scanner scanner) {
        char caracter = ' ';
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingresa una letra: ");
                caracter = scanner.nextLine().charAt(0);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada no válida. Ingresa una sola letra.");
            }
        }

        return caracter;
    }


    public static boolean actualizarPalabraAdivinada(String palabraSecreta, char[] palabraAdivinada, char caracter) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == caracter) {
                palabraAdivinada[i] = caracter;
                acierto = true;
            }
        }

        return acierto;
    }

    public static List<String> cargarPalabrasDesdeArchivo(String nombreArchivo) {
        List<String> palabras = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(nombreArchivo));
            while (scanner.hasNextLine()) {
                palabras.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("No se pudo cargar el archivo de palabras: " + e.getMessage());
        }

        return palabras;
    }
}
