package Ecommerce;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ecommerce {
		
		/* 
		 * PROJETO E-COMMERCE - LOJA DE ROUPAS PROGRAMADO POR: ÁLYSON CAMPOS,
		 * BRUNA GUIMARÃES, MATHEUS AMÂNCIO, RENAN UCHOA E SYLVIA MONTEIRO.
		 */
		
		static final double IMPOSTO=0.09;
		static 	String codigoProduto[] = {"G5-1", "G5-2", "G5-3", "G5-4", "G5-5", "G5-6", "G5-7", "G5-8", "G5-9", "G5-10"};
		static 	String produto[] = {"CROPPED CHAVE", "VESTIDO VERBO", "VESTIDO FLORAL", "CAMISA REFORMA", "BERMUDA ALFAIA", "MACACAO CAMINHO", "MACACAO VARANDA", "MACACAO BRISA", "CALÇA FLOW", "SAIA VÉRTICA"}; 
		static double valor[]= {112.00, 160.00, 150.00, 120.00, 180.00, 200.00, 190.00, 210.00, 119.00, 110.00};
		static int estoque[]= {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		static int codigo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		static int carrinho[] = new int [10];
		static int auxCodigo=0, quantidade=0, opPagamento=0;
		static char desejaComprar=' ', continua=' ', voltarSite=' ';
		static double valorTotal=0.00, valorFinal=0.00;
		
		static Scanner scan = new Scanner(System.in);
		
		static DecimalFormat df = new DecimalFormat("#.00");
		
		public static void main(String[] args) {
	
			//INÍCIO LOOP PROGRAMA
			do {
				//TELA INICIAL
				insereSlogan();
				System.out.println();
				System.out.println("\t\t>>> SEJA BEM VINDE À AVOÁ G5 <<<");
				System.out.println();
				//VALIDA ENTRADA
				do {
					System.out.print("\t\tDeseja fazer uma compra [S/N] ? :");
					desejaComprar = scan.next().toUpperCase().charAt(0);
				} while (desejaComprar != 'S' && desejaComprar != 'N');
				
				if (desejaComprar == 'N') {
					System.out.println("\n");
					System.out.println("\tPoxa, que pena!! Os nossos preços estão ótimos!!");
					System.out.println("\t\t\tMas te vejo em breve, tá?");
					System.out.println("\n");
					
				} else if (desejaComprar == 'S') {
					//INICIO LAÇO DA COMPRA
					do {
						//APRESENTAÇÃO TABELA PRODUTOS
						insereSlogan();
						System.out.print("COD\t\tPRODUTO\t\t\tVALOR\t\tQUANTIDADE\n");
						for(int x=0; x<10; x++){
							System.out.printf("%s\t\t%s\t\tR$ %.2f\t%d\n",codigoProduto[x],produto[x],valor[x],estoque[x]);
						}
						linha();
						//ESCOLHE PRODUTO
						System.out.print("\nSelecione o código do produto: G5-");
						auxCodigo = scan.nextInt();
						switch(auxCodigo) {
				            case 1:
				                adicionaCarrinho();
				                break;
				            case 2:
				                adicionaCarrinho();
				                break;
				            case 3:
				                adicionaCarrinho();
				                break;
				            case 4:
				                adicionaCarrinho();
				                break;
				            case 5:
				                adicionaCarrinho();
				                break;
				            case 6:
				                adicionaCarrinho();
				                break;
				            case 7:
				                adicionaCarrinho();
				                break;
				            case 8:
				                adicionaCarrinho();
				                break;
				            case 9:
				                adicionaCarrinho();
				                break;
				            case 10:
				                adicionaCarrinho();
				                break;
				            default:
				                System.out.print("Código inválido, tente novamente!!\n");
						}
						//PERGUNTA PARA PROSSEGUIR COM A COMPRA
						System.out.print("\nDeseja continuar a sua compra [S/N] ? : ");
						continua = scan.next().toUpperCase().charAt(0);
						while (continua != 'S' && continua != 'N') {
							System.out.println("Opção inválida, tente novamente...");
							System.out.print("\nDeseja continuar a sua compra [S/N] ? : ");
							continua = scan.next().toUpperCase().charAt(0);
						} 
					} while(continua == 'S');
					insereSlogan();
					pagamento();
				}
				//PERGUNTA PARA RETORNAR AO SITE
				System.out.print("\nDeseja voltar para o site [S/N] ? : ");
				voltarSite = scan.next().toUpperCase().charAt(0);
				while (voltarSite != 'S' && voltarSite != 'N') {
					System.out.println("Opção inválida, tente novamente...");
					System.out.print("\nDeseja voltar para o site [S/N] ? : ");
					voltarSite = scan.next().toUpperCase().charAt(0);
				} 
				//ZERA CARRINHO
				limpaCarrinho();
			} while(voltarSite == 'S');
			System.out.println("\nObrigado e volte sempre!\n");
			System.out.println("Fim do programa!");
		}
		
		public static void linha() {
			for(int i=0; i<66; i++) {
				System.out.print("─");
			}
		}
		
		public static void insereSlogan() {
			for(int i=0; i<66; i++) {
				System.out.print("─");
			}
			System.out.println();
			System.out.println("■■                          * AVOÁ G5 *                         ■■");
			System.out.println("■■■■■■■           ~ NORDESTINA, LEVE E AUTORAL ~           ■■■■■■■");
			for(int i=0; i<66; i++) {
				System.out.print("─");
			}
			System.out.println();
		}
		
		public static void adicionaCarrinho() {
			for (int x = 0; x<10; x++) {
				if (codigo[x] == auxCodigo) {
					System.out.print("\nDigite a quantidade desejada: ");
					quantidade = scan.nextInt();
					//VALIDAÇÕES DE QUANTIDADE DO PRODUTO SELECIONADO
					if (quantidade<0) {
						System.out.println("\nImpossível realizar, número negativo.");
					} else if (quantidade==0) {
						System.out.println("\nImpossível realizar, nenhuma quantidade escolhida.");
					} else if (quantidade>0 && quantidade>estoque[x]) {
						System.out.println("\nImpossível realizar, quantidade não disponível no estoque!");
					} else if (quantidade>0 && quantidade<=estoque[x]) {
						//ATUALIZA E EXIBE CARRINHO
						carrinho[x] = carrinho[x] + quantidade;
						estoque[x] = estoque[x] - quantidade;
						insereSlogan();
						carrinhoCompras();
					}
				}
			}
		}
		//CARRINHO DE COMPRAS
		public static void carrinhoCompras() {
			System.out.println("CARRINHO DE COMPRAS: ");
	        System.out.println("COD\t\tPRODUTO\t\t\tVALOR\t\tQUANTIDADE");
	        for(int x=0; x<10; x++) {
	        	if (carrinho[x] > 0) {
	        		System.out.print(codigoProduto[x]+"\t\t"+produto[x]+ "\t\tR$ "+valor[x]+"\t"+carrinho[x]+"\n");
	        	}
	        }
		}
		
		public static void pagamento() {
			//CÁLCULO DO CARRINHO FINAL
			for (int i=0; i<10; i++) {
				if (carrinho[i] > 0) {
					valorTotal = valorTotal + (valor[i] * carrinho[i]);
				}
			}
			if(valorTotal>0) {
				//OPÇÕES DE PAGAMENTO
				System.out.printf("\nSUBTOTAL: R$ %.2f",valorTotal);
				System.out.print("\n\nOPÇÕES DE PAGAMENTO: ");
				System.out.print("\n[1] À VISTA 10% OFF ");
				System.out.print("\n[2] 1x NO CARTÃO + 10% ");
				System.out.print("\n[3] 2x NO CARTÃO + 15%: ");
				System.out.print("\n\nDigite a opção desejada: ");
				opPagamento = scan.nextInt();
				while (opPagamento > 3 || opPagamento <= 0 ) {
					System.out.println("Opção inválida, tente novamente...");
					System.out.print("\nDigite a opção desejada: ");
					opPagamento = scan.nextInt();
				} 
				//OPÇÃO 1 - À VISTA
				if(opPagamento == 1) {
					notaFiscal();
					System.out.print("\n(+)SUBTOTAL: R$ "+ df.format(valorTotal));
					System.out.print("\n(-)DESCONTO (10%): R$ "+ df.format(valorTotal*0.10));
					valorFinal = valorTotal - valorTotal*0.10;
					System.out.print("\n(=)TOTAL A PAGAR: R$ "+ df.format(valorFinal));
					System.out.print("\n-------------------------------------------------------------------");
					System.out.print("\nVal. Aprox. dos Tributos (9%): R$ "+ df.format(valorTotal*IMPOSTO));
					System.out.print("\n-------------------------------------------------------------------");
				
				} 
				//OPÇÃO 2 - À VISTA CARTÃO
				else if (opPagamento == 2) {
					notaFiscal();
					System.out.print("\n(+)SUBTOTAL: R$ "+ df.format(valorTotal));
					System.out.print("\n(+)ACRÉSCIMO PGTO CARTÃO DE CRÉDITO (10%): R$ "+ df.format(valorTotal*0.10));
					valorFinal = valorTotal + valorTotal*0.10;
					System.out.print("\n(=)TOTAL A PAGAR: R$ "+ df.format(valorFinal));
					System.out.print("\n-------------------------------------------------------------------");
					System.out.print("\nVal. Aprox. dos Tributos (9%): R$ "+ df.format(valorTotal*IMPOSTO));
					System.out.print("\n-------------------------------------------------------------------\n");
				} 
				//OPÇÃO 3 - 2X NO CARTÃO
				else if (opPagamento == 3) {
					notaFiscal();
					System.out.print("\n(+)SUBTOTAL: R$ "+ df.format(valorTotal));
					System.out.print("\n(+)ACRÉSCIMO PGTO CARTÃO DE CRÉDITO (15%): R$ "+ df.format(valorTotal*0.15));
					valorFinal = valorTotal + valorTotal*0.15;
					System.out.print("\n(=)TOTAL A PAGAR: R$ "+ df.format(valorFinal));
					System.out.print("\n(/)VALOR PARCELA: 2x R$ "+ df.format(valorFinal/2));
					System.out.print("\n-------------------------------------------------------------------");
					System.out.print("\nVal. Aprox. dos Tributos (9%): R$ "+ df.format(valorTotal*IMPOSTO) );
					System.out.print("\n-------------------------------------------------------------------\n");	
				}
				
			} else {
				System.out.print("\nPoxa, você não realizou compras!\n");
				System.out.print("\nAté a próxima!\n");
			}
			
		}
		
		public static void notaFiscal() {
			insereSlogan();
			System.out.print("Nota Fiscal de Servicos Eletronica - NFS-e No.: ");
			System.out.print("\nRazao Social: AVOÁ STORE G5 LTDA");
			System.out.print("\nE-mail: faleconosco@avoa_g5.com");
			System.out.print("\nCNPJ: 123.456.789/0001-g5\n");
			linha();
			System.out.print("\nCOD\t\tPRODUTO\t\t\tVALOR\t\tQUANTIDADE\n");
			for(int x=0; x<10; x++) {
	        	if (carrinho[x] > 0) {
	        		System.out.print(codigoProduto[x]+"\t\t"+produto[x]+ "\t\tR$ "+valor[x]+"\t"+carrinho[x]+"\n");
	        	}
	        }
			linha();
		}
		//ZERA CARRINHO
		public static void limpaCarrinho() {
			for(int x=0; x<10; x++) {
				carrinho[x] = 0;
				valorTotal= 0.00;
				valorFinal= 0.00;
			}
		}
}