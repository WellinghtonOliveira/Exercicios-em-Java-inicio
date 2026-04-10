import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int entrada = scanner.nextInt();

        for (int i = 1; i <= entrada; i++) {
            if (entrada % i == 0) System.out.println(i);
        }

        scanner.close();
    }
}
