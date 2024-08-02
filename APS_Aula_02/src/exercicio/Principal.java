package exercicio;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro gol = new Carro();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a cor do Carro: ");
		gol.setCor(scan.nextLine());
		
		System.out.println("Informe a marca do carro:");
		gol.setMarca(scan.nextLine());
		
		System.out.println("Informe o tipo de combústivel do carro:");
		gol.setTipoCombustivel(scan.nextLine());
		
		System.out.println("Informe o ano de fabricação do carro:");
		gol.setAnoFabricacao(scan.nextInt());
		
		System.out.println("Informe a quantidade de portas do carro:");
		gol.setQuantidadePortas(scan.nextInt());
		
		
		
		/*
		gol.setCor("Vermelho");
		gol.setMarco("VolksWagem")
		gol.setAnoFabricacao(2024);
		gol.setQuantidadePortas(4);
		gol.setTipoCombustivel("Flex");*/
		
		System.out.println("Cor: " + gol.getCor());
		System.out.println("Marca: " + gol.getMarca());
		System.out.println("Ano Fabricação: " + gol.getAnoFabricacao());
		System.out.println("Quantidade de Portas: " + gol.getQuantidadePortas());
		System.out.println("Tipo de Combústivel: " + gol.getTipoCombustivel());
		
	}

}
