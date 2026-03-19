import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 0 && n == 0)
                break;

            int l = sc.nextInt();
            int k = sc.nextInt();
            int[] boards = new int[k];
            for (int i = 0; i < k; i++) {
                boards[i] = sc.nextInt();
            }

            // Ordena para facilitar a busca de pares com dois ponteiros
            Arrays.sort(boards);

            long res1 = solve(m, n, l, boards);
            long res2 = solve(n, m, l, boards);

            long minBoards = Long.MAX_VALUE;
            if (res1 != -1)
                minBoards = Math.min(minBoards, res1);
            if (res2 != -1)
                minBoards = Math.min(minBoards, res2);

            if (minBoards == Long.MAX_VALUE) {
                System.out.println("impossivel");
            } else {
                System.out.println(minBoards);
            }
        }
        sc.close(); 
    }

    /**
     * Tenta preencher o salão com as tábuas paralelas ao lado 'length'
     * cobrindo a dimensão 'width'.
     */
    private static long solve(int width, int length, int lCm, int[] boards) {
        // Verifica se a largura do salão é divisível pela largura da tábua
        if ((width * 100) % lCm != 0)
            return -1;

        int requiredRows = (width * 100) / lCm;
        int usedRows = 0;
        long totalBoards = 0;

        // Usamos um array de booleanos para marcar as tábuas já utilizadas
        boolean[] used = new boolean[boards.length];

        int right = boards.length - 1;

        // Estratégia: Tentar preencher cada fila
        // Primeiro, tentamos usar tábuas únicas que possuem exatamente o tamanho
        // 'length'
        while (right >= 0 && usedRows < requiredRows) {
            if (boards[right] == length) {
                totalBoards++;
                usedRows++;
                used[right] = true;
            } else if (boards[right] < length) {
                break; // Não existem mais tábuas únicas desse tamanho
            }
            right--;
        }

        // Segundo, tentamos combinar duas tábuas (a menor disponível com a maior
        // possível)
        // Resetamos o ponteiro 'right' para considerar apenas as que sobraram
        int currentRight = right;
        int currentLeft = 0;

        while (currentLeft < currentRight && usedRows < requiredRows) {
            int sum = boards[currentLeft] + boards[currentRight];
            if (sum == length) {
                totalBoards += 2;
                usedRows++;
                currentLeft++;
                currentRight--;
            } else if (sum < length) {
                currentLeft++;
            } else {
                currentRight--;
            }
        }

        return (usedRows == requiredRows) ? totalBoards : -1;
    }
}