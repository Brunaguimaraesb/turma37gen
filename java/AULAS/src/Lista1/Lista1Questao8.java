package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Questao8 {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica=0.00;
		double valorTotal=0.00;
		double imposto=0.00;
		double distribuidor=0.00;
		
		System.out.print("digite o custo de fabrica��o em reais: R$ ");
		custoFabrica=leia.nextDouble();
		
		imposto = (custoFabrica*0.28);
		distribuidor = (custoFabrica*0.45);
		
		valorTotal = (custoFabrica + imposto + distribuidor);
		
		System.out.printf("O valor do imposto �: R$ %.2f \n " ,imposto);
		System.out.printf("O valor do distribuidor �: R$ %.2f \n",distribuidor);
		System.out.printf("O valor que o cliente dever� pagar �: R$ %.2f " ,valorTotal);
		
		
	}
	

}
