import java.util.Locale;
import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = "Emerson Oliveira";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;
        byte opcao;
        double valorDeposito;
        double valorTranferencia;

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoDeConta);
        System.out.printf("Saldo Inicial: %.2f%n", saldoInicial);
        System.out.println("***********************");

        System.out.println("Operações");

        System.out.println("1 - Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair\n");
        System.out.print("Digite a opção desejada: ");
        opcao = sc.nextByte();

        if(opcao == 1) {
            System.out.printf("Saldo Inicial: %.2f%n", saldoInicial);
        }


        else if (opcao == 2) {
            System.out.println("Digite o valor a ser depositado: ");
            valorDeposito = sc.nextDouble();
            saldoInicial+= valorDeposito;
        }
        else if (opcao == 3) {
            System.out.println("Digite o valor para ser transferido: ");
            valorTranferencia = sc.nextDouble();
            saldoInicial-= valorTranferencia;
        }
        else if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4) {
            System.out.println("Opção Invalida, Escolha uma opção valida ");
            System.out.println("1 - Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair\n");
        }



        sc.close();
    }
}
