package Lista3;

import java.util.Scanner;

public class Lista3Questao5 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		int soma=0;
		
		do {
			System.out.printf("Digite um número: ");
			numero= leia.nextInt();
			soma = soma + numero;
			
		}while(numero!=0);
		
		System.out.printf("A soma dos números digitados foi %d ",soma);

		
		
	}

}
