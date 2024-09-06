import java.time.LocalDate;

public class Professor extends Pessoa {
    public String disciplina;
    public Double salario;

    public Professor(String nome, String cpf, LocalDate dataNascimento, String disciplina, Double salario) {
        super(nome, cpf, dataNascimento);
        this.setDisciplina(disciplina);
        this.setSalario(salario);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplina='" + this.getDisciplina() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", cpf='" + this.getCpf() + '\'' +
                ", dataNascimento='" + this.getDataNascimento() + '\'' +
                ", salario=" + this.getSalario() +'}';
    }
}
