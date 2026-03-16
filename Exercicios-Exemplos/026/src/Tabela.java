import java.util.*;

public class Tabela {
    private Map<Integer, Float> tabela = new HashMap<>();

    public Tabela() {
        tabela.put(1,4.00f);
        tabela.put(2,4.50f);
        tabela.put(3,5.00f);
        tabela.put(4,2.00f);
        tabela.put(5,1.50f);
    }

    public Map<Integer, Float> getTabela() {
        return tabela;
    }
}
