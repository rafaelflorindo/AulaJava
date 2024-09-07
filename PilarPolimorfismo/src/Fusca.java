import java.text.NumberFormat;

public class Fusca extends Carro{
    public String modelo;

    public Fusca() {
    }

    public Fusca(String marca, String cor, Double valor, String modelo) {
        super(marca, cor, valor);
        this.setModelo(modelo);
    }
    public void aumentarPreco(Double valor){
        super.aumentarPreco(this.getValor() * (valor/100));
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Fusca{" +
                "modelo='" + this.getModelo() + '\'' +
                ", marca='" + this.getMarca() + '\'' +
                ", cor='" + this.getCor() + '\'' +
                ", valor=" + NumberFormat.getCurrencyInstance().format(this.getValor()) +
                '}';
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
