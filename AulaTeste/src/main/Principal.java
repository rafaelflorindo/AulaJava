package main;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 48;
		int numero2 = 42;
		
		int soma = numero1 + numero2;
		System.out.println("Soma = " + soma);
				
		System.out.println("--------");	
		Pessoa marcos = new Pessoa();
		marcos.nome = "Marcos de Souza";
		marcos.telefone = "44 98747-7848";
		marcos.dataNascimento = "10/01/1900";
		marcos.endereco = "Rua Vinicius Conde, 80";
		marcos.sexo = 'M';
		marcos.email = "marcos.souza@gmail.com";
		marcos.idade = 78;
		
		System.out.println("Nome: " + marcos.nome);
		System.out.println("Telefone: " + marcos.telefone);
		System.out.println("Endereço: " + marcos.endereco);
		System.out.println("E-mail: " + marcos.email);
		System.out.println("Data Nascimento: " + marcos.dataNascimento);
		System.out.println("Sexo: " + marcos.sexo);
		System.out.println("Idade Original: " + marcos.idade);
		
		int idade = marcos.idade;
		idade++;
		marcos.idade=idade;
	
		System.out.println("Idade incrementada: " + marcos.idade);
		
		marcos.andar();
		marcos.falar();
		marcos.dormir();
		marcos.pensar();
	}
}
