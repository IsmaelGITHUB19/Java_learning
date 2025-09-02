public class livros {
    private String nome;
    private String autor;
    private Integer anop;
    private Double nota;
    private Double preco;

    public livros (String nome, String autor, Integer anop, Double nota, Double preco){
        this.nome = nome;
        this.autor = autor;
        this.anop = anop;
        this.nota = nota;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnop() {
        return anop;
    }

    public double getNota() {
        return nota;
    }

    public double getPreco() {
        return preco;
    }
}
