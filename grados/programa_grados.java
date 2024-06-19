package grados;

import java.util.Scanner;

public class programa_grados {

    public static void pgrados() {

        // Crea una lista de 4 opciones
        String[] ListaOpciones = {
                "F/Celcios", "Celcios/F",
        };
        // Imrpime las opciones de la lista
        for (int i = 0; i < ListaOpciones.length; i++) {
            System.out.printf("[%d] %s", i + 1, ListaOpciones[i]);

            for (int j = 0; j < (9 - ListaOpciones[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("La temperatura en Celsius es: " + celsius);

        scanner.close();
    }
}