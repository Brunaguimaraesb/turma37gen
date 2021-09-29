programa
{
	/*
	*Faça um programa que crie um vetor por leitura com 5 valores
	* de pontuação de uma atividade e o escreva em seguida. 
	*Encontre após a maior pontuação e a apresente.
	*/
	
	funcao inicio()
	{
		real pontuacao[5]
		inteiro x=0
		real maiorPontuacao=0.00

		para (x=0;x<5;x++){
			escreva("Digite um valor: ")
			leia(pontuacao[x])
		}
		para(x=0;x<5;x++){
			escreva("Número " ,(x+1), ": " ,pontuacao[x], "\n")
			se(pontuacao[x]>maiorPontuacao){
				maiorPontuacao=pontuacao[x]
				
			}
		}
		escreva("A maior pontuacao é: " ,maiorPontuacao)
		
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */