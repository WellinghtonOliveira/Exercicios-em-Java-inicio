import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double s = 1.00;
        double divisor = 2;

        for (double i = 3.00; i <= 39.00; i += 2){
            s += i / divisor;
            divisor = divisor * 2;
        }

        System.out.printf("%.2f\n", s);

        scanner.close();
    }
}
