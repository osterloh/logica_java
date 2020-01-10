package exercicios;

import java.util.Scanner;

public class Exer02_SwitchCase_DoWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String modMaq = null, acao, atualizar;
		int qtdMaq=0, qtdRet, totMaq=0, opc;
		float valorUni=0, valorTot=0;
		
		do {
			System.out.println("=====================================");
			System.out.println("===SISTEMA DE CONTROLE DE MAQUINAS===");
			System.out.println("=====================================");
			System.out.println("\nEscolha um Opcao:");
			System.out.println("1 -> Cadastrar Maquinas");
			System.out.println("2 -> Retirar produto de estoque");
			System.out.println("3 -> Consultar estoque");
			System.out.print("Opcao: ");
			opc = in.nextInt();
			System.out.println("=====================================");
			
			switch (opc) {
				case 1:
					System.out.println("=====================================");
					System.out.println("=========CADASTRAR MAQUINAS==========");
					System.out.println("=====================================");
					
					if (modMaq != null) {
						System.out.println("O modelo " + modMaq + " ja esta cadastrado.");
						System.out.print("Deseja atualizar este modelo? [s/n]");
						atualizar = in.next();
						if (atualizar.equalsIgnoreCase("s")) {
							System.out.print("Informe o modelo da maquina: ");
							modMaq = in.next();
							System.out.print("Informe o valor unitário da maquina: R$");
							valorUni = in.nextFloat();
							System.out.print("Quantas maquinas estao sendo cadastradas? ");
							qtdMaq = in.nextInt();
							totMaq = totMaq + qtdMaq;
							valorTot = valorUni * totMaq;
						}
					} else {
						System.out.print("Informe o modelo da maquina: ");
						modMaq = in.next();
						System.out.print("Informe o valor unitário da maquina: R$");
						valorUni = in.nextFloat();
						System.out.print("Quantas maquinas estao sendo cadastradas? ");
						qtdMaq = in.nextInt();
						totMaq = totMaq + qtdMaq;
						valorTot = valorUni*totMaq;
					}
					
				break;
				
				case 2:
					System.out.println("=====================================");
					System.out.println("=====RETIRAR PRODUTO DE ESTOQUE======");
					System.out.println("=====================================");
					System.out.println("Temos ao total " + totMaq + " cadastradas, do modelo: " + modMaq);
					System.out.print("Quantas maquinas deseja retirar? ");
					qtdRet = in.nextInt();
					
					if (qtdRet > totMaq) {
						System.out.println("Quantidade superior ao total de estoque!");
					
					} else {
						totMaq = totMaq - qtdRet;
						valorTot = totMaq * valorUni;
						System.out.println("Produto retirado do estoque!");
					}
					if (totMaq == 0) {
						modMaq = null;
					}
				break;
					
				case 3:
					System.out.println("=====================================");
					System.out.println("====CONSULTAR PRODUTO EM ESTOQUE=====");
					System.out.println("=====================================");
					System.out.println("Modelo cadastro: " + modMaq);
					System.out.println("Total de maquinas em estoque: " + totMaq);
					System.out.println("Valor unitario das maquinas: R$" + valorUni);
					System.out.println("Valor total em estoque: R$" + valorTot);
				break;
		
				default:
					System.out.println("Opcao invalida!!!");
				break;
			}
			
			System.out.print("Deseja realizar outra acao? [s/n] ");
			acao = in.next();
			
		}while(acao.equalsIgnoreCase("s"));

	}

}
