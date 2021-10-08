package app;

import entities.Coordenador;
import entities.Funcionario1;
import entities.PessoaA;

public class TestePessoa {
	
	public static void main(String [] args) {
	
		PessoaA jessica = new PessoaA ("Jessica", 555);
		Funcionario1 pedro = new Funcionario1 ("Pedro", 222, "TI");
		PessoaA maria = new Funcionario1("Maria",333,"Informatica --Desenvolvimento");
		PessoaA jose = new Coordenador("Jose",444,"CC");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
		
	}


}
