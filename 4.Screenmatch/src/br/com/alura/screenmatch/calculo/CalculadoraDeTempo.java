package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatech.modelos.Filme;
import br.com.alura.screenmatech.modelos.Serie;
import br.com.alura.screenmatech.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui (Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
