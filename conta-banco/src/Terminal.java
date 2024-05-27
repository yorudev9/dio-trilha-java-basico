
public class Terminal {
  public static void main(String[] args) {
      ContaTerminal novaConta = new ContaTerminal();

      System.out.println("=== BANCO DIGITAL ===");
      System.out.println("Caro cliente, apos informar os dados, aperte ENTER para prosseguir!");
      System.out.println("");

      novaConta.informarAgencia();
      novaConta.informarConta();
      novaConta.informarNomeCliente();
      novaConta.informarSaldo();


      System.out.println("");
      System.out.println("Ola, "+ novaConta.nome_cliente +"! Obrigado por criar uma conta em nosso banco!");
      System.out.println("Os dados da sua nova conta sao ==> Agencia: " + novaConta.agencia + " | Conta: " + novaConta.conta);
      System.out.println("Seu saldo atual, no valor de: " +  novaConta.formatSaldo.format(novaConta.saldo) + ", ja esta disponivel para saque!");
      System.out.println("");
      System.out.println("=== SESSAO ENCERRADA ===");
  }
}