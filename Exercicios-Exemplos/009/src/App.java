import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;

public class App {
    public static void main(String[] args) throws Exception {
        Locale locale = Locale.getDefault();
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();
        int largura = (int) screenSize.getWidth(); 
        int altura = (int) screenSize.getHeight();

        System.out.println("Idioma usado: " + locale.getDisplayLanguage());
        System.out.println("A proporção da tela é: " + largura + "x" + altura);

    }
}
