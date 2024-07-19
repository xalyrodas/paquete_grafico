package matematicas;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Edad_1 {

    public static int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        if ((fechaNacimiento != null) && (fechaActual != null)) {
            return Period.between(fechaNacimiento, fechaActual).getYears();
        } else {
            return 0;
        }
    }

    public static void solicitarYCalcularEdad() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Introduce tu fecha de nacimiento (formato: yyyy-MM-dd): ");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

// aqui nos da ya la fecha actual
        LocalDate fechaActual = LocalDate.now();
        int edad = calcularEdad(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");

        scanner.close();
    }

    public static void main(String[] args) {
        solicitarYCalcularEdad();
    }
}