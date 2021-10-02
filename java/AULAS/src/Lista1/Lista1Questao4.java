package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Lista1Questao4 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double a=0.00,b=0.00,c=0.00;
		double d=0.00,E=0.00,f=0.00;
		double x=0.00,y=0.00;
		
		System.out.print("Digite o valor do coeficiente a: ");
		a=leia.nextDouble();
		System.out.print("Digite o valor do coeficiente b: ");
		b=leia.nextDouble();
		System.out.print("Digite o valor do coeficiente c: ");
		c=leia.nextDouble();
		System.out.print("Digite o valor do coeficiente d: ");
		d=leia.nextDouble();
		System.out.print("Digite o valor do coeficiente e: ");
		E=leia.nextDouble();
		System.out.print("Digite o valor do coeficiente f: ");
		f=leia.nextDouble();
		
		x=((c*E)-(b*f))/((a*E)-(b*d));
		y=((a*f)-(c*d))/((a*E)-(b*d));
		
		System.out.printf("O valor de x é: %.2f ",x);
		System.out.printf("O valor de y é: %.2f ",y);

		
			
	}
}
