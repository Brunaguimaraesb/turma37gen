package Lista1;

import java.util.Scanner;

public class Lista1Questao5 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Double nota1, nota2, nota3;
		double mediaPonderada=0.00;
		String nome; 
		
		System.out.print("Digite o nome: ");
		nome=leia.next();
		System.out.println("Digite a 1� nota: ");
		nota1= leia.nextDouble();
		System.out.println("Digite a 2� nota: ");
		nota2= leia.nextDouble();
		System.out.println("Digite a 3� nota: ");
		nota3= leia.nextDouble();
			
		mediaPonderada= (((nota1*2) +(nota2*3)+(nota3*5))/10.00);
		
		System.out.printf("%s tudo bem? A m�dia ponderada �:  %.2f" ,nome,mediaPonderada);
				
		
			
	}
}
