package Lista1;
import java.util.Locale;
import java.util.Scanner;

public class Lista1Questao6 {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US); //PADRONIZAR EM EUA
		Scanner leia = new Scanner (System.in);
		//variaveis
		double d;
		double x2,x1,y1,y2;
		String nome; 
		
		System.out.print("Digite o nome: ");
		nome=leia.next();
		System.out.print("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		d=Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
		d= Math.sqrt(d);
		
		//processamentos
		
		//saidas
		System.out.printf("%s tudo bem? O valor de d é %.2f",nome,d);
		
	}

}
