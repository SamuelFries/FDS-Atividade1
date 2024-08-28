import java.util.List;

public class VisualizadorDeProduto implements Observer {
    private List<Integer> valores;

    public VisualizadorDeProduto(List<Integer> valores) {
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores) {
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor) {
        this.valores.add(valor);
    }

    @Override
    public void update(int valor) {
        acrescentaValor(valor);
        exibeProduto();
    }

    public void exibeProduto() {
        int produto = valores.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println("Produto: " + produto + ", quantidade de elementos analisados: " + valores.size());
    }
}