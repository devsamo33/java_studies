package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		
			
				System.out.print("Enter product data: \n");
				System.out.print("nome: ");
				String nome = sc.nextLine();
				System.out.print("Preco: ");
				double preco = sc.nextDouble();
				System.out.print("Quantidade estoque: ");
				int quantidade = sc.nextInt();
					Product product = new Product (nome, preco, quantidade);
					
					
					
					product.setNome ("computador");
					System.out.println("Update name: " + product.getNome());
					product.setPreco(1200.00);
					System.out.println("update preco: " + product.getPreco());
					
					System.out.println();
					System.out.println("Product Data: " + product);
					System.out.println();
					System.out.print("Numero de produtos adiocionados ao estoque: ");
					int quantity = sc.nextInt();
					product.addProducts(quantity);
		
				System.out.println();
				System.out.println("Update Product Data: " + product);
				
					System.out.println();
					System.out.print("Numero de produtos removidos do estoque: ");
					quantity = sc.nextInt();
					product.removeProducts(quantity);
				
				System.out.println();
				System.out.println("Update Product Data: " + product);
				
				
				sc.close();

	}

}
