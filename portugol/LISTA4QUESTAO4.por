programa
{
	/* Crie um programa que receba valores do usuário para preencher
	* uma matriz 3X3, e em seguida, exiba a soma dos valores dela 
	* e a soma dos valores da primeiradiagonal, ou seja, 
	* diagonal principal.
	 */
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro l=0, c=0
		inteiro somaDiagonal=0
		inteiro somaTotal=0

		para (l=0;l<3;l++){
			para(c=0;c<3;c++){
				escreva("Digite o valor da matriz: ")
				leia(matriz[l][c])
				somaTotal+=matriz[l][c]
				se(l==c){
				somaDiagonal+=matriz[l][c]
				}
			}
			
		}
		escreva(" A soma dos números da matriz é: " ,somaTotal)
		escreva(" A soma dos números da diagonal é: " ,somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */