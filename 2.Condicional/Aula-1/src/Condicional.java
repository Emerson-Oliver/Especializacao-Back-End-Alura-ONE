public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1985;
        boolean incluidoNoAno = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo! ");
        } else {
            System.out.println("Filme retro que vale a pena Assistir");
        }

        if (incluidoNoAno == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        }
        else{
            System.out.println("Deve pagar a locação");
        }
    }
}
