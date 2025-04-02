import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String agencia, cliente;
        Integer numeroConta;
        Double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        cliente = sc.nextLine();
    
        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.print(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %5.2f já está disponível para saque", cliente, agencia, numeroConta, saldo));





    }
}
