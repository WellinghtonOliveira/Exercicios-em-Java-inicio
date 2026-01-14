import java.util.Scanner;

public class App {
    public static int myClass(int a) {
        return a * 2;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para multiplica-lo por 2: ");
        System.out.print("O resuiltado da multiplicação foi: " + myClass(scanner.nextInt()));

        scanner.close();
    }
}