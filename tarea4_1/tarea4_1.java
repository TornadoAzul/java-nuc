package tarea4_1;

import java.util.Scanner;

public class tarea4_1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        final int SECRET = 11;
        final double TASA = 12.50;

        int num1, num2, newNum;
        String nombre;
        double hoursWorked, salarios;

        System.out.print("Ingresa un entero 🙌: ");
        num1 = console.nextInt();
        System.out.print("Ingresa otro entero 🫶: ");
        num2 = console.nextInt();

        System.out.println("El valor del primer entero es " + num1 + " y el valor del segundo entero es " + num2);

        newNum = num1 * 2 + num2;
        System.out.println("El valor del nuevo número es 👉 " + newNum);

        newNum += SECRET;
        System.out.println("El valor del nuevo número con la el de la variable SECRET es " + newNum);

        System.out.print("¿Cual es tu apellido 🥸?: ");
        nombre = console.next();

        System.out.print("¿Cuantas horas trabajaste? 🧐 (0 a 70): ");
        hoursWorked = console.nextDouble();

        salarios = TASA * hoursWorked;

        System.out.println("Tu nombre 😄: " + nombre);
        System.out.println("Tasa de pagos 🤑: $" + TASA);
        System.out.println("Horas trabajadas 🫠: " + hoursWorked);
        System.out.println("Salario 😙: $" + salarios);
    }
}
