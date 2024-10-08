import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto("Notebook", 4800.00);

        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preco do produto: R$ %.2f%n" , produto.getPreco());
        System.out.println("Informe o valor do desconto no produto: ");
        produto.AplicarDesconto(10.0);
        System.out.printf("Preco atualizado: R$ %.2f%n ", produto.getPreco());



        sc.close();
    }
}
