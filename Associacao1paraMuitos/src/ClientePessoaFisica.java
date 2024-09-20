import java.util.ArrayList;

public class ClientePessoaFisica {
    public String nome;
    public String telefone;
    public String cpf;
    public ArrayList<Conta> conta;

    public ClientePessoaFisica(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        conta = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Conta> getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta.add(conta);
        conta.setCliente(this);
    }

    @Override
    public String toString() {
        return "Cliente Pessoa Fisica\n" +
                "Nome='" + nome + '\'' +
                "\nTelefone='" + telefone + '\'' +
                "\nCPF='" + cpf + '\'' +
                "\nConta(s) = " + conta.toString();
    }
}
