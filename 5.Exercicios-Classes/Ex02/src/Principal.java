public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.dobraNumero(5);
        int resultado2 = calculadora.dobraNumero(6);

        System.out.println(resultado);
        System.out.println(resultado2);

    }
}
