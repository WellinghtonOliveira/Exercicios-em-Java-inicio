import java.util.*;

public class CalculoProdutos {
    public float caluculaProdutos(int codigo, int quantidade) {
        Tabela gera = new Tabela();
        Map<Integer, Float> tabela = gera.getTabela();

        Float preco = tabela.get(codigo);

        if (preco != null) {
            return preco * quantidade;
        }
        
        return 0.0f;
    }
}
