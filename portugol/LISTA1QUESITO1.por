programa
{
	
	funcao inicio()
	{
		cadeia nome
		real anos, meses, dias, totalDias
		
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite sua idade em anos: ")
		leia(anos)
		escreva("Digite o complemento da sua idade em meses: ")
		leia(meses)
		escreva("Digite o complemento da sua idade em dias: ")
		leia(dias)

		totalDias = (anos*365) + (meses*30) + dias

		escreva("Oi " , nome , " sua idade expressa em dias é " , totalDias , " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 87; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */