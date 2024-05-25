import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        // Cria uma instância do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta ao usuário
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        // Solicita a agência ao usuário
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        // Solicita o nome do cliente ao usuário
        System.out.println("Por favor, digite o nome do cliente: ");
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt() ou next() anterior
        nomeCliente = scanner.nextLine();

        // Solicita o saldo da conta ao usuário
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextFloat();

        // Exibe as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o Scanner
        scanner.close();
    }
}

