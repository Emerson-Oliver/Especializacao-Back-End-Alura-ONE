import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IdadePessoa idade = new IdadePessoa();

        idade.setIdade(20);
        idade.setNome("Emerson");

        System.out.println("Nome da pessoa: " + idade.getNome());
        System.out.println("Idade da pessoa: " + idade.getIdade());
        idade.VerificaIdadePessoa();
        System.out.println();
        idade.setNome("Laura");
        idade.setIdade(9);
        System.out.println("Nome da pessoa: " + idade.getNome());
        System.out.println("Idade da pessoa: " + idade.getIdade());
        idade.VerificaIdadePessoa();

        sc.close();
    }
}
