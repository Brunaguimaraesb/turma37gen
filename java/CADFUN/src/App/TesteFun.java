package App;

import Entities.Funcionario;
import Entities.Terceiro;


public class TesteFun {
	
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario ("001", "EPAMINONDAS");
		Terceiro terc1 = new Terceiro ("010","MARIA",80.00);
		
		func1.setHorasTrabalhadas(40);
		func1.setValorHora(10.00);
		
		terc1.setHorasTrabalhadas(40);
		terc1.setValorHora(10.00);
		
		System.out.println("Salario do funcionario "+func1.getNome()+" R$ " +func1.calculoSalario() +" ferias " +func1.calcularSalarioFerias());
		System.out.println("Salario do funcionario "+terc1.getNome()+" R$ " +terc1.calculoSalario()+" ferias " +func1.calcularSalarioFerias());
	}

}
