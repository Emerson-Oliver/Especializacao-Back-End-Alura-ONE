public class Main {
    public static void main(String[] args) {
        char letra = 'J';
        String palavra = "ava";

        String mensagem = letra+palavra;
        String mensagem2 = String.format("A letra é %c e a palavra é %s.", letra, palavra);

        System.out.println(letra+palavra);
        System.out.println(mensagem);
        System.out.println(mensagem2);
    }
}