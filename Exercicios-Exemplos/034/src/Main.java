import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double s = 1.00;

        for (int i = 2; i <= 100; i++) {
            s += 1.00/i;
        }

        System.out.printf("%.2f\n", s);
        scanner.close();
    }
}
