package Lista1;

import java.util.Scanner;

public class Lista1Questao1 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome; 
		int anos,meses,dias,totalDias;
		
		System.out.println("Digite seu nome:");
		nome= leia.next();
		System.out.println("Digite sua idade em anos:");
		anos= leia.nextInt();
		System.out.println("Digite o complemento da sua idade em meses: " );
		meses=leia.nextInt();
		System.out.println("Digite o complemento da sua idade em dias:" );
		dias=leia.nextInt();
		
		totalDias = (anos*365)+(meses*30)+dias;
		
		System.out.println("Oi" +nome+ " sua idade expressa em dias é:" +totalDias+ " dias");
				
		

	}
}
