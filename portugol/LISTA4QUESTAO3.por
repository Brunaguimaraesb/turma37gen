programa
{
	/*
	*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	*Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	*Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	 */
	
	funcao inicio()
	{
		inteiro matrizA[4][6]
		inteiro matrizB[4][6]
		inteiro matrizC[4][6]
		inteiro matrizD[4][6]
		inteiro l=0,c=0

		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				escreva("Digite o valor referente a linha ",l," coluna ",c," da matrizA: ")
				leia(matrizA[l][c])

			}
		}	
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				escreva("Digite o valor referente a linha ",l,"  e coluna ",c," da matrizB: ")
				leia(matrizB[l][c])

			}
		}
		para(l=0;l<4;l++){
			para(c=0; c<6; c++){
				matrizC[l][c]=matrizA[l][c]+matrizB[l][c]
								
			}
		}
		para(l=0;l<4;l++){
			para(c=0; c<6; c++){
				matrizD[l][c]=matrizA[l][c]-matrizB[l][c]
				
			}
		}		
		escreva("MatrizA\n")
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				escreva("MatrizA linha " ,l, " e coluna ",c, ": ", matrizA[l][c], "\n ")
			}
		}	
		escreva("MatrizB\n")
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				escreva("MatrizB linha ", l, " e coluna " ,c, ": ",matrizB[l][c], "\n")
			}
		}
		escreva("MatrizC\n")
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				escreva("MatrizC linha " ,l, " e coluna " ,c, ": " ,matrizC[l][c], "\n ")
			}
		}
			escreva("MatrizD\n")
		para(l=0;l<4;l++){
			para(c=0;c<6;c++){
				escreva("MatrizD linha" ,l, " e coluna " ,c, ": " ,matrizD[l][c], " \n")
			}
		}
		escreva("\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */