package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Carga inicial do sistema
		
		Carro carro1 = new Carro("GOL", 2023, "Vermelho", "Flex");
		Carro carro2 = new Carro("Creta", 2022, "Cinza", "Flex");

		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		carros.add(carro1);
		carros.add(carro2);
		
		carros.add(new Carro("HB20", 2021, "Verde", "Flex"));
		
		System.out.println("Modelo: " + carros.get(0).getModelo());
		System.out.println("Ano: " + carros.get(0).getAno());
		System.out.println("Cor: " + carros.get(0).getCor());
		System.out.println("Tipo Combústivel" + carros.get(0).getTipoCombustivel());
		
		int opcao;
		do {
			System.out.println("**********************************");
			System.out.println("1 - Adicionar");
			System.out.println("2 - Listar todos");
			System.out.println("3 - Listar Um");
			System.out.println("4 - Alterar");
			System.out.println("5 - Excluir");
			System.out.println("6 - Sair");
			System.out.println("**********************************");
			System.out.println("Escolha uma ação: ");
			Scanner scan = new Scanner(System.in);
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("**********************************");
					System.out.println("Adicionando Carro");
					System.out.println("**********************************");
					
					System.out.println("Informe o Modelo");
					String modelo = scan.nextLine();
					
					System.out.println("Informe o Ano");
					int ano = scan.nextInt();
					scan.nextLine();
					
					System.out.println("Informe a cor do carro");
					String cor = scan.nextLine();
					
					System.out.println("Informe o tipo de combústivel");
					String tipoCombustivel = scan.nextLine();
					
					carros.add(new Carro(modelo, ano, cor, tipoCombustivel));
					
					break;
				case 2:
					System.out.println("**********************************");
					System.out.println("Listando os Carros");
					System.out.println("**********************************");
					
					for(int i = 0; i < carros.size(); i++) {
						System.out.println("\nCarro: " + i);
						System.out.println("Modelo: " + carros.get(i).modelo);
						System.out.println("Ano: " + carros.get(i).ano);
						System.out.println("Cor: " + carros.get(i).cor);
						System.out.println("Tipo Combustivel: " + carros.get(i).tipoCombustivel);
					}
					
					break;
				case 3:
					System.out.println("**********************************");
					System.out.println("Listando um Carro");
					System.out.println("**********************************");
					
					System.out.println("Escolha o carro");
					int car = scan.nextInt();
					
					System.out.println("Carro Informado");
					System.out.println("\nModelo: " + carros.get(car).modelo);
					System.out.println("Ano: " + carros.get(car).ano);
					System.out.println("Cor: " + carros.get(car).cor);
					System.out.println("Tipo Combustivel: " + carros.get(car).tipoCombustivel);
					
					break;
				case 4:
					System.out.println("**********************************");
					System.out.println("Alterando um Carro");
					System.out.println("**********************************");
					
					System.out.println("Escolha o carro");
					int carroAlterar = scan.nextInt();
					scan.nextLine();
					
					System.out.println("Informe o Modelo");
					String modelo1 = scan.nextLine();
			
					System.out.println("Informe o Ano");
					int ano1 = scan.nextInt();
					scan.nextLine();
					System.out.println("Informe a cor do carro");
					String cor1 = scan.nextLine();
			
					System.out.println("Informe o tipo de combústivel");
					String tipoCombustivel1 = scan.nextLine();
					
					carros.set(carroAlterar, new Carro(modelo1, ano1, cor1, tipoCombustivel1));
					
					break;
				case 5:
					System.out.println("**********************************");
					System.out.println("Excluindo um Carro");
					System.out.println("**********************************");
					
					System.out.println("Escolha o carro");
					int carroRemover = scan.nextInt();
					scan.nextLine();
					carros.remove(carroRemover);
					break;
				case 6:
					System.out.println("Saindo do Sistema!!!");
			}
		}while(opcao < 6);
	}

}
