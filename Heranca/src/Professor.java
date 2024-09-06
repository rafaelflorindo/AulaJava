import java.util.Date;

public class Professor extends Pessoa {
    public String disciplina;
    public Double salario;

    public Professor(String nome, String cpf, Date dataNascimento, String disciplina, Double salario) {
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

    public boolean setSalario(Double salario) {
        if(salario>0) {
            this.salario = salario;
            return true;
        }
        return false;
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
