import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();
        
        while (scanner.hasNext()) {
            valores.add(scanner.nextInt());
        }

        
        List<Integer> ordenados = new ArrayList<>(valores);
        Collections.sort(ordenados); 
        
        System.out.println(ordenados.get(0) +"\n"+ ordenados.get(1) +"\n"+ ordenados.get(2) +"\n");
        System.out.println(valores.get(0) +"\n"+valores.get(1) +"\n"+valores.get(2));

        
        scanner.close();
    } 
}
