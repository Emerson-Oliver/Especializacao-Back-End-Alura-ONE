import java.util.Scanner;

public class TipoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroDigitado = sc.nextInt();

        if(numeroDigitado > 0) {
            System.out.println("Numero Positivo");
        } else if (numeroDigitado < 0) {
            System.out.println("Numero Negativo");
        } else {
            System.out.println("Foi digitado 'Zero'");
        }

        sc.close();
    }
}

