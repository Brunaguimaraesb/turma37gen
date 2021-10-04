package Lista2;

import java.util.Scanner;

public class Lista2Questao2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2, numero3;
		int auxiliar= 0;

		System.out.printf("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.printf("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.printf("Digite o terceiro número: ");
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
		
		
		System.out.printf("Você digitou: %d, %d, %d.", numero1, numero2, numero3);
		System.out.printf("\nA ordem crescente dos numeros digitados é: %d, %d e %d." ,numero1, numero2, numero3);

	}
}