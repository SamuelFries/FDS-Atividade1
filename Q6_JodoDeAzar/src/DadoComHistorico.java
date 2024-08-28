public class DadoComHistorico extends Dado {
    private final List<Integer> historico;

    public DadoComHistorico(Dado dado) {
        super(dado.lados);
        this.valorJogada = dado.getValor();
        this.historico = new ArrayList<>();
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