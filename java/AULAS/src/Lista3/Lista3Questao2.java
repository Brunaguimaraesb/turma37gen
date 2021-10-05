package Lista3;

import java.util.Scanner;

public class Lista3Questao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contadorImpar=0;
		int contadorPar=0;
		int numero=0;
		
		
		for(int x=0;x<10;x++) {
			System.out.print("Digite um numero inteiro: ");
			numero = leia.nextInt();
			if(numero%2==1 && numero>0) {
				contadorImpar++;
			}
			else if(numero%2==0 && numero>0) {
				contadorPar++;
			}	
				
		}
				
		
		System.out.printf("Quantidade de números ímpares: %d",contadorImpar);
		System.out.printf("\nQuantidade de números pares: %d",contadorPar);

	}
}
