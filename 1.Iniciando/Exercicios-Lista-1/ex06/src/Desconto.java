public class Desconto {
    public static void main(String[] args) {

        double precoOriginal = 150.00;
        double percentualDesconto = 10.0;
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("O preço com desconto é: R$ " + precoComDesconto);
    }
}
