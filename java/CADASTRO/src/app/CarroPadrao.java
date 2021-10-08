package app;

import java.util.Scanner;

import entities.Carro;

public class CarroPadrao {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Carro carro1 = new Carro("PLX","CELTA","KLP2347");
		Carro carro2 = new Carro();
		String auxPlaca;
		String auxModelo;
		
		System.out.println("Digite a placa do carro 2:");
		auxPlaca=leia.next();
		carro2.setPlaca(auxPlaca);
		System.out.println("Digite o modelo do carro 2");
		auxModelo=leia.next();
		carro2.setModelo(auxModelo);;
		
		carro1.setPlaca("PPR-0234");
		
		carro1.ligarCarro();
		carro1.andarCarro();
		System.out.println("MArcha: "+carro1.getMarcha()+" Velocidade "+carro1.getVelocidade());
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println("MArcha: "+carro1.getMarcha()+" Velocidade "+carro1.getVelocidade());
		carro1.subirMarcha();
		for (int x=1;x<10;x++) {
			
			carro1.acelerar();
			
		}
		System.out.println("MArcha: "+carro1.getMarcha()+" Velocidade "+carro1.getVelocidade());
		
		System.out.println(carro1.getModelo()+" "+carro1.getPlaca());
		System.out.println(carro2.getModelo()+" "+carro2.getPlaca());
	}
}