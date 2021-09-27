programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		
		real a=0.00,b=0.00,c=0.00,d=0.00,E=0.00,f=0.00,x=0.00,y=0.00
			
		escreva("Digite o valor do coeficiente a: ")
		leia(a)
		escreva("Digite o valor do coeficiente b: ")
		leia(b)
		escreva("Digite o valor do coeficiente c: ")
		leia(c)
		escreva("Digite o valor do coeficiente d: ")
		leia(d)
		escreva("Digite o valor do coeficiente e: ")
		leia(E)
		escreva("Digite o valor do coeficiente f: ")
		leia(f)

		x=(((c*E)-(b*f))/((a*E)-(b*d)))
		x=Matematica.arredondar(x,2)
		y=(((a*f)-(c*d))/((a*E)-(b*d)))
		y=Matematica.arredondar(y,2)
		
		escreva("O valor de x é: " ,x)
		escreva("O valor de y é: " ,y)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 688; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */