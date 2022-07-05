package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);		
		
		
		System.out.println("Digite os dados: ");
		System.out.print("nome: ");
		String Nome = sc.nextLine();
		System.out.print("num. Conta: ");
		int numConta = sc.nextInt();
		
		System.out.println();
			Dados dados = new Dados (numConta, Nome);
		
		System.out.println();
		System.out.print("Deseja depositar um valor inicial ? s/n: ");
		char escolha = sc.next().charAt(0);
		
	if(escolha == 's') {
		
			System.out.println("Digite o valor :");
			double Saldo = sc.nextDouble();
			dados.setSaldo(Saldo);
			System.out.print("valor adicionado: R$ " + dados.getSaldo());
				dados = new Dados (numConta, Nome, Saldo);
	}else if(escolha == 'n' ) {
			
			sc.nextLine();
	}
				System.out.println();
				System.out.print("Update data: \n" + dados);
		 
		 System.out.println();
		 System.out.print("Deseja fazer um deposito ? s/n");
		 escolha = sc.next().charAt(0);
		
	if(escolha == 's') {
		System.out.println("digite o valor: ");
		double adicional = sc.nextDouble(); 
		dados.addSaldo(adicional);
		System.out.print("Valor adicionado: R$ " + adicional);
	}
	
				System.out.println();
				System.out.print("Update data: \n" + dados);
	
		 
		 System.out.println();
		 System.out.print("Deseja fazer um saque? s/n");
		 escolha = sc.next().charAt(0);
		 
	if(escolha == 's') {
			 System.out.println("Digite o valor para saque: ");
			 double saque = sc.nextDouble();
			 dados.removeSaque(saque);
		
			 System.out.print("valor do saque: R$ " + saque);
	
	}else if (escolha == 'n') {
			 sc.nextLine();
	}
	
				System.out.println();
				System.out.print("Update data: \n" + dados);
	
		 
		 
		 sc.close();
		}
			
			
			
		
		
	}


