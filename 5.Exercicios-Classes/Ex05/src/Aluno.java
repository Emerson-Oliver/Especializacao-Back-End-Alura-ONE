public class Aluno {
    String nome;
    int idade;


    void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade + " anos");
    }

}