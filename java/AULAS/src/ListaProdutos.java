import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {

	public static void main(String[] args) {
	
	String produto[] = {"CROPPED CHAVE", "VESTIDO VERBO", "VESTIDO FLORAL", "CAMISA REFORMA", "BERMUDA ALFAIA", "MACACAO CAMINHO", "MACACAO VARANDA", "MACACAO BRISA", "CAL�A FLOW", "SAIA V�RTICA"};

	
	List<String> ListaProdutos = new ArrayList();
	ListaProdutos.add("CROPPED CHAVE"); 	
	ListaProdutos.add("VESTIDO VERBO");
	ListaProdutos.add("VESTIDO FLORAL");
	ListaProdutos.add("CAMISA REFORMA");
	ListaProdutos.add("BERMUDA ALFAIA"); 	
	ListaProdutos.add("MACACAO CAMINHO");
	ListaProdutos.add("MACACAO VARANDA");
	ListaProdutos.add("MACACAO BRISA");
	ListaProdutos.add("CAL�A FLOW");
	ListaProdutos.add("SAIA V�RTICA");
	
	
	System.out.println("Lista de nomes: "+ListaProdutos);
	
	
	for(String Produtos : ListaProdutos) {
		System.out.println("Produto: "+Produtos);
	}
	}
}