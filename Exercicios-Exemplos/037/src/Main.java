import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int entrada = scanner.nextInt( );
        
        for (int i = 1; i <= entrada; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            int somaImpar = 0;
            while (true) {
                if (y == 0) break;

                if (x % 2 != 0) {
                    somaImpar += x;
                    y--;
                }
                x++;
            }
            System.out.println(somaImpar);
        }


        scanner.close();
    }
}
