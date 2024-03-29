programa
{
/*
 * Observe a seguinte sequência lógica:
 * 89,119,96,127,103,135,110,143,117, ...
 * 89 + 30 = 119[0]
 * 119 - 23 = 96 [0]
 * 96 + 30 = 126 [+1]= 127
 * 127 - 23 = 104[-1] = 103
 * 103 + 30 = 133 [+2] = 135
 * 135 - 23 = 112 [-2] = 110
 * 
 * A partir da relação acima, qual é o número de elementos dessa sequência que estão entre 1000 e 1500?
 *  */
 
    funcao inicio()
    {

        inteiro elemento=89, cont=0, incremento=30, decremento=23

        escreva(elemento,"..\n")
        elemento = elemento + incremento
        escreva(elemento," Incremento\n")
        elemento = elemento - decremento
        escreva(elemento," Decremento\n")
        enquanto (elemento<=1500){
            incremento = incremento + 1 
            elemento = elemento + incremento
            escreva(elemento," Incremento\n")
            se (elemento>=1000 e elemento<=1500){
                cont = cont+1
            }
            decremento = decremento + 1 
            elemento = elemento - decremento
             escreva(elemento," Decremento\n")
            se (elemento>=1000 e elemento<=1500){
                cont = cont+1
            }
        }
        escreva("\nO número de elementos da sequência que estão entre 1000 e 1500 é: ",cont)
        escreva("\nPrograma finalizado!!")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */