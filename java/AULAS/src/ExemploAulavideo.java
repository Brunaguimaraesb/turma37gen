import java.util.Scanner;

public class ExemploAulavideo {
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);
		
		int a,b,soma;
		
		System.out.println("Entre com o valor de A:");
		a= leia.nextInt();
		System.out.println("Entre com o valor de B:");
		b= leia.nextInt();
		soma = a+b;
		System.out.println("A soma foi de: " +soma);
		
	}
}
