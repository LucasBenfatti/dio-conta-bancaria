import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Por favor, informe o número da conta:");
        int numero = input.nextInt();

        System.out.println("Informe o número da agencia:");
        String agencia = input.next();

        //input.nextLine();
        System.out.println("Informe o nome do cliente:");
        String nomeCliente = input2.nextLine();

        System.out.println("Informe o valor depositado:");
        float saldo = input.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}