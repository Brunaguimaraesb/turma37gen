package Lista2;

import java.util.Scanner;

public class Lista2Questao2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2, numero3;
		int auxiliar= 0;

		System.out.printf("Digite o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.printf("Digite o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.printf("Digite o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2) {
			auxiliar = numero1;
			numero1 = numero2;
			numero2 = auxiliar;
		}
		if(numero2 > numero3) {
			auxiliar = numero2;
			numero2 = numero3;
			numero3 = auxiliar;
		}
		if(numero1 > numero2) {
			auxiliar = numero1;
			numero1 = numero2;
			numero2 = auxiliar;
		}	
		
		
		System.out.printf("Voc� digitou: %d, %d, %d.", numero1, numero2, numero3);
		System.out.printf("\nA ordem crescente dos numeros digitados �: %d, %d e %d." ,numero1, numero2, numero3);

	}
}