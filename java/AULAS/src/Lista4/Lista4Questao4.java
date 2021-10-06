package Lista4;

import java.util.Scanner;

public class Lista4Questao4 {

/* Crie um programa que receba valores do usuário para preencher
* uma matriz 3X3, e em seguida, exiba a soma dos valores dela 
* e a soma dos valores da primeiradiagonal, ou seja, 
* diagonal principal.
 */
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int matriz[][]=new int[3][3];
		int linha=0,coluna=0;
		int somaDiagonal=0;
		int somaTotal=0;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("Digite o valor da matriz: ");
				matriz[linha][coluna]=leia.nextInt();
				somaTotal = somaTotal +matriz[linha][coluna];
				if(linha==coluna) {
					somaDiagonal=somaDiagonal + matriz[linha][coluna];
				}	
			}
		}
		System.out.println(" A soma dos números da matriz é: " +somaTotal);
		System.out.println(" A soma dos números da diagonal é: " +somaDiagonal);
	}
}

