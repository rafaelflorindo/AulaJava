package main;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plantas rosa = new Plantas();
		
		rosa.codigo = 12;
		rosa.especie = "flor";
		rosa.idade = 2;
		rosa.nome = "Rosa branca";
		
		System.out.println("Planta: " + rosa.nome);
		System.out.println("Espécie: " + rosa.especie);
		System.out.println("Idade:" + rosa.idade + " anos.");
		System.out.println("Código: " + rosa.codigo);
		
		System.out.println("-----------------");
		
		
		
		
		double salario = 1500.00;
		byte idade = 127; 
		double peso = 115.00;
		String nome = "Rafael";
		boolean casado = true;
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Casado: " + casado);
		System.out.println("Salário: " + salario);
	}
}
