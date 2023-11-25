package tarea2_2;
import java.util.Scanner;
public class tarea2_2 {

    public static void main(String[] args) {
        // Aquí ponemos los datos de las películas.
        String[] peliculas = {"SpiderMan", "Avatar", "Súper Mario"};
        String[] horarios = {"6:00pm", "7:00pm", "8:00pm"};
        double precioDelBoleto = 10.00;

        // Aquí solicitamos los datos que el usuario ingresa de la película.
        Scanner scanner = new Scanner(System.in);
        System.out.print("🎫 Ingrese la cantidad de boletos que desea comprar: ");
        int cantidadBoletos = scanner.nextInt();

        // Mostrar películas y horarios disponibles
        System.out.println("🍿 Películas disponibles:");
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i] + " - Horario " + horarios[i]);
        }

        // Solicitar película seleccionada al usuario
        System.out.print("🎞️ Ingrese el nombre de la película que desea ver: ");
        String peliculaSeleccionada = scanner.next();

        // Calcular costos
        double subtotal = cantidadBoletos * precioDelBoleto;
        double ivu = subtotal * 0.11;
        double total = subtotal + ivu;

        // Mostrar resumen de la orden
        System.out.println("✨ Resumen de la Orden:");
        System.out.println("Película seleccionada: " + peliculaSeleccionada);
        System.out.println("Cantidad de boletos: " + cantidadBoletos);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVU (11%): $" + ivu);
        System.out.println("Total a Pagar: $" + total);

        // Cerrar el scanner
        scanner.close();
    }
}

// Emmanuel Alicea Rodríguez
// Tarea 2.2 (PROG 3375L)