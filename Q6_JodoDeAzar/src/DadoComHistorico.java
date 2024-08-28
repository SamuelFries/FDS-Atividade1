import java.util.ArrayList;
import java.util.List;

public class DadoComHistorico extends Dado {
    private final List<Integer> historico;

    public DadoComHistorico(Dado dado) {
        super(dado.lados);
        this.historico = new ArrayList<>();
        this.setValor(dado.getValor()); // Assuming setValor is a method in Dado to set valorJogada
    }

    @Override
    public void rolar() {
        super.rolar();
        historico.add(getValor());
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}