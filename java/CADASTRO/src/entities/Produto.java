package entities;

public class Produto {
	
	public String codigo;
    public String nome;
    public double valor;
    public int estoque=10;

    public void tirarEstoque(int quantidade) {
        estoque = estoque - quantidade;
    }
    public void colocarEstoque(int quantidade) {
        estoque = estoque + quantidade;
    }
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", estoque=" + estoque + ", valor=" + valor + "]";
    }


}
