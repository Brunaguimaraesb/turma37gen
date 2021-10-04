package Lista2;

import java.util.Scanner;

public class Lista2Questao1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		int maiorNumero=0;
		
		System.out.printf("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.printf("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.printf("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		if(numero1>numero2 && numero1>numero3) {
			maiorNumero = numero1;
		}
		else if (numero2>numero1 && numero2>numero3) {
			maiorNumero = numero2;
		}
		else {
			maiorNumero = numero3;
		}
		System.out.printf("\nPrimeiro número: %d,\nSegundo número: %d,\nTerceiro número: %d,\nO maior número foi %d. ",numero1,numero2,numero3,maiorNumero);
	}

}
