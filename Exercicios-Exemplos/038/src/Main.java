import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int entrada = scanner.nextInt();
            if (entrada == 0) break;

            int count = 5;
            int soma = 0;

            while (count > 0) {
                if (entrada % 2 == 0) {
                    soma += entrada;
                    count--;           
                }
                
                entrada++;
            }

            System.out.println(soma);
        }

        scanner.close();
    }
}