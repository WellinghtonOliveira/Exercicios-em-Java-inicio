import java.util.Scanner;

public class App {

    static String meuResult(int som) {

        if (som <= 19) {
            return "Vídeos curtos sobre tecnologia para iniciantes";
        }else if (som <= 23) {
            return "";
        }else {
            return "";
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos escolher o conteudo ideal para você!");

        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Gosta mais de [1]-tecnologia, [2]-esportes ou [3]arte?");
        int conteudo = scanner.nextInt();

        System.out.print("Prefere conteudo [1]-curto ou [2]-longo?");
        int duracao = scanner.nextInt();

        System.out.println("Resultado: " + meuResult((idade + conteudo + duracao)));

        scanner.close();
    }
}
