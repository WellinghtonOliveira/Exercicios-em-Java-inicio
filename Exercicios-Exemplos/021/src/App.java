import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double numeroRaio = scanner.nextFloat();

        System.out.printf("A=%.4f", 3.14159 * (numeroRaio * numeroRaio));

        scanner.close();
    }
}
 