import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite seu numero da conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite a agencia: ");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        sc.nextLine();
        System.out.println("Numero da conta: "+numero + " , Agencia: "+agencia+ " , Nome do titular: "+nome+ " , Saldo: R$"+saldo);

    }
}
