programa
{
	
	funcao inicio()
	{
		const real valorHoraNormal = 10.00
		const real valorHoraExtra = 20.00
		const inteiro horasNormais = 50.00
		
		cadeia nome, codigo
		inteiro horasTrabalhadas=0,horasExtras=0
		real salario=0.00, salarioTotal=0.00, salarioExcedente=0.00
		
		escreva("Digite o nome do funcionário: ")
		leia(nome)
		escreva("Digite o código do funcionário: ")
		leia(codigo)
		escreva("Digite o número de horas trabalhadas: ")
		leia(horasTrabalhadas)

		
		se(horasTrabalhadas>horasNormais){
			horasExtras = (horasTrabalhadas - horasNormais)
			salario = (horasTrabalhadas * valorHoraNormal)
			salarioExcedente= (horasExtras * valorHoraExtra)
			salarioTotal= (salario + salarioExcedente)
			escreva("O salário é R$ " ,salario)
			escreva("O salário excedente é R$ " , salarioExcedente)
			escreva("O salário total é R$ ", salarioTotal)
		}
		senao {
			salario = (horasTrabalhadas * valorHoraNormal)
			salarioTotal = (salario + salarioExcedente)
			escreva("O salário é R$ " ,salario)
			escreva("O salário excedente é R$ " , salarioExcedente)
			escreva("O salário total é R$ ", salarioTotal)
		}
		
		
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 858; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */