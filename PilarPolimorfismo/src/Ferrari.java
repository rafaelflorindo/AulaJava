import java.text.NumberFormat;

public class Ferrari extends Carro{
    public String modelo;

    public Ferrari() {
    }

    public Ferrari(String marca, String cor, Double valor, String modelo) {
        super(marca, cor, valor);
        this.setModelo(modelo);
    }
    public void aumentarPreco(Double valor){
        /*double novoValor = this.getValor() + (this.getValor() * (valor/100));
        this.setValor(novoValor);
        */
        double novoValor = (this.getValor() * (valor/100));
        super.aumentarPreco(novoValor);
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
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
