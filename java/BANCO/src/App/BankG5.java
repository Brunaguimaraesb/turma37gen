package App;

import Entities.ContaPoupanca;

public class BankG5 {
	
	public static void main(String[] args) {
		
		ContaPoupanca cp1 = new ContaPoupanca (1, "111.111.111-11",1);
		
		System.out.println(cp1.getSaldo());
		cp1.credito(100.00);
		System.out.println(cp1.getSaldo());
		cp1.correcao(1);
		System.out.println(cp1.getSaldo());
		cp1.debito(100.06);
		System.out.println(cp1.getSaldo());
		cp1.debito(50.05);
		System.out.println(cp1.getSaldo());
	}

}
