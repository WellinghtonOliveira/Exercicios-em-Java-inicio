// Superclasse

import java.util.ArrayList;

class Veiculo {
    void mover() {
        System.out.println("O veiculo esta se movendo");
    }
}

// Subclasse carro
class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("O carro esta dirigindo na estrada");
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    @Override
    void mover() {
        System.out.println("A bicicleta esta pedalando na ciclovia");
    }
}

// classe principal para testar
public class App {
    public static void main(String[] args) throws Exception {
        // Veiculo meuCarro = new Carro();
        // Veiculo minhaBicilceta = new Bicicleta();

        // meuCarro.mover();
        // minhaBicilceta.mover();

        // ======

        // ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        // veiculos.add(new Carro());
        // veiculos.add(new Bicicleta());

        // for (Veiculo v : veiculos) {
        //     v.mover(); // Cada objeto chama seu próprio método sobrescrito
        // }

        // =========

        

    }
}
