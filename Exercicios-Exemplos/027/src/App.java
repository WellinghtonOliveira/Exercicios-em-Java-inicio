import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Float> valores = new ArrayList<>();
        
        while (scanner.hasNext()) {
            valores.add(scanner.nextFloat());
        }

        List<Float> ordenados = new ArrayList<>(valores);
        Collections.sort(ordenados);

        System.out.println(ordenados.get(0) +"\n"+ ordenados.get(1) +"\n"+ ordenados.get(2) +"\n\n");
        System.out.println(valores.get(0) +"\n"+valores.get(1) +"\n"+valores.get(2) +"\n\n");


        scanner.close();
    }
}
