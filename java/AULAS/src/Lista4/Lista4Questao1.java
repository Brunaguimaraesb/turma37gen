package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class Lista4Questao1 {

	public static void main(String[] args) {
/*
*Fa�a um programa que crie um vetor por leitura com 5 valores
* de pontua��o de uma atividade e o escreva em seguida. 
*Encontre ap�s a maior pontua��o e a apresente.
*/		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double pontuacao[]= new double [5];
		int x=0;
		double maiorPontuacao=0.00;
		
		
		for(x =0;x<5;x++) {
			System.out.print("Digite um valor: ");
			pontuacao[x]=leia.nextDouble();
		}
		for(x =0;x<5;x++) {
			System.out.print("N�mero "+(x+1)+ ": " +pontuacao[x]+ "\n");
			if(pontuacao[x]>maiorPontuacao) {
				maiorPontuacao=pontuacao[x];
			}
		
		}
		System.out.println("A maior pontua��o �:"+maiorPontuacao);
	}
}
