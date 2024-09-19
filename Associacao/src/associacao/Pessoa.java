package associacao;

public class Pessoa {
    public String nome;
    private CPF cpf;

    public Pessoa(String nome, CPF cpf){
        this.setNome(nome);
        this.setCpf(cpf);
        this.getCpf().pessoa = this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private CPF getCpf() {
        return cpf;
    }

    private void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", cpf=" + this.getCpf().getNumCPF() +
                '}';
    }
}
