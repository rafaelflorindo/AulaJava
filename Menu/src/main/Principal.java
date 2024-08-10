package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente(); 
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
					scan.nextLine();
					System.out.println("Informe o Nome: ");
					String nome = scan.nextLine();
					System.out.println("Informe o Telefone: ");
					String telefone = scan.nextLine();
					System.out.println("Informe o CPF: ");
					String cpf = scan.nextLine();
					System.out.println("Informe o E-mail: ");
					String email = scan.nextLine();
					System.out.println("Informe a data de Nascimento YYYY-mm-dd: ");
					String dataNascimento = scan.nextLine();
					
					LocalDate dtaNascimento = 
							LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));		

					boolean retorno = cliente.cadastrarCliente(nome, telefone, cpf, email, dtaNascimento);
					
					if (retorno)
						System.out.println("Registro efetuado com sucesso");
					else
						System.out.println("Erro ao registrar o cliente!!!");
					break;
				case 2: System.out.println("Alterar cliente");
				break;
				case 3: 
					System.out.println("Listar cliente");
					System.out.println("Nome: " + cliente.getNome());
					System.out.println("Telefone: " + cliente.getTelefone());
					System.out.println("E-mail: " + cliente.getEmail());
					System.out.println("CPF: " + cliente.getCpf());
					System.out.println("Data Nascimento: " + cliente.getDataNascimento());
				break;
				case 4: System.out.println("Saindo do Sistema");
				break;
				default: System.out.println("Valor não condiz com o esperado!!!");		
			}	
		}while(opcao != 4);
		scan.close();
	}
}

