import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valorEntrada = scanner.nextDouble();

        // Converte para centavos e evita erro de precisão
        int valor = (int) Math.round(valorEntrada * 100);

        // NOTAS
        int n100 = valor / 10000;
        valor %= 10000;

        int n50 = valor / 5000;
        valor %= 5000;

        int n20 = valor / 2000;
        valor %= 2000;

        int n10 = valor / 1000;
        valor %= 1000;

        int n5 = valor / 500;
        valor %= 500;

        int n2 = valor / 200;
        valor %= 200;

        // MOEDAS
        int m1 = valor / 100;
        valor %= 100;

        int m50 = valor / 50;
        valor %= 50;

        int m25 = valor / 25;
        valor %= 25;

        int m10 = valor / 10;
        valor %= 10;

        int m5 = valor / 5;
        valor %= 5;

        int m01 = valor;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", n100);
        System.out.printf("%d nota(s) de R$ 50.00\n", n50);
        System.out.printf("%d nota(s) de R$ 20.00\n", n20);
        System.out.printf("%d nota(s) de R$ 10.00\n", n10);
        System.out.printf("%d nota(s) de R$ 5.00\n", n5);
        System.out.printf("%d nota(s) de R$ 2.00\n", n2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", m1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", m50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", m25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", m10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", m5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", m01);

        scanner.close();
    }
}