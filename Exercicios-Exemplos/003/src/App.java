import java.util.Scanner;

public class App {

    static String meuResult(int idade, int conteudo, int duracao) {

        // Regra geral por idade
        if (idade < 18) {
            return "Conteúdo educacional recomendado para menores de 18 anos.";
        }

        switch (conteudo) {

            case 1: // Tecnologia
                switch (duracao) {
                    case 1:
                        return "Vídeos curtos sobre tecnologia e programação.";
                    case 2:
                        return "Cursos completos e artigos longos sobre tecnologia.";
                    default:
                        return "Duração inválida para tecnologia.";
                }

            case 2: // Esportes
                switch (duracao) {
                    case 1:
                        return "Highlights e vídeos curtos sobre esportes.";
                    case 2:
                        return "Documentários e análises longas sobre esportes.";
                    default:
                        return "Duração inválida para esportes.";
                }

            case 3: // Arte
                switch (duracao) {
                    case 1:
                        return "Clipes curtos e conteúdos rápidos sobre arte.";
                    case 2:
                        return "Documentários e aulas longas sobre arte.";
                    default:
                        return "Duração inválida para arte.";
                }

            default:
                return "Tipo de conteúdo inválido.";
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos escolher o conteudo ideal para você!");

        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Gosta mais de [1]-tecnologia, [2]-esportes ou [3]-arte? ");
        int conteudo = scanner.nextInt();

        System.out.print("Prefere conteudo [1]-curto ou [2]-longo? ");
        int duracao = scanner.nextInt();

        System.out.println("Resultado: " + meuResult(idade, conteudo, duracao));

        scanner.close();
    }
}
