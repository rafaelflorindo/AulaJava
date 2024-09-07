import java.text.NumberFormat;

public class Gol extends Carro{
    public String modelo;

    public Gol() {
    }

    public Gol(String marca, String cor, Double valor, String modelo) {
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
        return "Gol{" +
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
