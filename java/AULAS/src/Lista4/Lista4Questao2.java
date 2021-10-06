package Lista4;

import java.util.Random;

public class Lista4Questao2 {
	/*
	*Um dado é lançado 10 vezes e o valor correspondente é anotado.
	* Faça um programa que gere um vetor com os lançamentos,escreva
	* esse vetor. A seguir determine e imprima a média aritmética 
	* dos lançamentos,contabilize e apresente também quantas
	* foram as ocorrências da maior pontuação.
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
				
			System.out.println("A média aritmética das jogadas é " +media+ "\n");
			System.out.println("A maior pontuacao é: " +maiorPontuacao+ " e se repete: " +contador);
	}
}
