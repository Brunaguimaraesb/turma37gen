package app;

import java.util.Scanner;

import entities.Pessoa;
import entities.Produto;

public class CadProduto {

	public static void main(String[] args) {

		Produto prod1 = new Produto();
		Pessoa cad1 = new Pessoa();
		Scanner leia = new Scanner(System.in);
		
		int quantidade =0;
		
		System.out.println("Cadastro de Produtos");
		System.out.print("Digite seu nome: ");
		cad1.nome = leia.next();
		System.out.print("Digite 1-masculino, 2- feminino, 3 neutre: ");
		char op = leia.next().charAt(0);
		if (op == '1') {
			cad1.pronome = 'o';
		} else if (op == '2') {
			cad1.pronome = 'a';
		} else {
			cad1.pronome = 'e';
		}
	     System.out.print("Digite o código que você deseja: ");
	        prod1.codigo = leia.next();
	        System.out.print("1 - colocar no estoque ou tirar\n2- tirar do estoque \nEscolha 1 ou 2: ");
	        op = leia.next().charAt(0);
	        if (op == '1') {
	            System.out.print("Digite quantidade que você deseja colocar: ");
	            quantidade = leia.nextInt();
	            prod1.colocarEstoque(quantidade);
	        } else {
	            System.out.print("Digite quantidade que você deseja tirar: ");
	            quantidade = leia.nextInt();
	            prod1.tirarEstoque(quantidade);
	        }
	        System.out.println(prod1.toString());
	        System.out.println(cad1.toString());

}
	
}