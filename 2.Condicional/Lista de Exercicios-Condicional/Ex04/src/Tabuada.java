import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero para tabuada:  ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do numero: " + numero);
        for(int index = 1; index <=10; index +=1) {
            System.out.println(index + " x " + numero + " = " + (index * numero));
        }

        sc.close();
    }
}
