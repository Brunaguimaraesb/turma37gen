package app;

import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Preguica preguica = new Preguica("Josefina",10);
		Cachorro cachorro = new Cachorro("Mike",2);
		Cavalo cavalo = new Cavalo("Charuto", 5);
		
		System.out.println("Digite o som do cachorro: ");
		String som = leia.next();
		System.out.println("Digite o som do cavalo: ");
		String som1 = leia.next();
		System.out.println("Digite o som da preguiça: ");
		String som2 = leia.next();
		
		System.out.println();
		System.out.println("CACHORRO");
		System.out.println("NOME: "+cachorro.getNome()+ "\nIDADE: " +cachorro.getIdade());
		cachorro.correr();
		cachorro.emitirSom("SOM: "+som);

		System.out.println();
		System.out.println("CAVALO");
		System.out.println("NOME: "+cavalo.getNome()+ "\nIDADE: " +cavalo.getIdade());
		cavalo.correr();
		cavalo.emitirSom("SOM: "+som1);

		System.out.println();
		System.out.println("PREGUIÇA");
		System.out.println("NOME: "+preguica.getNome()+ "\nIDADE: " +preguica.getIdade());
		preguica.subir();
		preguica.emitirSom("SOM: "+som2);

	}

}
