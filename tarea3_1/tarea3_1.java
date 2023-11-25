package tarea3_1;

import java.util.Scanner;

public class tarea3_1 {
    
    public static void main(String[] args) {
        
        // Declaración e inicialización de la constante SECRET de tipo int
        final int SECRET = 11;

        // Declaración e inicialización de la constante TASA de tipo double
        final double TASA = 12.50;
        
        // Declaración de la variable hoursWorked de tipo double
        double hoursWorked = TASA;
        
        // Declaración de la variable nombre de tipo String
        String nombre;
        
        // Declaración de las variables hoursWorked y salarios de tipo double
        double salarios;

        // Creación del objeto Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // Solicitando el nombre del empleado
        System.out.print("¿Cómo se llama el empleado? ");
        nombre = sc.nextLine();

        // Solicitando la cantidad de horas trabajadas del empleado
        System.out.print("¿Cual es la cantidad de horas trabajadas por el empleado? ");
        int horasTrabajadas = sc.nextInt();

        // Cálculo del salario del empleado
        salarios = horasTrabajadas * TASA;

        // Mostrando el nombre del empleado y su salario en pantalla
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: " + salarios);
    }
}
