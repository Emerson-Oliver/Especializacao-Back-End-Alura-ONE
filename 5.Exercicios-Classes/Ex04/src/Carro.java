public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("Ficha Técnica do Carro:");
        System.out.println("Modelo " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdadeDoCarro(int anoAtual) {
        return anoAtual - ano;
    }

}
