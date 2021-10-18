import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {

	//map n�o se estende a collection
	//tem proprios metodos para inserir e outras mais
	//chaves n�o podem ser duplicadas
	
	public static void main(String [] args) {
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		//chave,valor
		Aluno a = new Aluno("Jo�o da Silva","JAVA",6.8);
		Aluno b = new Aluno("Maria Souza","Linux",7.8);
		Aluno c = new Aluno("Renata Almeida","SO",8.8);
		Aluno d = new Aluno("Jos� Nascimento","Internet",5.5);
		
		mapa.put("Jo�o da Silva",a); //recebe chave e valor e recupera o objeto que 
		mapa.put("Maria Souza",b);
		mapa.put("Renata Almeida",c);
		mapa.put("Jos� Nascimento",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida"));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e: alunos) {
			System.out.println(e);
		}
	}
}
