abstract class Conta {
    private double saldo;
    private String titular;

    public abstract void imprimeSaldo();

    public boolean deposito(double deposito){
        if(deposito > 0) {
            //this.saldo = this.getSaldo() + deposito;
            this.setSaldo(this.getSaldo() + deposito);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
