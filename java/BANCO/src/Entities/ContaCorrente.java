package Entities;

import java.util.Scanner;

public class ContaCorrente extends Conta {
    Scanner entrada = new Scanner(System.in);
    private int contadorTalao = 3;

   

    public ContaCorrente(int numero, String cpf,  int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}



	public void pediTalao(int contadorTalao, double saldo) {
        int resposta = 0;
        int numcheque = 0;
        System.out.println("Deseja solicitar cheque 1- sim / 2- n�o?");
        resposta = entrada.nextInt();
        if (resposta == 1) {
            System.out.println("Disponibilizamos um limite de tr�s cheques. Quantos voc� deseja? ");
            numcheque = entrada.nextInt();
        if (numcheque > contadorTalao) {
                System.out.println("Valor invalido");
            }

        }
        if (resposta == 2) {
            System.out.println("Obrigado por usar o banco ladr�o");

        }

        this.getSaldo(saldo - numcheque * 30);
        contadorTalao = contadorTalao - numcheque;
        System.out.println("Voc� ainda tem " +numcheque+" cheques disponiveis. ");
    }

}
