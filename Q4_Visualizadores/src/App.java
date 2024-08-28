import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        var cs = new VisualizadorDeSomatorio(dados.getValores());
        var cp = new VisualizadorDeProduto(dados.getValores());

        Scanner s = new Scanner(System.in);
        int valor = 0;
        boolean mediaAtiva = false, somatorioAtivo = false, produtoAtivo = false;

        while (true) {
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0) {
                break;
            }

            if (valor == -1) {
                if (somatorioAtivo) {
                    dados.removeObserver(cs);
                    somatorioAtivo = false;
                    System.out.println("Visualizador de somatorio desligado.");
                } else {
                    dados.addObserver(cs);
                    somatorioAtivo = true;
                    System.out.println("Visualizador de somatorio ligado.");
                }
                continue;
            }

            if (valor == -2) {
                if (mediaAtiva) {
                    dados.removeObserver(cm);
                    mediaAtiva = false;
                    System.out.println("Visualizador de media desligado.");
                } else {
                    dados.addObserver(cm);
                    mediaAtiva = true;
                    System.out.println("Visualizador de media ligado.");
                }
                continue;
            }

            if (valor == -3) {
                if (produtoAtivo) {
                    dados.removeObserver(cp);
                    produtoAtivo = false;
                    System.out.println("Visualizador de produto desligado.");
                } else {
                    dados.addObserver(cp);
                    produtoAtivo = true;
                    System.out.println("Visualizador de produto ligado.");
                }
                continue;
            }

            dados.add(valor);
        }
        System.out.println("Fim");
    }
}