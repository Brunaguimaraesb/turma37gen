package Lista3;

import java.util.Scanner;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
*idade for =-99.
*/

public class Lista3Questao3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int idade=0, totalMenor21=0, totalMaior50=0;
		
		
		while(idade != -99) {
			System.out.print("Digite a idade:");
			idade = leia.nextInt();
			if(idade<21 && idade>0) {
				totalMenor21++;
			}
			else if(idade>50) {
				totalMaior50++;
			}
		}
		System.out.printf("Total de pessoas com menor de 21 anos: %s",totalMenor21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %s",totalMaior50);
				
	}
}
