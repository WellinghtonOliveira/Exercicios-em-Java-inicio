import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    int x;

    public App(int y) {
        x = y;
    }

    public static void main(String[] args) throws Exception {

        App novoObj = new App(2);

        System.out.println(novoObj.x);

    }
}
