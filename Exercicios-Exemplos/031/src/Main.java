import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            int option = scanner.nextInt();

            if (option > 4 && option < 0) continue;
            if (option == 4) break;

            switch (option) {
                case 1:
                    alcool++;
                break;
                case 2:
                    gasolina++;
                break;
                case 3:
                    diesel++;
                break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
