import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Sou o Gênio da Lamparina." );
        System.out.println(" Faça três desejos :" );
        
        System.out.println(" Quantos bitcoins você tem na sua wallet ? ");
        int bitcoins = scanner.nextInt();

        System.out.println(" Qual seu propósito ? " );
        String proposito = scanner.next();

        System.out.println(" O  que é importante para você ? " );
        String importante = scanner.next();


        System.out.println("Você tem " + bitcoins + "bitcoins na sua wallet." );
        System.out.println("Seu propósito é " +  proposito + "." );
        System.out.println("O que é importante para você é " + importante + "." );
        System.out.println(" Você é um gênio da lâmpada e só você pode realizar todos os seus desejos." );
    
    }
}