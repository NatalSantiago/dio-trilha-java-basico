/**
 * Exceção customizada para tratar o caso em que o primeiro parâmetro é maior que o segundo.
 * <p>
 * Esta exceção é lançada quando a regra de negócio de que o segundo parâmetro deve ser maior
 * que o primeiro é violada.
 * </p>
 */
public class ParametrosInvalidosException extends Exception {

    /**
     * Construtor que recebe uma mensagem de erro e a passa para a superclasse {@code Exception}.
     *
     * @param mensagem A mensagem de erro que será exibida quando a exceção for lançada.
     */
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
