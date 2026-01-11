import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        int soma = 0;

        System.out.println("Você irá inserir dois números inteiros.");

        System.out.print("Insira o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Descobrir menor e maior
        int maior = primeiroNumero > segundoNumero ? primeiroNumero : segundoNumero;
        int menor = primeiroNumero < segundoNumero ? primeiroNumero : segundoNumero;

        System.out.print("Números pares no intervalo: ");

        // Percorre apenas os números ENTRE os valores
        for (int i = menor + 1; i < maior; i++) {
            quantidade++;
            soma += i;

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Quantidade de números no intervalo: " + quantidade);
        System.out.println("Soma dos números: " + soma);

        scanner.close();
    }
}
