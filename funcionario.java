public class funcionario extends pessoa {
    private String horario;
        private double salario;
    public funcionario(String nome, double idade, String sexo, String horario, double salario) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.horario = horario;
    }
    public double getSalario() { return salario; }
    public String getHorario(){ return horario;}
}
