import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome aqui: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Olá, " + nomeCompleto + "! Bem-vindo");
        
        System.out.print("Quantos anos você tem? ");
        int age = scanner.nextInt();

        while (age < 18) {
            System.out.print("Precisa ter no minimo 18 anos: ");
            age = scanner.nextInt();
        }

        scanner.close();
        System.out.println("Rodando JAVA");
        
        myMethod(nomeCompleto);
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }
}
