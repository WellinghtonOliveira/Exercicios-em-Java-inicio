import java.util.Scanner;

public class App {
    // static int doubleGame(int x) {
    //     return x * 2;
    // }
    
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int result = sum(20);
        System.out.println(result);

        // for (int i = 0; i <= 5; i++) {
        //     System.out.println("O dobro de " + i + " é " + doubleGame(i));
        // }


        // System.out.print("Digite seu primeiro nome aqui: ");
        // String nomeCompleto = scanner.nextLine();

        // System.out.println("Olá, " + nomeCompleto + "! Bem-vindo");
        
        // System.out.print("Quantos anos você tem? ");
        // int age = scanner.nextInt();

        // while (age < 18) {
        //     System.out.print("Precisa ter no minimo 18 anos: ");
        //     age = scanner.nextInt();
        // }

        // scanner.close();
        // System.out.println("Rodando JAVA");
        
        // myMethod(nomeCompleto);
    }

    // static void myMethod(String fname) {
    //     System.out.println(fname + " Refsnes");
    // }
}
