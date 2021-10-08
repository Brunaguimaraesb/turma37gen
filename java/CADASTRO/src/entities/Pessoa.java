package entities;

public class Pessoa {

	//atributos//o que o obheto é, tem ou estar
	public String nome;
	public int anosNascimento;
	public boolean viva;
	public String email;
	public char pronome;
	
	
	//metodo
	
	public int calcularIdade() {
		
		return  2021 - anosNascimento;
	}
	public int calcularIdade(int ano) {
		
		return  ano - anosNascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anosNascimento=" + anosNascimento + ", viva=" + viva + ", email=" + email
				+ ", pronome=" + pronome + ", calcularIdade()=" + calcularIdade() + "]";
	}
	
	
}
