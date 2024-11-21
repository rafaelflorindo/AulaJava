package empregado;

import comum.Empregado;

public class Comissionado extends Empregado {

    private double salarioBase;
    private double comissao;
    private int quantidade;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularSalario() {
        double salarioFinal =
                this.getSalarioBase() + ((this.getSalarioBase()  * this.getComissao()) / 100);
        return salarioFinal;

    }

}
