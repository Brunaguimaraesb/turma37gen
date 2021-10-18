package Entities;

public class Funcionario {
	
	//atributos
	private String matricula;
	private String nome;
	protected int horasTrabalhadas; //private
	protected double valorHora;  //private
	
	
	//construtor - generate constructor
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		
		
	}
	// encapsulamento -segurança de dados - getters and setters
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double calculoSalario() {
		
		return (this.horasTrabalhadas*this.valorHora);
	}
	
	public double calcularSalarioFerias() {
		
		return (calculoSalario()*1.3);
	}

}
