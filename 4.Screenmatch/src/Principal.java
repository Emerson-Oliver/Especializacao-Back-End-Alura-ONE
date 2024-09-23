import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Filme filme = new Filme();

        filme.nome = "O poderoso chefão";
        filme.anoDeLancamento = 1972;
        filme.duracaoEmMinutos = 180;

        filme.exibeFichaTecnica();
        filme.avalia(8.0);
        filme.avalia(10.0);
        filme.avalia(5.0);
        System.out.println(filme.somaAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.printf("%.1f%n", filme.retornaMedia());
    }
}
