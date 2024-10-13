import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatech.modelos.Filme;
import br.com.alura.screenmatech.modelos.Serie;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Filme filme = new Filme();

        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDuracaoEmMinutos(180);

        filme.exibeFichaTecnica();
        filme.avalia(8.0);
        filme.avalia(10.0);
        filme.avalia(5.0);
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.printf("%.1f%n", filme.retornaMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}
