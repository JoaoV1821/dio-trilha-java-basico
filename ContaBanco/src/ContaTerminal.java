import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque ", nome, agencia, numero, saldo ));

        scanner.close();
    }
}
