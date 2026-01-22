class Animal {
    void som() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void som() { // Mesma assinatura do método da superclasse, ocorre sobrescrita (override)
        System.out.println("Latido"); 
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Animal a = new Cachorro();
        a.som();
    } 
} 
