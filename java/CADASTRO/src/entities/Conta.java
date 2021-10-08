package entities;

public class Conta {
	
	//atributos
	private int numero; 
	private String cpf;
	private double saldo=10000;
	private boolean ativa;
	
	//construtor - vai construir os valores dentro e vai fazer os valores valerem algo
	public Conta() {
			
	}
	//sobrecarga de construtor
	public Conta(int numero, String cpf, boolean ativa) {
		
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}
	//encapsulamento - getters and setters
	// get = pega a informação
	//set = edita a informação
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public double sacar (double valorSaque) { // se chamar a função sacar ela vai retornar o que tiver dentro do método.
		return saldo = saldo - valorSaque;
	}
	
	public double deposito (double valorDeposito) {
		return saldo = saldo + valorDeposito;
	}
	
	public String toString() {
		return "Conta [numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo + ", ativa=" + ativa + "]";
	}
	

	
	
	
	

}
