public class operadores {
   public static void main (String[] args) {
      /* Operadores aritméticos: sinal de + -> adição e concatenação
      String nomeCompleto = "LINGUAGEM" + "JAVA";
		System.out.println(nomeCompleto);
      
      //qual o resultado das expressoes abaixo?
      String concatenacao ="?";
      System.out.println(concatenacao);

      concatenacao = 1+1+1+"1";
      System.out.println(concatenacao);
      
      concatenacao = 1+"1"+1+1;
      
      concatenacao = 1+"1"+1+"1";
      System.out.println(concatenacao);
      
      concatenacao = "1"+1+1+1;
      System.out.println(concatenacao);
      
      concatenacao = "1"+(1+1+1);
      System.out.println(concatenacao);
      */

      /* -------------------------
      Operadores unários
      int numero = 5;
            
      //Imprimindo o numero negativo
      System.out.println(- numero);

      //incrementando numero em mais 1 numero, imprime 6
      numero ++;
      System.out.println(numero);

      //incrementando numero em mais 1 numero, imprime 7
      System.out.println(numero ++);// ops algo de errado não está certo

      System.out.println(numero);// agora sim, numero virou 7

      //ordem de precedencia conta aqui
      System.out.println(++ numero);

      boolean verdadeiro = true;

      System.out.println("Inverteu " + !verdadeiro);
      */

      /* ------------------------------------
      Operadores unários -> incremento e decremento diferenciado 
      int numero = 5;

      // x repetição
      numero ++; 
      System.out.println(numero); //expectativa = 6

      System.out.println(++ numero); //incrementa e imprime junto; não precisa adicionar a repetição antes

      // 2 repetições
      numero = 5;
      System.out.println("Valor original = " + numero);
      numero+=2;
      System.out.println(numero); //add 2 -> expec. 7
      System.out.println(numero+=2); //add 2 -> expec 9
      System.out.println(numero+=5); //add 5 -> expec 14 */

      /* ---------------------------------------
      Operador Ternário -> um "if" mais prático */
      int a, b;
      a = 5;
      b = 7;

      // usando if/else

      if(a == 2 & numero2 ++ == 2 )
         System.out.println("As 2 condições são verdadeiras");

      System.out.println("O numero 1 agora é " + numero1);
      System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )


      }
   }
}
