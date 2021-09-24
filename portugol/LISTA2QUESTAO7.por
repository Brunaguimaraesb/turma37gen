programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real base, altura, area

		escreva("Digite o valor da base do triângulo: ")
		leia(base)
		escreva("Digite o valor da altura do triângulo: ")
		leia(altura)
	
		se(altura<=0 ou base<=0) {
			
			escreva("\nO valor da altura e da base precisam ser positivos")
		}
		
		senao se(altura>0 e base>0){
			area = Matematica.arredondar(((base*altura)/2),2)
			escreva("\nA área do triângulo é: ", area)
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */