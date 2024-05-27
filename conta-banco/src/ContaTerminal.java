import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

    System.out.println("== BANCO DIGITAL | SEJA BEM-VINDO(A) ==" + System.lineSeparator()+
    "Apos informar cada dado, por favor pressione ENTER" + System.lineSeparator());

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.print("Informe o numero da agencia: ");
    String agencia = scanner.next();
    
    System.out.print("Informe o numero da conta: ");
    int conta = scanner.nextInt();
    
    System.out.print( "Informe seu nome: ");
    String nome_cliente = scanner.next();

    System.out.print("Informe o valor do deposito inicial: $");
    double saldo = scanner.nextDouble();

    scanner.close();
    
    System.out.println(System.lineSeparator() + "Ola " + nome_cliente + "! Obrigado por criar uma conta no BANCO DIGITAL!" + System.lineSeparator() + "Os dados da sua conta sao:");
    System.out.println("* Agencia: " + agencia);
    System.out.println("* Conta: " + conta);
    System.out.println("* Saldo atual: $" + saldo);
    System.lineSeparator();
    System.out.println("=== SESSAO ENCERRADA ===");
    }
}
