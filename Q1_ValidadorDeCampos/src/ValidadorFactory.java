public class ValidadorFactory {
    public static IValidador getValidador(Validador.Tipo tipo) {
        switch (tipo) {
            case EMAIL:
                return new ValidadorEmail();
            case INTEIRO:
                return new ValidadorInteiro();
            case MATRICULA:
                return new ValidadorMatricula();
            default:
                throw new IllegalArgumentException("Tipo de validador desconhecido");
        }
    }
}
