import java.util.Locale;

public class Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        float nota1 = 8.5f;
        float nota2 = 7.2f;

        float media = (nota1 + nota2) / 2f;

        System.out.printf("A media é = %.1f", media);
    }
}
