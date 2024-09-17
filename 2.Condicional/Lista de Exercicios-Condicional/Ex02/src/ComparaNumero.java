import java.util.Scanner;

public class ComparaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        }

        else if (numero1 > numero2) {
            System.out.println("Os números são diferentes, primeiro numero maior que o segundo numero");
        }

        else if(numero1 < numero2) {
            System.out.println("Os números são diferentes, primeiro numero menor que o segundo numero");
        }

        sc.close();
    }
}
