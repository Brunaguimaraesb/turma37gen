programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro nota=0
		inteiro totalNotas=0
		real media=0.0
		inteiro maiorNota=0
		inteiro menorNota=10
		inteiro contadorMenorNota=0
		
		//contador
		//totallizador
		//comparação - inversão

		escreva("Digite o nome: ")
		leia (nome)
		
		para (inteiro x=1;x<=4;x++){
			escreva("Digite a nota:" ,x, ": ")
			leia(nota)
			totalNotas= totalNotas + nota
			se(nota>maiorNota){
				maiorNota = nota
			}
			se(nota<=menorNota){
				
				se(nota==menorNota){
					contadorMenorNota++
				}
				senao se(nota<menorNota){
					contadorMenorNota=1
				}
				menorNota = nota
				
			}

		}
		media = totalNotas/4.00

		escreva("Oi " ,nome, " sua média de notas foi: " ,media)
		escreva("\nSua maior nota foi " ,maiorNota)
		escreva("\nSua menor nota foi " ,menorNota)
		escreva("\nMenor nota aparece " ,contadorMenorNota,  "vezes")
		escreva("\nfim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 589; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */