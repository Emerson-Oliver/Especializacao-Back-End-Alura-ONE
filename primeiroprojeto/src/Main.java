public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;

        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        float notaDoFilme = 8.1f;
        float media  = (10.0f + 6.3f + 8.0f) / 3f;
        System.out.printf("%.1f", media);
        String sinopse = """
                        Top Gun
                        Filme de ação e aventura com Ton Cruise!
                        Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}