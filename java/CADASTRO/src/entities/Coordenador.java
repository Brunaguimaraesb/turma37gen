package entities;

public class Coordenador extends PessoaA {
	
	private String cursoCoordenado;
	
	public Coordenador(String nome, int matricula, String cursoCoordenado) {
		
		super(nome,matricula);
		this.cursoCoordenado = cursoCoordenado;
		
	}

	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}
	
}
