package entities;

public class Funcionario {
	private String nome;
	private int idade;
	private String genero;
	private double salario;
	
	
	

public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", salario=" + salario
				+ ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getGenero()=" + getGenero()
				+ ", getSalario()=" + getSalario() + "]";
	}

	
	
	

}
