programa
{
	
	funcao inicio()
	{
		inteiro valorDigitado=0
		real media=0.00
		real total=0.00
		inteiro totalValoresDigitados=0

		enquanto(valorDigitado>=0){
			escreva("Digite um numero positivo ou então um número negativo para parar: ")
			leia(valorDigitado)
			se(valorDigitado>=0){
				//total+=valorDigitado
				total = total + valorDigitado
				totalValoresDigitados++
			}
		}
	
		media = total/totalValoresDigitados

		escreva("\nQuantidade de valores digitados: " ,totalValoresDigitados)
		escreva ("\nSomatorio de valores digitados: " ,total)
		escreva("\nMedia de valores digitados: " ,media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 137; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */