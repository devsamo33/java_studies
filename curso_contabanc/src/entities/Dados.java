package entities;

public class Dados {

	private int Conta;
	private String holder;
	private double saldo;
	
	
	
public Dados(int conta, String holder) {
		
		Conta = conta;
		this.holder = holder;
	}

public Dados(int conta, String holder, double saldo) {
	super();
	Conta = conta;
	this.holder = holder;
	this.saldo = saldo;
}





public String getNome() {
	return holder;
}
	
	public void setNome(String nome) {
	this.holder = nome;

}
	public int getConta() {
		return Conta;
	}

	public void setConta(int conta) {
		Conta = conta;
	}
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	public double getSaldo() {
		return saldo;
	}
	public void addSaldo(double valor) {
		this.saldo += valor;
	}
	
	public void removeSaque(double saque) {
		this.saldo -= saque + 5.00;
	}
	
	public String toString() {
		return "nome: "
			+	holder
			+ " ,conta:  "	
			+ Conta
			+ " , saldo atual: R$ "
			+ String.format("%.2f", saldo);
	}
}
