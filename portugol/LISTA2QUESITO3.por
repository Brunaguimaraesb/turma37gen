programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real numero1, numero2, numero3, numero4,q1, q2, q3, q4
		escreva("Digite o primeiro valor: ")
		leia(numero1)
		escreva("Digite segundo valor: ")
		leia(numero2)
		escreva("Digite o terceiro valor: ")
		leia(numero3)
		escreva("Digite o quarto valor: ")
		leia(numero4)

		q1 = Matematica.potencia(numero1,2)
		q2 = Matematica.potencia(numero2,2)
		q3 = Matematica.potencia(numero3,2)
		q4 = Matematica.potencia(numero4,2)

		se(numero3>=1000){
			escreva("O valor do quadrado de " ,numero3, " é ",q3)
			
		}
		senao {
			escreva("\n O valor do quadrado de " ,numero1, " é igual a: " ,q1)
			escreva("\n O valor do quadrado de " ,numero2, " é igual a: " ,q2)
			escreva("\n O valor do quadrado de " ,numero3, " é igual a: " ,q3)
			escreva("\n O valor do quadrado de " ,numero4, " é igual a: " ,q4)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 559; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */