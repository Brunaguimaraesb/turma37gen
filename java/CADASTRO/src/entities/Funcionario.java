package entities;

public class Funcionario {
	public String nome;
	public int anosNascimento;
	public String genero;
	public double salarioHora = 20.00;
	public double salario;
	
public double Salario (int horas) {
		
	return	salario = salarioHora*horas;
	}
public int calcularIdade() {
	
	return  2021 - anosNascimento;
}
	
	
	public String toString1() {
		return "Funcionario [nome=" + nome + ", anosNascimento=" + anosNascimento + ", genero=" + genero + ", salario="
				+ salario + ", calcularIdade()=" + calcularIdade() + "]";
	}

}
