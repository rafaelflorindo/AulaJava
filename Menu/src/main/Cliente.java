package main;

import java.time.LocalDate;

public class Cliente {
	private String nome;
	private String telefone;
	private String cpf;
	private String email;
	private LocalDate dataNascimento;
	
	public boolean cadastrarCliente(String nome, String telefone, 
			String cpf, String email, LocalDate dataNascimento) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setCpf(cpf);
		this.setEmail(email);
		this.setDataNascimento(dataNascimento);
		return true;
	}
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email; //validar
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	private void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
	private void setCpf(String cpf) {
		this.cpf = cpf;//validar
	}
	public String getCpf() {
		return cpf;
	}

	
	
}
