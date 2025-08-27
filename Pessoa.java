public class pessoa {
    private String nome;
    private double idade;
    private String sexo;

    public pessoa(String nome, double idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
     }
     public String getNome() {
        return nome;
    }

    public double getIdade() {
        return idade;
    }
    public String getsexo() {
        return sexo;
    }
}
