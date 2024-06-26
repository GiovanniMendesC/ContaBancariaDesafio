import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "";
        String agencia = "";
        int numero = 0;
        double saldo = 0;
        
        System.out.println("Olá, informe o número: ");
        numero = scan.nextInt();
        System.out.println("Informe a sua agência: ");
        agencia = scan.nextLine();
        System.out.println("Informe seu nome: ");
        nome = scan.nextLine();
        System.out.println("Informe seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        
        scan.close();
    }
}
