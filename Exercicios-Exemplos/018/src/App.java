import java.util.ArrayList;

class Funcionario {
    void calcularSalario() {
        System.out.println("Salario dos Funcionarios");
    }

    int salario() { 
        System.out.println("Bruto");
        return 0;
    }
}

class FuncionarioCLT extends Funcionario {
    @Override
    void calcularSalario() {
        System.out.println("CLT: 1350/M"); 
    }

    @Override
    int salario() {
        return 1350; 
    }
}

class FuncionarioPJ extends Funcionario {
    @Override
    void calcularSalario() {
        System.out.println("PJ: 15/H");
    } 

    @Override
    int salario() {
        return 15;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioCLT());
        funcionarios.add(new FuncionarioCLT());
        funcionarios.add(new FuncionarioCLT());
        funcionarios.add(new FuncionarioPJ());
        funcionarios.add(new FuncionarioPJ());
        funcionarios.add(new FuncionarioPJ());

        int somaSalarialCLT = 0;
        int somaSalarialPj = 0;

        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionarioCLT) {
                somaSalarialCLT += f.salario();
            }else {
                somaSalarialPj += f.salario();
            }
        }

        System.out.println("Soma dos Salarios dos funcionarios CLT: " + somaSalarialCLT);
        System.out.println("Soma dos Salarios dos funcionarios PJ:" + somaSalarialPj);
    }
}


/*
        Crie um sistema simples de funcionários.

        Requisitos:
        Classe Funcionario
        Método calcularSalario()
        Classe FuncionarioCLT (herda de Funcionario)
        Salário fixo
        Classe FuncionarioPJ (herda de Funcionario)
        Salário baseado em horas trabalhadas

        Objetivo:
        Criar uma lista de Funcionario
        Adicionar CLT e PJ
        Percorrer a lista e chamar calcularSalario()

        📌 Foque em:
        uso de extends
        método sobrescrito
        mesma chamada, comportamentos diferentes
*/