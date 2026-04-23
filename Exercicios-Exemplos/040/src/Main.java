import java.util.Scanner;

class EhPerfeito {
    public EhPerfeito(int num) {
        int count = 0;
        boolean ehPerfeito = false;

        for (int i = 1; i < num; i++) {
            count += i;
            if (count > num) {
                count = 0;
                break;
            }
            if (count == num) {
                ehPerfeito = true;
                break;
            }
        }

        if (ehPerfeito) {
            System.out.println(num + " eh perfeito");
        }else {
            System.out.println(num + " nao eh perfeito");
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int entrada = scanner.nextInt();

        for (int i = 1; i <= entrada; i++) {
            new EhPerfeito(scanner.nextInt());
        }

        scanner.close();
    }
}
