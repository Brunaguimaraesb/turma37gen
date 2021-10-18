package App;

import java.util.Scanner;

import Entities.ContaPoupanca;

public class TesteErro {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opc;
		String movimentos[] = new String[10];
		
		System.out.println("Digite o tipo de conta a ser trabalhado");
		System.out.println("1-Conta poupança\2-Conta corrente\n3-Conta Especial\n4-Conta empresa\n5-Conta estudantil\n6-Sair");
		opc=leia.nextInt();
		do {
		if(opc == 1) {
			System.out.println("Fazendo conta poupança...");
			ContaPoupanca cp1 = new ContaPoupanca(1, "111",10);
			for
		}else if (opc == 2 ) {
		System.out.println("Conta corrente...");	
		}
		}while(opc != 6);
		
		System.out.println();
	}
		

}
