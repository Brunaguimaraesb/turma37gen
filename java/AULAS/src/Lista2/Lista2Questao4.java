package Lista2;

import java.util.Scanner;

public class Lista2Questao4 {
	 
	public static void main (String[] args) {
		
		double numero=0.00;
		double resultado=0.00;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero qualquer: ");
		numero = leia.nextDouble();
		
		if(numero<0) {
				System.out.printf("Voc� digitou um n�mero negativo",numero);
		}
		else if(numero ==0) {
				System.out.printf("Voc� digitou um n�mero nulo",numero);
		}
		else if(numero%2 == 0) {
			System.out.printf("O n�mero digitado � par.\n");
			resultado = Math.sqrt(numero);
			System.out.printf("A raiz quadrada do n�mero %.2f � %.2f",numero,resultado);
		}
		else {
			System.out.printf("O n�mero digitado � �mpar.\n");
			resultado = Math.pow(numero,2);
			System.out.printf("O n�mero %.2f elevado ao quadrado � %.2f",numero,resultado);
		}
		
	}
	
	
	

}
