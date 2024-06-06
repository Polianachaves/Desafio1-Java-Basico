import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Por favor, digite o numero da conta: ");
        int conta = leitor.nextInt();

        System.out.println("Por favor, digite o numero da agencia: ");
        int agencia = leitor.nextInt();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = leitor.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = leitor.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + "e seu saldo" + saldo + "já está disponivel para saque! ");
        
        


    }
}
