package Entities;

public class Terceiro extends Funcionario{

	private double adicional;
	
	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override
	public double calculoSalario() {
		
		//colocando a mãe no meio
		//return (super.getHorasTrabalhadas()*super.getValorHora())+this.adicional;
		return (this.horasTrabalhadas* this.valorHora) + adicional;

	}
	@Override
	public double calcularSalarioFerias() {
		
		return (calculoSalario()*1.3);
	}
	
	

}
