package curso_cotacao;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvereter;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		CurrencyConvereter conver = new CurrencyConvereter();
		Scanner sc = new Scanner(System.in);
			System.out.println("degite os dados: \n");
			System.out.println("Preco dolar: " + conver.dolar);
			System.out.print("Valor a comprar: ");
			conver.compra = sc.nextDouble();
			System.out.println("Vlor iof: " + conver.IOF / 100.00 + " %");
			
			
		
		
		System.out.println();
		System.out.print(conver);
		
		
		
		sc.close();
	}

}
