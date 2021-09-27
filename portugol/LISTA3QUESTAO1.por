programa
{
	
	funcao inicio()
	{
		const real habitantes=20.00
		
		inteiro salario=0, numeroFilhos=0
		inteiro totalFilhos=0
		real mediaSalario=0.00,mediaFilhos=0.00, percentual=0.00
		real maiorSalario=0.00
		real totalSalario=0.00
		real quantidadePessoas=0.00
		
		para (inteiro x=1;x<=habitantes;x++){
			escreva("Digite o seu salário: ")
			leia(salario)
			totalSalario =(totalSalario+salario)
			escreva("Digite a quantidade de filhos que você tem: ")
			leia(numeroFilhos)
			totalFilhos= totalFilhos + numeroFilhos
			se(salario >maiorSalario){
				maiorSalario = salario
			
			}
			se(salario <100) {
				quantidadePessoas=quantidadePessoas +1
			}

		}
		mediaSalario = (totalSalario/habitantes)
		mediaFilhos = (totalFilhos/habitantes)
		percentual = (quantidadePessoas/habitantes)*100.00

		escreva("A média de sálario é: ",mediaSalario, "R$")
		escreva("\nA média de filhos é: " ,mediaFilhos)
		escreva("\nO maior salário é: " ,maiorSalario, "R$")
		escreva("\nPercentagem de pessoas com salário abaixo de 100 é: " ,percentual,  "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */