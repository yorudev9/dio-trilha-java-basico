
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  String agencia;
  int conta;
  String nome_cliente;
  double saldo;

  //alterando localização
  Locale brasil = new Locale("pt", "BR");

  public void informarAgencia() {
    System.out.println("Informe numero da Agencia (com digito): ");
    Scanner scanner = new Scanner(System.in).useLocale(brasil);
    agencia = scanner.nextLine();
  }
  
  public void informarConta() {
    System.out.println("Informe numero da Conta: ");
    Scanner scanner = new Scanner(System.in).useLocale(brasil);
    conta = scanner.nextInt();
  }
  
  public void informarNomeCliente() {
    System.out.println("Informe seu nome: ");
    Scanner scanner = new Scanner(System.in).useLocale(brasil);
    nome_cliente = scanner.nextLine();
  }
  
  public void informarSaldo() {
    System.out.println("Informe o valor do deposito inicial: ");
    Scanner scanner = new Scanner(System.in).useLocale(brasil);
    saldo = scanner.nextDouble();
  }

  //formatar saldo para Real
  NumberFormat formatSaldo = NumberFormat.getCurrencyInstance(brasil);
  
}
