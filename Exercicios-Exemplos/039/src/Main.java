import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entrada = scanner.nextInt();

        for (int i = 0; i < entrada; i++) {
            int cidadeA = scanner.nextInt();
            int cidadeB = scanner.nextInt();
            double percentA = scanner.nextDouble();
            double percentB = scanner.nextDouble();

            int anos = 0;

            while (cidadeA <= cidadeB && anos <= 100) {

                cidadeA += (int) (cidadeA * percentA / 100);
                cidadeB += (int) (cidadeB * percentB / 100);

                anos++;
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }

        scanner.close();
    }
}
