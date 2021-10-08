package entities;

public class Clientes {
	
	public String nome;
	public int anosNascimento;
	public String email;
	public String genero;
	public String opcaoCompras;
	
public int calcularIdade() {
		
		return  2021 - anosNascimento;
	}
	public int calcularIdade(int ano) {
		
		return  ano - anosNascimento;
	}
	
	@Override
	public String toString() {
		return "Clientes [nome=" + nome + ", anosNascimento=" + anosNascimento + ", email=" + email + ", genero="
				+ genero + ", opcaoCompras=" + opcaoCompras + ", calcularIdade()=" + calcularIdade() + "]";
	}
	

}

