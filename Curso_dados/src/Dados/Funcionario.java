package Dados;

public class Funcionario {
	public String nome;
	public double bruto;
	public double taxa; 
		
	public double salarioLiquid() {
		return bruto - taxa;
	}
	
		public void addTax(double percentage) {
			bruto += bruto * percentage / 100.0;
		}
		
	public String toString() {
		return nome 
				+ " , $" 
				+ String.format("%.2f", salarioLiquid());
		
	}

}
