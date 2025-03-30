import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta !");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome !");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome !");
        nomeCliente = nomeCliente + " " + scanner.next();

        System.out.println("Por favor, digite o saldo !");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println(
                String.format(
                        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                        nomeCliente, agencia, numeroConta, saldo));
    }
}
