programa
{
	
	funcao inicio()
	{
		inteiro pesoTomate, excesso, multa

		escreva("Digite o peso dos tomates em KG: ")
		leia(pesoTomate)

		excesso= pesoTomate - 50
		multa=(excesso*4)
		
		se (pesoTomate<0){
			escreva("Peso inválido, digite um valor maior do que zero.")
		}
		senao se(excesso==0){

			escreva("Não houve peso excedente ")
		}
		senao se(excesso>0){
			escreva("O peso do tomate ultrapassa 50KG, o peso excedente é de " ,excesso, " KG e o valor da multa é de " ,multa, " reais ") 
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */