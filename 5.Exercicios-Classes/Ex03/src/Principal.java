import java.util.Locale;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Musica musica1 = new Musica();

        musica1.titulo = "Imagine";
        musica1.artista = "John Lennon";
        musica1.anoLancamento = 1971;

        musica1.avaliar(4.7);
        musica1.avaliar(4.9);
        musica1.avaliar(4.9);
        musica1.exibirFichaTecnica();
    }
}
