import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos analisar alguns números? Você digitará um total de cinco números.");
        
        System.out.print("Digite o primeiro número: ");
        int numPrimeiro = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numSegundo = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numTerceiro = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int numQuarto = scanner.nextInt();

        System.out.print("Digite o quinto número: ");
        int numQuinto = scanner.nextInt();
    }
}
