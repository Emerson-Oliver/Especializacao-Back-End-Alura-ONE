import java.util.Locale;

public class ConversorDeTemperatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        float celsius = 33f;
        float fahrenheit = (celsius * 1.8f) + 32f;

        String temperaturaConvertida = String.format("A temperatura em graus Celsius %.1f equivale a Fahrenheit é: %.1f", celsius, fahrenheit);

        System.out.println(temperaturaConvertida);

        int fahrenheitInt = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + fahrenheitInt);
    }
}
