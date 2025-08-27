public class livro implements Comparable<livro> {
    private String titulo;
    private String autor;
    private Integer ano;
    private Double nota;
    private Double preco;

    public livro(String titulo, String autor, Integer ano, Double nota, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.nota = nota;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public double getNota() {
        return nota;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " + ano + ", " + nota + ", " + preco;
    }

    @Override
    public int compareTo(livro outro) {
        return this.titulo.compareTo(outro.titulo);
    }
}
