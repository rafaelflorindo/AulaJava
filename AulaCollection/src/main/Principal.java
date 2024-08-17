package main;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		//Trabalhando com vetores
		int[] ingresso = new int[8];
		double[] salario = new double[150];
		String[] estagiario = new String[4];
		
		ingresso[0]=1;
		ingresso[1]=2;
		salario[0] = 800.00;
		estagiario[0] = "Alan";
		
		System.out.println("Estagiário - " + estagiario[0]);
		estagiario[0] = "Érick";
		System.out.println("\n\nIngresso - " + ingresso[0]);
		System.out.println("Estagiário - " + estagiario[0]);
		System.out.println("Salário - " + salario[0]);		

		//Trabalhando com arrayList
		ArrayList<String> cliente = new ArrayList<String>(); 
		
		cliente.add("Rafael");//adiciona um elemento
		cliente.add("Luiz");
		cliente.add("Érick");
		System.out.println(cliente);
		System.out.println("Quantidade de Clientes: " + cliente.size());
		
		System.out.println("\nCliente: " + cliente.get(0));
		System.out.println("Cliente: " + cliente.get(1));
		System.out.println("Cliente: " + cliente.get(2));
		
		cliente.set(0, "Thiago");//altera um elemento
		System.out.println(cliente);
		
		cliente.remove(1);//remove um elemento do arraylist e reorganiza o arrayList
		System.out.println("\nCliente: " + cliente.get(1));
		System.out.println(cliente);
		System.out.println("Quantidade de Clientes: " + cliente.size());
		
		cliente.clear();//limpa todas os elementos do arraylist
		System.out.println(cliente);
		System.out.println("Quantidade de Clientes: " + cliente.size());
	
		//Exemplo
		ArrayList<String> agendaTelefone = new ArrayList<String>();
		agendaTelefone.add("Rafael; (44) 98401-4320; rafael.florindo@docente.pr.senac.br");
		agendaTelefone.add("Ronie; (44) 97789-9988; ronie.tokumoto@docente.pr.senac.br");
		agendaTelefone.add("André Noel; (44) 97485-3548; noel.andre@docente.pr.senac.br");
		System.out.println(agendaTelefone);
		System.out.println(agendaTelefone.get(2));
		System.out.println("**********************************");
		System.out.println("Percorrendo Cadastro de cliente");
		System.out.println("**********************************");
		
		for(int clientes = 0; clientes < agendaTelefone.size(); clientes++) {
			System.out.println(agendaTelefone.get(clientes));
		}
		
		int i=0; 
		for (String contato: agendaTelefone) {
			System.out.println("["+ i +"] = "+ contato);
			i++;
		}    
	}
}