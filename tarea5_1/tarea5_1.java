package tarea5_1;

import static java.lang.Math.pow;

public class tarea5_1 {
      public static void main(String args[]) {
        // Declaración de números.
        double num1, num2;
        
        // Almacenar los números.
        num1 = 33.2;
        num2 = 44.5;
        
        // Acciones tomadas.
        double resultado = pow(num1, num2);
        System.out.println(num1 + " a la potencia de " + num2 + " es igual a " + resultado);
    }
}
