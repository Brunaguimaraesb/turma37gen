package Entities;

public class ContaEmpresa extends Conta{
	
	private double emprestimoEmpresa=10000.0; 
	
	public ContaEmpresa(int numero, String cpf) {
		super(numero, cpf);
	}
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}
	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
		
	public void pedirEmprestimo(double valor) {
		this.saldo += valor;
		this.emprestimoEmpresa-=valor;
	}
}
