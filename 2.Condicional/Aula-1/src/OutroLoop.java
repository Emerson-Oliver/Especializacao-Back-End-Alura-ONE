import java.util.Locale;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double avaliacaomedia = 0.0;
        double nota = 0.0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação para o filme ou -1 para encerrar:  ");
            nota = sc.nextDouble();

            if(nota != -1) {
                avaliacaomedia += nota;
                totalDeNotas ++;
            }

        }
        System.out.printf("Média de avaliações: %.1f" , avaliacaomedia / totalDeNotas);
    }
}
