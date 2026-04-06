import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int grenais = 0, interP = 0, gremioP = 0, empate = 0;

        while (true) {
            int inter = scanner.nextInt();
            int gremio = scanner.nextInt();
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            int x = scanner.nextInt();
            
            if (inter == gremio) empate++;
            if (inter > gremio) interP++;
            else gremioP++;
            grenais++;
            if (x == 1) continue;

            System.out.println(grenais + " grenais");
            System.out.println("Inter:" + interP);
            System.out.println("Gremio:" + gremioP);
            System.out.println("Empates:" + empate);

            System.out.printf("%s", interP > gremio ? "Inter venceu mais" : "Gremio venceu mais");
            break;

        }

        scanner.close();
    }
}
