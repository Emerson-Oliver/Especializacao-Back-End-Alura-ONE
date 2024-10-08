public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.printf("Média de Avaliações: %.1f" , calcularMediaAvaliacoes());
    }

    void avaliar(double novaAvaliacao) {
        if (novaAvaliacao >= 0 && novaAvaliacao <= 5) {
            somaAvaliacoes += novaAvaliacao;
            numAvaliacoes+=1;
        } else {
            System.out.println("A avaliação deve ser entre 0 e 5.");
        }
    }

    double calcularMediaAvaliacoes() {
        if (numAvaliacoes == 0) {
            return 0.0;
        } else {
            return somaAvaliacoes / numAvaliacoes;
        }
    }
}
