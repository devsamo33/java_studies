package application;
import java.util.Locale;
import java.util.Scanner;

import Dados.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			Funcionario funcionario = new Funcionario();
				System.out.println("Digite os dados: ");
				System.out.print("Nome: ");
				funcionario.nome = sc.nextLine();
				System.out.print("Salario bruto: ");
				funcionario.bruto = sc.nextDouble();
				System.out.print("taxa porcentagem: ");
				funcionario.taxa = sc.nextDouble();
			
			System.out.println();
			System.out.print("funcionario: "+ funcionario);
			System.out.println();
			System.out.print("porcentagem a ser add: ");
			double percentage = sc.nextDouble();
			funcionario.addTax(percentage);
			
			System.out.println();
			System.out.print("update data: " + funcionario);
			
			
			
			
		sc.close();
	}
	
}