import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int[] arrayNums = new int[5];

        System.out.println("Vamos analisar alguns números? Você digitará um total de cinco números.");
    
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite seu " + i + " número: ");
            arrayNums[i - 1] = scanner.nextInt();    
        }

        for (int n : arrayNums) {
            int pares = 0;
            
            if (n % 2 == 0) {
                ++pares;
            }

            System.out.println(n);
        }

        scanner.close();
    }
}
