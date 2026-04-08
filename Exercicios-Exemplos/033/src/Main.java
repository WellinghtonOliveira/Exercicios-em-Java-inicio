import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        double count = 0.00;

        while (true) {
            int idade = scanner.nextInt();
            if (idade < 0) break;

            somaIdades += idade;
            count++;
        }

        double media = somaIdades/count;
        
        System.out.printf("%.2f\n", media);
        scanner.close();
    }
}
