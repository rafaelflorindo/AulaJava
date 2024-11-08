public class ContaPoupanca extends Conta{
    public String variacao;

    public String getVariacao() {
        return variacao;
    }

    public void setVariacao(String variacao) {
        this.variacao = variacao;
    }

    @Override
    public void imprimeSaldo() {
        System.out.println("***** Extrado da conta *****");
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Variação da Poupança: " + getVariacao());
        System.out.println("R$ " + this.getSaldo());
    }
}
