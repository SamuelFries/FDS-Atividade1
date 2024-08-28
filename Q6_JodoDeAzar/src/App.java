public class App {
    public static void main(String[] args) {
        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);
        
        // Decorando os dados com a funcionalidade de histórico
        DadoComHistorico d6ComHistorico = new DadoComHistorico(d6);
        DadoComHistorico d20ComHistorico = new DadoComHistorico(d20);

        d6ComHistorico.rolar();
        d20ComHistorico.rolar();

        System.out.println("D6: " + d6ComHistorico.getValor());
        System.out.println("Histórico D6: " + d6ComHistorico.getHistorico());

        System.out.println("D20: " + d20ComHistorico.getValor());
        System.out.println("Histórico D20: " + d20ComHistorico.getHistorico());
    }
}