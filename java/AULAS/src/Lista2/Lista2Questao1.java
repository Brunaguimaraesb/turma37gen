package Lista2;

import java.util.Scanner;

public class Lista2Questao1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		int maiorNumero=0;
		
		System.out.printf("Digite o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.printf("Digite o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.printf("Digite o terceiro n�mero: ");
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
		System.out.printf("\nPrimeiro n�mero: %d,\nSegundo n�mero: %d,\nTerceiro n�mero: %d,\nO maior n�mero foi %d. ",numero1,numero2,numero3,maiorNumero);
	}

}
