
public class Filme {
    String nome;
    short anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    void exibeFichaTecnica () {
        System.out.println("Nome do Filme: "+ nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes +=1;
    }

    double retornaMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
