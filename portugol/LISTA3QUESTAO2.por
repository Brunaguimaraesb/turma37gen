programa
{
	
	funcao inicio()
	{
		inteiro somaNumerosImpares=0
		inteiro contador=0
				

		para (contador=1;contador<=500;contador++){
			se((contador%2==1) e (contador%3==0)){
				somaNumerosImpares+=contador
			}
			
		}
		escreva("A soma dos números impares é: ",somaNumerosImpares)
	}
	
		
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */