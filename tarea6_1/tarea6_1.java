package tarea6_1;
import java.util.*;

public class tarea6_1 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int[] items = new int[5];
        int sum = 0;

        System.out.println("Enter five integers:");

        for (int counter = 0; counter < items.length; counter++) {
            items[counter] = console.nextInt();
            sum += items[counter];
        }

        System.out.println("The sum of the numbers = " + sum);
    }
    
}
