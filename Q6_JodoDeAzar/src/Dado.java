import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Classe base do dado
public class Dado {
    protected int lados;
    protected int valorJogada;
    protected final Random random;

    public Dado(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    public int getValor() {
        return valorJogada;
    }
}
