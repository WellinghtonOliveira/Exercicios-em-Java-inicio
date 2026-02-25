import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame("Projeto com janela");

        janela.setSize(600, 400);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);    
    }
}
