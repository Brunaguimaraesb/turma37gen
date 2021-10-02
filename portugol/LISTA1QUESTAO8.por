programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real custoFabrica=0.00,valorTotal=0.00,imposto=0.00, distribuidor=0.00
		
		escreva("digite o custo de fabricação em reais: ")
		leia(custoFabrica)
		
		imposto=(custoFabrica*0.28)
		distribuidor=(custoFabrica*0.45)
		
		valorTotal = (custoFabrica + imposto + distribuidor)
		valorTotal = Matematica.arredondar(valorTotal,2)
		
		escreva("\n O valor que o cliente deverá pagar é: R$ " ,valorTotal)
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */