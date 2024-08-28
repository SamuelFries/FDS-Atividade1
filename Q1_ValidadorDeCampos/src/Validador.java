public class Validador {
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    public boolean valida(Tipo tipo, String valor) {
        IValidador validador = ValidadorFactory.getValidador(tipo);
        return validador.valida(valor);
    }
}
