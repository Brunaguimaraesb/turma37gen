package Entities;

public abstract class Conta {

	private int numero;
	private String cpf;
	protected double saldo;
	private boolean ativo;

	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

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
	/*
	public void setSaldo(double saldo){
	this.saldo = saldo;
	}
	 */

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void ativarConta(boolean ativo) {
		this.ativo = true;
		System.out.println("Conta ativada...");
	}

	public void debito(double valor) {
		if (valor <= 0) {
			System.out.println("Imposs�vel realizar a transa��o");
		}
		else if (valor > this.saldo) {
			System.out.println("Saldo indisponivel...");
		} 
		else if (this.saldo>=valor) {
			this.saldo = this.saldo - valor;
			
		}
	}

	public void credito(double valor) {
		if (valor <= 0) {
			System.out.println("Valor informado inv�lido...");
		} else {
			this.saldo = this.saldo + valor;
		}

	}

}
	


