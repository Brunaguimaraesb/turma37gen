import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {

		Collection<String> nomes = new ArrayList();
		nomes.add("Mario"); //adiciona itens para a lista	
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");
		
		
		for(String name : nomes) {
			System.out.println("Lista de nomes: "+name);
		}
		
		
		//Collection<String> nomes2 = Arrays.asList("João","Joana");		//addAll vai permitir que acione elementos de outra lista na lista
		//nomes.addAll(nomes2);
		//System.out.println("Lista de nomes: "+nomes);
		
		//System.out.println("Contém o nome Maria? "+nomes.contains("Maria"));	//verifica se contem na lista
		//System.out.println("Lista de nomes: "+nomes);	

		//addAll vai permitir que acione elementos de outra lista na lista
		/*System.out.println("Lista de nomes: "+nomes);	
		nomes.clear(); //limpa a lista
		System.out.println("Lista de nomes: "+nomes);	*/

		/*System.out.println("Lista de nomes: "+nomes);	
		
		nomes.remove("Mario");//remover um valor dentro do list
		System.out.println("Lista de nomes: "+nomes);	*/

		/*if(nomes.isEmpty()) {//vai verificar se os dados dentro de um liste estão vazios e vai dar como retorno um valor boleano true ou false
		 System.out.println("Lista vazia...");
		}else {
			System.out.println("Lista de nomes: "+nomes);

		}*/
	

	}
	
}
