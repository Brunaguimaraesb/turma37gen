package app;

import java.util.Scanner;

import entities.Conta;

public class CadConta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero, opConta, opMovimentacao;
		String cpf;
		double saque, deposito;
		boolean ativo;
		
		
		
		System.out.println("Digite o número da conta: ");
		numero = leia.nextInt();
		
		leia.nextLine();
		System.out.println("Digite o seu CPF: ");
		cpf = leia.nextLine();
		System.out.println("A conta está: 1-ativada/2- desativada: ");
		opConta = leia.nextInt();
		
		while(true) {
			if(opConta == 1 || opConta ==2) {
				break;
			}else {
				System.out.println("escolha uma opção  1-ativada/2- desativada: ");
				opConta = leia.nextInt();

			}
		}
		
		if(opConta == 1) {
			ativo = true;
			
		}else {
			ativo = false;
		}
		
		Conta conta = new Conta (numero, cpf, ativo);

		System.out.println("Você tem " +conta.getSaldo());
		System.out.println("Você pretende: 1- sacar/ 2-depositar ");
		opMovimentacao = leia.nextInt();
		
		while(true) {
			if(opMovimentacao == 1 || opMovimentacao ==2) {
				break;
			}else {
				System.out.println("escolha uma opção  1- sacar/ 2-depositar ");
				opMovimentacao = leia.nextInt();

			}
		}
		if(opMovimentacao == 1) {
			System.out.println("Quanto você deseja sacar: ");
			saque = leia.nextDouble();
			
			conta.sacar(saque);
			
			System.out.println("Novo saldo é: "+conta.sacar(saque));
			
		}else {
			System.out.println("Quanto você deseja depositar: ");
			deposito = leia.nextDouble();
			
			System.out.println("Novo saldo é: " +conta.deposito(deposito));
		}
		
		System.out.println(conta.toString());
	}

}
