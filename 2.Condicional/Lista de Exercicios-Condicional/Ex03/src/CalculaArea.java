import java.util.Scanner;

public class CalculaArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Informe o valor do lado do quadrado: ");
            double lado = sc.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.printf("A área do quadrado é: %.1f" , areaQuadrado);
        } else if (opcao == 2) {
            System.out.print("Informe o valor do raio do círculo: ");
            double raio = sc.nextDouble();
            double areaCirculo = Math.PI * raio * raio;
            System.out.printf("A área do círculo é: %.1f" , areaCirculo);
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        sc.close();
    }
}
