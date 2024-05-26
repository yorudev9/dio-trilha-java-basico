import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
   public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next(); //retorna string na próxima execução
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura (0.00): ");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");
        
        //fechando scanner -> erro "Resource leak: 'scanner' is never closed"
        scanner.close();
        
    }
}
