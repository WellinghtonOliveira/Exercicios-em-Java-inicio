import java.util.*;

public class App {

    static int resolve(int larguraSalao, int comprimentoSalao, int larguraTabua, int[] tabuas) {

        if (larguraSalao % larguraTabua != 0)
            return Integer.MAX_VALUE;

        int faixas = larguraSalao / larguraTabua;
        int alvo = comprimentoSalao;

        int[] t = Arrays.copyOf(tabuas, tabuas.length);
        Arrays.sort(t);

        int i = 0;
        int j = t.length - 1;

        int usadas = 0;
        int feitas = 0;

        while (i <= j && feitas < faixas) {

            if (t[j] == alvo) {
                usadas++;
                feitas++;
                j--;
            } else if (t[i] + t[j] == alvo) {
                usadas += 2;
                feitas++;
                i++;
                j--;
            } else if (t[i] + t[j] < alvo) {
                i++;
            } else {
                j--;
            }
        }

        if (feitas == faixas)
            return usadas;
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m == 0 && n == 0)
                break;

            int l = sc.nextInt();
            int k = sc.nextInt();

            int[] tabuas = new int[k];

            for (int i = 0; i < k; i++) {
                tabuas[i] = sc.nextInt() * 100;
            }

            m *= 100;
            n *= 100;
            l *= 100;

            int r1 = resolve(m, n, l, tabuas); 
            int r2 = resolve(n, m, l, tabuas);

            int res = Math.min(r1, r2);
 
            if (res == Integer.MAX_VALUE)
                System.out.println("impossivel");
            else
                System.out.println(res);
        }

        sc.close();
    }
}
