import java.util.Date;

public class Funcionario extends Pessoa{
    public Double salario;
    public Date dataAdmissao;
    public String cargo;

    public Funcionario(String nome, String cpf, Date dataNascimento, Double salario, Date dataAdmissao, String cargo) {
        super(nome, cpf, dataNascimento);
        this.setCargo(cargo);
        this.setSalario(salario);
        this.setDataAdmissao(dataAdmissao);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                " nome='" + this.getNome() + '\'' +
                ", cpf='" + this.getCpf() + '\'' +
                ", dataNascimento='" + this.getDataNascimento() + '\'' +
                ", cargo='" + this.getCargo() + '\'' +
                ", dataAdmissao='" + this.getDataAdmissao() + '\'' +
                ", salario=" + this.getSalario() +
                '}';
    }
}
