package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Cliente clienteJose = new Cliente(); 
		int opcao;
		do {
			System.out.println("***********************************");
			System.out.println("1 - Cadastro de cliente");
			System.out.println("2 - Alterar cliente");
			System.out.println("3 - Listar clientes");
			System.out.println("4 - Sair");
			System.out.println("***********************************");
			System.out.println("Escolha uma opção no menu:");
			opcao = scan.nextInt();

			switch(opcao) {
				case 1: 
					
					//System.out.println("Cadastro de cliente");
					
					LocalDate localDate6 = LocalDate.parse("1980-07-22", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					
					boolean retorno = clienteJose.cadastrarCliente("José", "44 98401-4320", 
							"123456789", "jose@gmail.com", localDate6);
					if (retorno)
						System.out.println("Registro efetuado com sucesso");
				break;
				case 2: System.out.println("Alterar cliente");
				break;
				case 3: System.out.println("Listar cliente");
					System.out.println("Nome" + clienteJose.getNome());
				break;
				case 4: System.out.println("Saindo do Sistema");
				break;
				default: System.out.println("Valor não condiz com o esperado!!!");		
			}	
		}while(opcao != 4);
		scan.close();
	}
}
