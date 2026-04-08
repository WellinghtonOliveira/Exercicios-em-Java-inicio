import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fatorial = 1;


        for (int i = n; i > 0; i--) {
            fatorial = i * fatorial;
        }

        System.out.println(fatorial);

        scanner.close();
    }
}
