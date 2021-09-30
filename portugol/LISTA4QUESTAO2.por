programa
{
	/*
	*Um dado é lançado 10 vezes e o valor correspondente é anotado.
	* Faça um programa que gere um vetor com os lançamentos,escreva
	* esse vetor. A seguir determine e imprima a média aritmética 
	* dos lançamentos,contabilize e apresente também quantas
	* foram as ocorrências da maior pontuação.
	 */
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro valor[10], x
		inteiro maiorPontuacao=0, contador=0, soma=0
		real media=0.00

		para(x=0;x<10;x++){
			valor[x]=Util.sorteia(1,6)
			soma+=valor[x]
			se(valor[x]>maiorPontuacao){
				maiorPontuacao=valor[x]
			}
		}
			
		para(x=0;x<10;x++){
			escreva("Valor " ,(x+1), ": " ,valor[x], "\n")
			se(valor[x]==maiorPontuacao){
			contador++
			}
			
		}
		media= (soma/10.00)
		
		escreva("A média aritmética das jogadas é " ,media, "\n")
		escreva("A maior pontuacao é: " ,maiorPontuacao, " e se repete: " ,contador)
		
			
				
				
	}		
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 748; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */