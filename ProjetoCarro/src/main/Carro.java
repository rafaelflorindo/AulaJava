package main;

public class Carro {
	public String modelo;
	public int ano;
	public String cor;
	public String tipoCombustivel;
	
	
	
	public Carro(String modelo, int ano, String cor, String tipoCombustivel) {
		this.setModelo(modelo);
		this.setAno(ano);
		this.setCor(cor);
		this.setTipoCombustivel(tipoCombustivel);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
}
