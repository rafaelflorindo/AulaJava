package exercicio;

public class Carro {

	private String cor;
	public String marca;
	public int anoFabricacao;
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
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
}
