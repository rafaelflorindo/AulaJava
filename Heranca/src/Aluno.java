import java.time.LocalDate;

public class Aluno extends Pessoa{
    public String matricula;

    public Aluno(String nome, String cpf, LocalDate dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.setMatricula(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + this.getMatricula() + '\'' +
                ", nome='" + this.getNome() + '\'' +
                ", cpf='" + this.getCpf() + '\'' +
                ", dataNascimento='" + this.getDataNascimento() + '\'' +
                '}';
    }
}
