import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;
        int maiorNum = 0;
         
        int[] arrayNums = new int[5];   
        
        System.out.println("Vamos analisar alguns números? Você digitará um total de cinco números.");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite seu " + i + " número: ");
            arrayNums[i - 1] = scanner.nextInt();    
        }

        int menorNum = arrayNums[0];

        for (int i = 1; i < arrayNums.length; i++) {
            if (arrayNums[i] < menorNum) {
                menorNum = arrayNums[i];
            }
        }

        for (int n : arrayNums) {
            
            if (n > maiorNum) {
                maiorNum = n;
            }

            if (n % 2 == 0) {
                ++pares;
            }else {
                ++impares;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Maior número: " + maiorNum);
        System.out.println("Menor número: " + menorNum);
            
        scanner.close();
    }
}
