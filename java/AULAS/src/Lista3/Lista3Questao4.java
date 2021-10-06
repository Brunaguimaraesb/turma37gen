package Lista3;

import java.util.Scanner;

public class Lista3Questao4 {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int idade;
		char sexo; //(1-feminino/2-masculino/3-outros)
		char opcao; //(1-pessoa calma; 2-pessoa nervosa, 3-pessoa agressiva)
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNevorsasAcima40Anos=0;
		int pessoasCalmasMenos18Anos=0;
		char op ='S';
		int contadorHabitantes=1;
		//entradas
		while(op == 'S'&& contadorHabitantes<=150) {
			System.out.print("Habitante numero "+contadorHabitantes);
			System.out.print("\nDigite a idade: ");
			idade = leia.nextInt();
			System.out.print("Escolha\n1-feminino\n2-masculino\n3-outros: ");
			sexo = leia.next().charAt(0);
			System.out.print("Escolha\n1-pessoa calma\n2-pessoa nervosa\n3-pessoa agressiva");
			opcao = leia.next().charAt(0);
			System.out.print("Continua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			contadorHabitantes++;
			
			if(opcao =='1') {
				pessoasCalmas++;
			}
			if(opcao =='2' && sexo == '1') {
				mulheresNervosas++;
			}
			if(opcao =='3' && sexo == '2') {
				homensAgressivos++;
			}
			if (opcao == '1' && sexo == '3') {
				outrosCalmos++;
			}
			if(opcao =='2' && idade>40) {
				pessoasNevorsasAcima40Anos++;
			}
			if(opcao == '1' && idade<18) {
				pessoasCalmasMenos18Anos++;
			}
		}		
		
		//saidas
		System.out.print("\nHabitantes entrevistados: "+(contadorHabitantes-1));
		System.out.print("\nPessoas Calmas: " +pessoasCalmas);
		System.out.print("\nMulheres Nervosas: " +mulheresNervosas);
		System.out.print("\nHomens Agressivos: " +homensAgressivos);
		System.out.print("\nOutros Calmos: " +outrosCalmos);
		System.out.print("\nPessoas Nevorsas Acima 40 anos: " +pessoasNevorsasAcima40Anos);
		System.out.print("\nPessoas Calmas com menos de 18 anos: "+pessoasCalmasMenos18Anos);
	}

}
