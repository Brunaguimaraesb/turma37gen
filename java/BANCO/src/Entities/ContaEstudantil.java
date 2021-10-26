package Entities;

public class ContaEstudantil extends Conta{
    private double limiteEstudantil=5000.00;

    public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
        super(numero, cpf);
        this.limiteEstudantil = limiteEstudantil;
    }

    public double getLimiteEstudantil() {
        return limiteEstudantil;
    }

    public void setLimiteEstudantil(double limiteEstudantil) {
        this.limiteEstudantil = limiteEstudantil;
    }
    public void setLimiteEstudanti(double limiteEstudanti) {
		this.limiteEstudantil = limiteEstudanti;
	}
	
	public void usarEstudantil(double valor) {
		this.saldo+=valor;
		this.limiteEstudantil-=valor;

    }

}
