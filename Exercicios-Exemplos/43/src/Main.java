import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        int[] N = new int[10];

        for (int i = 0; i < 10; i++) {

            if (i == 0) {
                N[0] = valor;
            } else {
                N[i] = N[i - 1] * 2;
            }

            System.out.printf("N[%d] = %d\n", i, N[i]);
        }

        scanner.close();
    }
}