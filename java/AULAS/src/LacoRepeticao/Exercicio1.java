package LacoRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);//padr�o americano
		Scanner leia = new Scanner(System.in); //leitura do teclado
		
		String codigoProduto[] = {"X01","X02","X03"}; //%s //declara��o dos valores dos vetores
		String nomeProduto[] = {"CAL�A","CAMISA","SAIA"}; //%s
		int estoque[]= {20,20,20}; //%d
		double valorProduto[]= {100.50,50.75,70.99}; //%f
		String auxCodigo;
		int teste = 0;
		int auxQtde = 0;
		
		//MOSTRANDO NA TELA
		System.out.println("LOJA DA TURMA 37");
		System.out.println();
		System.out.println("PRODUTO ESCOLHIDO");
		System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
		for(int x=0;x<nomeProduto.length;x++) { //x<4 vai retornar as informa��es
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
			//System.out.printf(codigoProduto[x]+"\t"+nomeProduto[x]"\t"+estoque[x]+"\t"+valorProduto[x]);
		}
		System.out.println();
		System.out.println("Digit o c�digo do produto que deseja comprar: ");
		auxCodigo = leia.next().toUpperCase(); //para receber minusculo e maiusculo
				
		System.out.println("PRODUTO ESCOLHIDO");
		System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
		for(int y=0;y<nomeProduto.length;y++) {
			if(codigoProduto[y].equals(auxCodigo)){ //codigoProduto[y]==auxCodigo
				System.out.printf("%s\t%s\t%d\t%.2f\n ",codigoProduto[y],nomeProduto[y],estoque[y],valorProduto[y]);
				teste=y; //vai colocar somente o que ele achou na v�riavel, salvar a informa��o de onde chegou
				break;
			}else {
				teste++; //procura at� o limite do vetor, se n�o achar acusa que n�o encontrou
			}
		}
		if(teste==codigoProduto.length) { //teste==3
			System.out.println("PRODUTO N�O ENCONTRADO!!");
		}else if(estoque[teste]==0) {
			System.out.println("Impossivel realizar, estoque vazio");
			
		}else {
			System.out.println("Quantos voc� deseja comprar: ");
			auxQtde = leia.nextInt();
			if(auxQtde <0) {
				System.out.println("Quantidade informada - numero negativo");
			}
			else if (estoque[teste]==0) { //verifica se tem o c�digo digitado
				System.out.println("Produto indisponivel...");
			}
			else if(auxQtde >estoque[teste]) { //verifica se tem quantidade
				System.out.println("Quantidade indisponivel");
			}
			else {
				System.out.println("Total a pagar de "+nomeProduto[teste]+"R$ " +(auxQtde*valorProduto[teste]));
				estoque[teste] -= auxQtde;
			}
		}
		System.out.println("P�s venda");
		System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
		for(int x=0;x<nomeProduto.length;x++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
		}
	}
	

}
