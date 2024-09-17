import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double avaliacaomedia = 0.0;
        double nota = 0.0;

        for (int index = 0; index <3; index +=1) {
            System.out.print("Qual a sua avaliaçao para esse filme? ");
            nota = sc.nextDouble();
            avaliacaomedia += nota;
        }
        System.out.printf("Média de avaliações: %.1f" , avaliacaomedia / 3);
    }
}
