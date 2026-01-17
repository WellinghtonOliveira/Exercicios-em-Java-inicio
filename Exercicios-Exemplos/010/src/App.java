/*
    Se você não deseja a possibilidade de sobrescrever os valores de atributos 
    existentes, declare os atributos como FINAL:
*/

public class App {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) throws Exception {
        App meuObj = new App();
        
        //meuObj.x = 50; // Isso vai gerar um erro: não pode atribuir um valor a variavel final
        //meuObj.PI = 25; // Isso vai gerar um erro: não pode atribuir um valor a variavel final

        System.out.println(meuObj);
    }
}
