import java.util.Scanner;

/**
 * A classe {@code ContaTerminal} representa um sistema simples de interação com o usuário
 * para a criação de uma conta bancária. O programa solicita ao usuário informações básicas
 * como número da conta, agência, nome do cliente e saldo, e então exibe uma mensagem de 
 * confirmação com os dados fornecidos.
 * 
 * <p>
 * Este é um exemplo básico de entrada e saída em Java utilizando a classe {@link Scanner}
 * para capturar dados do usuário via terminal.
 * </p>
 * 
 * @author Natal Santiago
 * @version 1.0
 * @since 2024-08-29
 */
public class ContaTerminal {

    /**
     * Método principal que executa o programa. Ele solicita os dados da conta bancária
     * do usuário, como número da conta, agência, nome do cliente e saldo, e depois exibe
     * uma mensagem de confirmação com as informações inseridas.
     * 
     * @param args Argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar a entrada do usuário via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando o número da conta bancária do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();  // Captura o próximo valor inteiro inserido pelo usuário

        // Solicitando e capturando o número da agência bancária
        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine();  // Consumir a quebra de linha restante após a entrada do número da conta
        String agencia = scanner.nextLine();  // Captura a linha de texto inserida pelo usuário

        // Solicitando e capturando o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();  // Captura a linha de texto inserida pelo usuário

        // Solicitando e capturando o saldo inicial da conta bancária
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();  // Captura o próximo valor decimal inserido pelo usuário

        // Exibindo uma mensagem de confirmação com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o objeto Scanner para liberar recursos
        scanner.close();
    }
}
