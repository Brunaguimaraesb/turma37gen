programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, totalSegundos = 0

		escreva("Digite o tempo de duração do evento da fábrica em segundos: ")
		leia(totalSegundos)
		
		horas = (totalSegundos/3600)
		minutos = ((totalSegundos - (horas*3600))/60)
		segundos = (totalSegundos%60)

		escreva(" O tempo de duração do evento da fábrica é de " , horas , " horas " , minutos , " minutos " , segundos , " segundos ") 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */