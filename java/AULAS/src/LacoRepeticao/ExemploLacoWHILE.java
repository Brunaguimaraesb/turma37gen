package LacoRepeticao;

import java.util.Scanner;

public class ExemploLacoWHILE {
	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		int idade;
		
		System.out.printf("Entre com sua idade: ");
		idade = leia.nextInt();
		
		while(idade>=1) {
			System.out.printf("Sua idade: %d", idade);
			if(idade>=18) {
				System.out.printf(" Você é de maior...");
				
			}
			else {
				System.out.printf(" Você é de menor...");

			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = leia.nextInt();
		}
		
	}

}
