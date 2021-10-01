package Lista1;
import java.util.Scanner;

public class Lista1Questao2 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anos, meses, dias, totalDias;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		System.out.println("Digite quantos dias de vida você possui: ");
		totalDias = leia.nextInt();
		
		anos = (totalDias/365);
		meses = (totalDias%365/30);
		dias = (totalDias%365/30);
		
		System.out.println("Oi" +nome+ "sua idade é " +anos+ "anos, " +meses+ " meses e " +dias+ " dias");
		
		
		
		
		
		
	}
}
