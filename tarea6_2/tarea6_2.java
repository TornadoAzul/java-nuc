package tarea6_2;

public class tarea6_2 {
    public static void main(String[] args) {
        double[] alfa = new double[50];

        for (int i = 0; i < 25; i++) {
            alfa[i] = Math.pow(i, 2);
        }

        for (int i = 25; i < 50; i++) {
            alfa[i] = 3 * i;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(alfa[i] + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}

