// Um static método pertence á classe, não a um objeto específico. isso significa que você pode chama-lo sem criar um objeto da classe


public class App {

    static void myStaticMethod() {
        System.out.println("Static methods can be callec without creating objects");
    }

    public static void main(String[] args) throws Exception {
        myStaticMethod(); // Call the static method
        App.myStaticMethod(); // Or call it using class name
    }
}
