package exercicio;

public class Carro {

	private String cor;
	public String marca;
	public String anoFabricacao;
	public int quantidadePortas;
	public String tipoCombustivel;
	
	public void setCor(String corRecebida) {
		this.cor = corRecebida;
	}
	public void setMarca(String marca) {
		this.marca= marca;
	}
	
	public String getCor() {
		return this.cor;
	}
	public String getMarca() {
		return this.marca;
	}
}
