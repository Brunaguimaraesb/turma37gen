package app;

import java.util.Scanner;

import entities.Clientes;

public class CadFuncionario {

	public static void main(String[] args) {

			Scanner leia = new Scanner (System.in);
			
			Funcionario func1 = new Funcionario ();
			
			System.out.println("Digite o nome do cliente: ");
			func1.nome = leia.next();
			System.out.println("Digite o ano de nascimento: ");
			func1.anosNascimento = leia.nextInt();
			
			System.out.println("Digite 1-masculino, 2- feminino, 3 neutre: ");
			char op = leia.next().charAt(0);
			
			if ( op == '1') {
				func1.genero = "MASCULINO";
			}
			else if (op == '2') {
				func1.genero = "FEMININO";
							
			}
			else if (op == '3') {
				func1.genero ="NEUTRE";
				
			}
			
			
	}

}
