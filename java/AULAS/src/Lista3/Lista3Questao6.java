package Lista3;

import java.util.Scanner;

public class Lista3Questao6 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		double media=0.00,somaTotal=0.00,qtdeMultiplos=0.00;
		
		do {
			System.out.printf("Digite um n�mero inteiro: ");
			numero = leia.nextInt();
			if (numero%3 ==0 && numero>0) {
				somaTotal=somaTotal+numero;
				qtdeMultiplos++;
			}
			
						
		}while(numero!=0);
		media = (somaTotal/qtdeMultiplos);
		System.out.printf("A soma dos m�ltiplos de 3 � %.2f.",somaTotal);
		System.out.printf("\nVoc� digitou %.2f numeros m�ltiplos de 3.",qtdeMultiplos);
		System.out.printf("\nA m�dia entre eles � %.2f.",media);
	}

}
