package app;

import java.util.Scanner;

import entities.Clientes;

public class CadCliente {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Clientes clien1 = new Clientes ();
		
		System.out.println("Digite o nome do cliente: ");
		clien1.nome = leia.next();
		System.out.println("Digite o ano de nascimento: ");
		clien1.anosNascimento = leia.nextInt();
		System.out.println("Digite o e-mail: ");
		clien1.email = leia.next();
		System.out.println("Digite 1-masculino, 2- feminino, 3 neutre: ");
		char op = leia.next().charAt(0);
		
		if ( op == '1') {
			clien1.genero = "MASCULINO";
		}
		else if (op == '2') {
			clien1.genero = "FEMININO";
						
		}
		else if (op == '3') {
			clien1.genero ="NEUTRE";
			
		}
		
		System.out.println("Digite o pagamento será: 1-a vista 2- debito 3- credito");
		char op1 = leia.next().charAt(0);
			
		if(op1  == '1') {
			clien1.opcaoCompras = "A VISTA";
		}else if(op  == '2') {
			clien1.opcaoCompras  = "DEBITO";
		}else {
			clien1.opcaoCompras  = "CREDITO";
		}
	   
	    System.out.printf("Bom dia a idade aproximada é %d anos.\n",clien1.calcularIdade(2021));

        System.out.println(clien1.toString());
		
	}


}
