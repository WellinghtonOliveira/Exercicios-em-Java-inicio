import java.util.*;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        CalculoProdutos calc = new CalculoProdutos();
        
        int codigo = scanner.nextInt();
        int quantia = scanner.nextInt();

        System.out.printf("Total: R$ %.2f", calc.caluculaProdutos(codigo, quantia));

        scanner.close();
    }
}
