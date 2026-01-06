import java.util.Scanner;

public class App {
    // static int doubleGame(int x) {
    //     return x * 2;
    // }
    
    // public static int sum(int k) {
    //     if (k > 0) {
    //         return k + sum(k - 1);
    //     }else {
    //         return 0;
    //     }
    // }

    static int myMethodMult(int primeiroNumero, int segundoNumero) {
        return 0;
    }

    static int myMethodSoma(int primeiroNumero, int segundoNumero) {
        return 0;
    }

    static int myMethodSubtracao(int primeiroNumero, int segundoNumero) {
        return 0;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma opção de conta:");
        System.out.println("[1] - Multiplicação");
        System.out.println("[2] - Soma");
        System.out.println("[3] - Subtração");
        System.out.println();
        System.out.print("Digite sua opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número inteiro do termo: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro do termo: ");
        int segundoNumero = scanner.nextInt();

        switch (opcao) {
            case 1:
                myMethodMult(primeiroNumero, segundoNumero);
                break;
            case 2:
                myMethodSoma(primeiroNumero, segundoNumero);
                break;
            case 3:
                myMethodSubtracao(primeiroNumero, segundoNumero);
                break;
            
        }



        // int result = sum(20);
        // System.out.println(result);

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
