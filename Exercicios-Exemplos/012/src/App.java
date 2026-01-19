import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");

        String strNome = scanner.nextLine();

        System.out.println("Prazer em conhece-lo " + strNome);

        scanner.close();
    }
}
