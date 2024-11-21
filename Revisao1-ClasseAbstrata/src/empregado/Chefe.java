package empregado;

import comum.Empregado;

public class Chefe extends Empregado {
    private Double salarioMensal;

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        double salarioFinal = (this.getSalarioMensal() * 0.25) + this.getSalarioMensal();
        return salarioFinal;
    }
}
