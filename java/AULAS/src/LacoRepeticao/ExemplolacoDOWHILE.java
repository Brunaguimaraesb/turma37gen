package LacoRepeticao;

import java.util.Scanner;

public class ExemplolacoDOWHILE {

public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		int idade;
		
		System.out.printf("Entre com sua idade: ");
		idade = leia.nextInt();
		
		do {
			
			System.out.printf("\nSua idade: %d", idade);
			if(idade>=18) {
				System.out.printf(" \nVocê é de maior...");
				
			}
			else {
				System.out.printf("\nVocê é de menor...");

			}
			System.out.printf("\nEntre com sua idade: ");
			idade = leia.nextInt();
			
		}while(idade>=1);
		
	}
}
