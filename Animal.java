public class animal implements Comparable<animal> {
    private String nome;
    private double idade;
    private String especie;

    // Construtor: inicializa os atributos
    public animal(String nome, double idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
     }
     public String getNome() {
        return nome;
    }

    public double getIdade() {
        return idade;
    }
    public String getEspecie() {
        return especie;
    }
    @Override
    public int compareTo(animal o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
