programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Digite o indice de poluição atual: ")
		leia(indicePoluicao)

		se(indicePoluicao<=0.29){
			escreva("Indice aceitável!!")

		}
		senao se (indicePoluicao<=0.4){
			escreva("Grupo 1 - SUSPENDAM SUAS ATIVIDADES!!!")
		}
		senao se (indicePoluicao<0.5){
			escreva("Grupo 1 - GRUPO 2 - SUSPENDAM SUAS ATIVIDADES!!!")
		}
		senao {
			escreva("Grupo 1 - GRUPO 2 - GRUPO 3 - SUSPENDAM SUAS ATIVIDADES!!!")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */