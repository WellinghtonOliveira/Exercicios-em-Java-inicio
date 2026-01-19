public class App {
    public static void main(String[] args) throws Exception {
        
        class Pessoa {
            String nome;

            Pessoa(String nome) {
                this.nome = nome;
            }
        }

        Pessoa p = new Pessoa("ana");

        System.out.println(p.nome);


    }
}
