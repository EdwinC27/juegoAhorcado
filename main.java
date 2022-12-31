package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // escojer la palabra
        String[] palabrasGrupales = {"hola", "trabajo", "casa", "programacion", "nombre", "mexico", "microfono", "carro", "celular", "computadora", "programa"};
        int random = (int) (Math.random() * 10);
        char[] arr = palabrasGrupales[random].toCharArray();
        int intentos = 10;

        char[] caracteres = new char[arr.length];

        System.out.println("La palabar tiene " + arr.length + " caracteres");

        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = '_';
        }

        while (intentos >= 0) { // inicia el juego
            try {
                System.out.print("Caracter: ");
                char caracter = scanner.nextLine().charAt(0);

                // si esta el caracter
                boolean ban = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == caracter) {
                        caracteres[i] = arr[i];
                        ban = true;
                    }
                }

                if (Arrays.equals(caracteres, arr)) { // comprobar si ya esta la cadena
                    System.out.println("\nFelicidades ganaste la palabra era: ");
                    System.out.println(arr);
                    break;

                } else if (ban) { // no hacer nada

                } else { // no estaba la letra
                    intentos--;
                    if (intentos == 0) {
                        System.out.println("Perdiste");
                        break;
                    }
                    System.out.println("Te quedan " + intentos + " intentos");
                }

                for (int i = 0; i < arr.length; i++) { // mostrar la posicion del juego
                    System.out.print(caracteres[i]);
                }

                System.out.println("\n");
            } catch (Exception e) {
                System.out.println("\nError al ingresar el dato vuelva a intentar\n");
            }
        }

    }
}
