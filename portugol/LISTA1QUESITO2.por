programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anos, meses, dias, totalDias

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite quantos dias de vida você possui: ")
		leia(totalDias)

		anos = (totalDias/365)
		meses = ((totalDias%365)/30)
		dias = ((totalDias%365)/30)

		escreva("Oi" +nome+ " sua idade é " , anos, " anos, " , meses, " meses e " , dias , " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 56; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */