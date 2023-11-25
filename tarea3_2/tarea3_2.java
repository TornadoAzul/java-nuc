package tarea3_2;
import java.util.Random;
import java.util.Scanner;

public class tarea3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Autenticación de usuario
        System.out.println(" 🏨 ¡Reselva aquí en Barceloneta Resort! 🌇 ");
        System.out.print("¡Ingresa un usuario unico! 🫡: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingresa una contraseña. ¡Qué no se te olvide! 😗: ");
        String contrasena = scanner.nextLine();

        // Registro de reserva
        System.out.println("🚀 ¡Ya estás apunto de viajar! 🚏");
        System.out.print("¿Cómo te llamas? 🫵: ");
        String nombre = scanner.nextLine();
        System.out.print("¿Cuantas habitaciones rentarás? 🏠: ");
        int cantidadHabitaciones = scanner.nextInt();
        System.out.print("¿Pa' cuando viajarás? 📆 (DD/MM/AAAA): ");
        String fechaReserva = scanner.next();
        System.out.print("¿Cuantos días estarás de 'chill'? 😎: ");
        int cantidadDias = scanner.nextInt();

        // Generación de número de confirmación aleatorio
        int min = 100000;
        int max = 999999;
        int numConfirmacion = random.nextInt(max + min) + min;

        // Confirmación de la reserva
        System.out.println("🎇 ¡Estás apunto de preparar tu viaje! 🎆");
        System.out.println("Tu nombre: " + nombre);
        System.out.println("Tus habitaciones: " + cantidadHabitaciones);
        System.out.println("Fecha presente: " + fechaReserva);
        System.out.println("Días de estadía: " + cantidadDias);
        System.out.println("Número de confirmación: " + numConfirmacion);

        // Recibo de compra
        double costoHabitaciones = 150.0 * cantidadHabitaciones * cantidadDias;
        double ivu = 0.115 * costoHabitaciones;
        double total = costoHabitaciones + ivu;

        System.out.println("😻 Aquí comienza todo. ¡Toma tu recibo! Llevalo el día de tu estadía. ¡Bienvenido al Barceloneta Resort! 🙌");
        System.out.println("😃 Nombre: " + nombre);
        System.out.println("🤩 Cantidad de Habitaciones a ser reservadas: " + cantidadHabitaciones);
        System.out.println("🥳 Fecha de la reserva: " + fechaReserva);
        System.out.println("😎 Cantidad de días de su estadía en el hotel: " + cantidadDias);
        System.out.println("🤑 Costo de las habitaciones: $" + costoHabitaciones);
        System.out.println("🫣 Impuestos (IVU): $" + ivu);
        System.out.println("🧐 Total a pagar: $" + total);

        scanner.close();
    }
}
