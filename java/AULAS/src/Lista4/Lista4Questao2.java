package Lista4;

import java.util.Random;

public class Lista4Questao2 {
	/*
	*Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
	* Fa�a um programa que gere um vetor com os lan�amentos,escreva
	* esse vetor. A seguir determine e imprima a m�dia aritm�tica 
	* dos lan�amentos,contabilize e apresente tamb�m quantas
	* foram as ocorr�ncias da maior pontua��o.
	 */
	public static void main(String[] args) {

		Random gerador = new Random();
		int valor [] = new int [10];
		int maiorPontuacao=0, contador=0,soma=0;
		double media=0.00;
		
		for(int x=0;x<10;x++) {
			valor[x] = gerador.nextInt(6)+1;
			soma = soma + valor[x];
			if(valor[x]>maiorPontuacao) {
				maiorPontuacao=valor[x];
			}
		}
		for(int x=0;x<10;x++) {
			System.out.println("Valor" +(x+1)+ ": " +valor[x]);
			if(valor[x]==maiorPontuacao) {
				contador++;
			}
		}
		media= (soma/10.00);
				
			System.out.println("A m�dia aritm�tica das jogadas � " +media+ "\n");
			System.out.println("A maior pontuacao �: " +maiorPontuacao+ " e se repete: " +contador);
	}
}
