package Lista2;

import java.util.Scanner;

public class Lista2Questao4 {
	 
	public static void main (String[] args) {
		
		double numero=0.00;
		double resultado=0.00;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite um número qualquer: ");
		numero = leia.nextDouble();
		
		if(numero<0) {
				System.out.printf("Você digitou um número negativo",numero);
		}
		else if(numero ==0) {
				System.out.printf("Você digitou um número nulo",numero);
		}
		else if(numero%2 == 0) {
			System.out.printf("O número digitado é par.\n");
			resultado = Math.sqrt(numero);
			System.out.printf("A raiz quadrada do número %.2f é %.2f",numero,resultado);
		}
		else {
			System.out.printf("O número digitado é ímpar.\n");
			resultado = Math.pow(numero,2);
			System.out.printf("O número %.2f elevado ao quadrado é %.2f",numero,resultado);
		}
		
	}
	
	
	

}
