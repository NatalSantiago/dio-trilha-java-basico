import java.util.Scanner;

/**
 * Classe principal responsável por executar a lógica de contagem de números com base
 * em dois parâmetros fornecidos via terminal.
 * <p>
 * Se o primeiro parâmetro for maior que o segundo, uma exceção {@link ParametrosInvalidosException}
 * será lançada. Caso contrário, será realizada a contagem e os números serão impressos no console.
 * </p>
 */
public class Contador {

    /**
     * Método principal que inicia a aplicação, recebe dois parâmetros via terminal
     * e chama o método {@code contar} para realizar a contagem.
     *
     * @param args Argumentos da linha de comando (não utilizados aqui).
     */
    public static void main(String[] args) {
        // Scanner para capturar a entrada do usuário
        Scanner terminal = new Scanner(System.in);
        
        // Capturando o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();  // Lê o primeiro número inteiro
        
        // Capturando o segundo parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();  // Lê o segundo número inteiro
        
        try {
            // Chama o método contar para executar a contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Exibe a mensagem de erro personalizada se a exceção for lançada
            System.out.println(exception.getMessage());
        }

        // Fecha o scanner para evitar vazamento de recursos
        terminal.close();
    }

    /**
     * Realiza a contagem de números entre o valor do primeiro parâmetro e o segundo.
     * <p>
     * Se o primeiro parâmetro for maior que o segundo, lança uma exceção customizada
     * {@link ParametrosInvalidosException}.
     * </p>
     *
     * @param parametroUm    O primeiro número inteiro fornecido pelo usuário.
     * @param parametroDois  O segundo número inteiro fornecido pelo usuário.
     * @throws ParametrosInvalidosException Se o primeiro parâmetro for maior que o segundo.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção customizada com a mensagem apropriada
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a diferença entre os parâmetros
        int contagem = parametroDois - parametroUm;

        // Realiza a contagem utilizando um loop for e imprime os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
