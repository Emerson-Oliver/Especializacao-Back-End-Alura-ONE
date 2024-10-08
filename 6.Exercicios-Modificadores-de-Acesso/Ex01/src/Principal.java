import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    ContaBancaria conta = new ContaBancaria();

    conta.setNumeroConta(1234);
    conta.setSaldo(3500.00);
    conta.titular = "Emerson Matos Oliveira";

    System.out.println("Numero da conta: " + conta.getNumeroConta());
    System.out.printf("Saldo da conta: %.2f%n" , conta.getSaldo());
    System.out.println("Titular da conta: " + conta.titular);

    conta.setSaldo(6000.00);

        System.out.printf("Saldo atualizado: %.2f%n " , conta.getSaldo());

    sc.close();
    }
}
