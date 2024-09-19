package associacao;

public class CPF {
    private String numCPF;
    public Pessoa pessoa;

    public CPF(String cpf){
        this.setNumCPF(cpf);
    }

    public String getNumCPF() {
        return numCPF;
    }

    public void setNumCPF(String numCPF) {
        this.numCPF = numCPF;
    }
}
