package app;

import java.util.Scanner;

import entities.Clientes;
import entities.Funcionario;

public class CadFuncionario {

	public static void main(String[] args) {

			Scanner leia = new Scanner (System.in);
			
			Funcionario func = new Funcionario ();
			
			func.setNome("JOÃO");
			func.setSalario(4000.00);
			func.setIdade(30);
			func.setGenero("MASCULINO");
			
			System.out.println(func.getNome());
			System.out.println(func.getSalario());
			System.out.println(func.getIdade());
			System.out.println(func.getGenero());

			System.out.println(func.toString());
	}

}
