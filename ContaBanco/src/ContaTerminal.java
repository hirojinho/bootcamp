import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = new String(input.nextLine());

        System.out.println("Qual o numero da agencia?");
        int agencia = input.nextInt();

        System.out.println("Qual o numero da conta?");
        int conta = input.nextInt();

        System.out.println("Qual o saldo?");
        int saldo = input.nextInt();

        input.close();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}