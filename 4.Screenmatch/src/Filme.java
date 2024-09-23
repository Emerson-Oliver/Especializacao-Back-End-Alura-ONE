
public class Filme {
    String nome;
    short anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

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
