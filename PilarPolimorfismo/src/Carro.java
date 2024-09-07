import java.text.NumberFormat;

public class Carro {
    protected String marca;
    protected String cor;
    protected Double valor;

    public Carro(){

    }

    public Carro(String marca, String cor, Double valor) {
        this.setMarca(marca);
        this.setCor(cor);
        this.setValor(valor);
    }

    public void aumentarPreco(Double valor){
        /*double novoValor = this.getValor() + valor;
        this.setValor(novoValor);*/

        this.setValor(this.getValor() + valor);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", valor=" + NumberFormat.getCurrencyInstance().format(valor) +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
