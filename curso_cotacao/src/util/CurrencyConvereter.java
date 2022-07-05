package util;

public class CurrencyConvereter {
	
	
	public  double dolar = 3.10;
	public double compra;
	public  double IOF = 600.00;
	
	public double totalPag() {
		return dolar *= compra + 600.00 /100.00;

}	

	

public String toString(){
		return "Valor dolar: "
				+String.format("%.2f", dolar)
				+ " , "
				+" valor compra: "
				+ String.format("%.2f", compra)
				+ " , "
				+ " Valor a ser pago: "
				+ String.format("%.2f", totalPag());		
			
		
	}
		

}
