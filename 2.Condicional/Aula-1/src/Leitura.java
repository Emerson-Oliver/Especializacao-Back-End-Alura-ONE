import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu filme favorito: ");
        String filme = sc.nextLine();
        System.out.print("Qual o ano de laçamento? ");
        int ano = sc.nextInt();

        System.out.println("Seu filme favorito é " + filme + " e Foi lançado em: " + ano);
        sc.close();
    }
}
