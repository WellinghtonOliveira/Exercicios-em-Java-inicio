import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    
        ArrayList<Integer> areaTabua = new ArrayList<>();

        
        while (scanner.hasNextInt()) {
            int dimencaoM = scanner.nextInt();
            int dimencaoN = scanner.nextInt();
    
            int larguraTabuas = scanner.nextInt();
            int tabuasDoadas = scanner.nextInt();
            
            int areaDoSalao = calculaAreaSalao(dimencaoM, dimencaoN);
    
            int x = scanner.nextInt();
            areaTabua.add(calculaAreaTabua(larguraTabuas, (x * 100)));
            
            System.out.println(calculaMenorUsoTabuas(areaDoSalao, areaTabua, tabuasDoadas));
            if (dimencaoM == 0 && dimencaoN == 0) break;
        }
        

    }

    public static int calculaAreaSalao(int a, int b) {
        return a * b;
    }

    public static int calculaAreaTabua(int a, int b) {
        return a * b;
    }

    public static int calculaMenorUsoTabuas(int areaSalao, ArrayList<Integer> areaTabua, int quantiaTabua) {
        ArrayList<Integer> areaT = new ArrayList<>();

        int areaS = areaSalao;
        int quantiaT = 0;

        for (Integer areaCentimetro : areaTabua) {
            areaT.add(areaCentimetro * 100);
        }

        for (Integer i : areaT) {
            if (areaS > 0) {
                areaS -= i;
                quantiaT++;
            }
        }

        return quantiaT;
    }
}
