import java.util.Scanner;

public class Main {

    public static int josephus(int n, int k) {
        int res = 0;

        for (int i = 1; i <= n; i++) {
            res = (res + k) % i;
        }

        return res + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 1; i <= casos; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int sobrevivente = josephus(n, k);

            System.out.println("Case " + i + ": " + sobrevivente);
        }

        sc.close();
    }
}