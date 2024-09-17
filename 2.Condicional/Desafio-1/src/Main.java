import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);

        int tentativas = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando (entre 0 e 100).");
        System.out.println("Você tem " + tentativas + " tentativas!");

        for (int index = 1; index <= tentativas; index+=1) {
            System.out.print("Tentativa " + index + ": ");
            int palpite = sc.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + index + " tentativas.");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior do que " + palpite + ".");
            } else {
                System.out.println("O número é menor do que " + palpite + ".");
            }
            if (index == tentativas) {
                System.out.println("Você esgotou suas tentativas. O número era " + numeroAleatorio + ".");
            }
        }
        sc.close();
    }
}
