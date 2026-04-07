import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int maximo = Math.max(a, b);
        int minimo = Math.min(a, b);

        int soma = 0;

        for (int i = minimo; i <= maximo; i++) {
            if (i % 13 != 0) soma += i;
        }

        System.out.println(soma);
        
        scanner.close();
    }
}
