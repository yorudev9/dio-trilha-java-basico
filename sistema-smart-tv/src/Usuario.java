/** Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
1. Ela tenha as características: ligada (boolean), canal (int) e volume (int);
2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
*/

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada: " + smartTV.status_ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV Ligada");
        
        smartTV.desligar();
        System.out.println("TV Desligada");

        smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("Canal atual: " + smartTV.canal);
    }
}
