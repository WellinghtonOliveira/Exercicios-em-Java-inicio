import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int maximo = Math.max(a, b);
        int minimo = Math.min(a, b);

        for (int i = minimo + 1; i < maximo; i++) {
            if (i % 5 == 2 || i % 5 == 3) System.out.println(i);
        }
        
        scanner.close();
    }
}
