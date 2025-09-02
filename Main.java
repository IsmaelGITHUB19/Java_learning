import java.util.Arrays;

public class Main {
    private static final String String = null;

    public static void main(String[] args) {
        // Criando vetor de livros
        livro [] livros = {
            new livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 4.9, 50.0),
            new livro("1984", "George Orwell", 1949, 4.8, 30.0),
            new livro("Duna", "Frank Herbert", 1965, 4.7, 45.0),
            new livro("Neuromancer", "William Gibson", 1984, 4.5, 40.0),
            new livro("Fahrenheit 451", "Ray Bradbury", 1953, 4.6, 35.0)
        };
        animal rato = new animal("Rato", 20, "Roedor");
        System.out.println(" Nome " + rato.getNome() + " Idade " + rato.getIdade() + " Especie " + rato.getEspecie());
       pessoa ismael = new pessoa("Ismael",20,"Masculino");
        System.out.println(ismael.getNome() + " " + ismael.getIdade() + " " + ismael.getsexo());
       
       pessoa [] cadastros = {
            new pessoa("Julio", 50, "Masculino"),
            new pessoa ("Amanda", 20, "Feminino"),
       };
       System.out.println(cadastros[0].getNome() + " " + cadastros[1].getIdade() + " ");
       
       funcionario Felipe = new funcionario("Felipe", 33, "Masculino", "Matutino - Vespertino", 3500);
       System.out.println(Felipe.getNome()+ " " + Felipe.getIdade() + " " + Felipe.getsexo() + " " + Felipe.getSalario() + " " + Felipe.getHorario());
    }
 }
