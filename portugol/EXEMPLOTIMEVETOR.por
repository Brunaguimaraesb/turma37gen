programa
{
	
	funcao inicio()
	{
		cadeia times[3]
		inteiro pontuacao[3]
		cadeia time

		times[2]="NAUTICO"
		times[1]="SPORT"
		times[0]="SANTA CRUZ"

	
		para(inteiro y=0;y<3;y++){
			escreva(times[y]," digite os pontos: ")
			leia(pontuacao[y])
		}

		escreva("TABELA DE PE \n")
		para(inteiro y=0;y<3;y++){
			escreva(times[y], " - ",pontuacao[y], "\n")
		}
		escreva("Digite o nome do time que vocÊ quer ver os pontos: ")
		leia(time)
		para (inteiro y=0;y<3;y++){
			se(time ==times[y]){
				escreva("O time escolhido foi ",times[y], " pontos atuais ",pontuacao[y], "\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 549; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */