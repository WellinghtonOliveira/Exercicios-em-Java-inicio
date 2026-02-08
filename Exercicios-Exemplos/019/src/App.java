import java.util.ArrayList;

abstract class Forma {
    public abstract double calcularArea();
    void calculo() {
        System.out.println("calule a area");
    }
}

class Quadrado extends Forma {
    int lado;

    Quadrado(int lado) {
        this.lado = lado;
    }
 
    @Override
    public double calcularArea() {
        double area = (lado * lado); 
        System.out.println("Area do quadrado: " + area);
        return area;
    }
}

class Circulo extends Forma {
    int raio;

    Circulo(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        double area = (3.14 * (raio * raio));
 
        System.out.println("Area do circulo: " + area);
        return area;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        // Forma quadrado = new Quadrado(4);
        // Forma circulo = new Circulo(4);

        // quadrado.calcularArea();
        // circulo.calcularArea();

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado(5));
        formas.add(new Quadrado(9));
        formas.add(new Quadrado(2));
        formas.add(new Circulo(2));
        formas.add(new Circulo(4));
        formas.add(new Circulo(8));

        double areaTotal = 0;

        for (Forma f : formas) {
            areaTotal += f.calcularArea();
        }

        System.out.println("A soma de todas as areas são: " + areaTotal);
    }
}


/*

for (TipoVariavel variavel : colecaoOuArray) {
    // código a ser executado para cada elemento
}

*/