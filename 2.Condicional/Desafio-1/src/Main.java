import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random numeroAleatorio = new Random();

        System.out.println(numeroAleatorio.nextInt(101));

        sc.close();
    }
}