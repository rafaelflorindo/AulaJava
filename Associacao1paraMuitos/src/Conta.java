public class Conta {
    public String numConta;
    public String digito;
    public ClientePessoaFisica cliente;

    public Conta(String numConta, String digito) {
        this.numConta = numConta;
        this.digito = digito;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public ClientePessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente(ClientePessoaFisica cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return  "\nNúmero da Conta='" + numConta + '\'' +
                " - '" + digito;
    }
}
