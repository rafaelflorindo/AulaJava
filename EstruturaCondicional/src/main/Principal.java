package main;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 12;
	/*	
		if(idade < 18){
			System.out.println("Menor de Idade!");
		}
		else if(idade == 18) {
			System.out.println("Sua idade é de 18 anos, sendo assim já é de maior idade");
		}
		else{
			System.out.println("Maior de Idade!");
		}
	*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Escolha uma opção no menu:");
		int opcao = scan.nextInt();
		
		scan.close();
		switch(opcao) {
			case 1: System.out.println("Cadastro de cliente");
			break;
			case 2: System.out.println("Alterar cliente");
			break;
			default: System.out.println("Valor não condiz com o esperado!!!");		
		}	
		
		*/
		/*System.out.println("Laço FOR");
		for(int ingresso = 0; ingresso < 10; ingresso++) {
			System.out.println("Ingresso: " + (ingresso+1));
		}
		
		System.out.println("Laço WHILE");
		int ingresso = 0;
		while(ingresso < 10) {
			System.out.println("Ingresso: " + (ingresso+1));
			ingresso++;
		}
		
		System.out.println("Laço DO - WHILE");
		ingresso = 0;
		
		do {
			System.out.println("Ingresso: " + (ingresso+1));
			ingresso++;
		}while(ingresso < 10);
		*/
		//ARRAY
		
		int[] quantidade = new int[4];
		quantidade[0] = 10;
		quantidade[1] = 20;
		quantidade[2] = 30;
		quantidade[3] = 40;
		
		int soma = quantidade[0] + 
				quantidade[1] +
				quantidade[2] + quantidade[3];
		
		double media = soma / 4;
		
		//System.out.println(quantidade[0]);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		int quantidadeItens = quantidade.length;

		Scanner scan = new Scanner(System.in);
		for(int j = 0; j< quantidadeItens; j++) {
			System.out.println("Informe o valor da posição " + (j+1));
			quantidade[j] = scan.nextInt();
		}
		
		soma = 0;
		for(int i = 0; i < quantidadeItens; i++) {
			//soma = soma + quantidade[i];
			soma += quantidade[i];
		}		
		media = soma/quantidadeItens;

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}
