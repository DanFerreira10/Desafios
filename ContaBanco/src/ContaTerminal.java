import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;

            System.out.println("Por favor, digite seu nome completo: ");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.nextLine();

            System.out.println("Seu número de conta: ");
            numero = scanner.nextInt();

            System.out.println("Qual valor você deseja sacar: ");
            saldo = scanner.nextDouble();

            System.out.println(
                    "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        }
    }
}
