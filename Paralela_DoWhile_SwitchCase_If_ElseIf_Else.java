package exercicios;

import java.util.Scanner;

public class Paralela_DoWhile_SwitchCase_If_ElseIf_Else {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String nomeFuncionario = null;
		String acao;
		String atualizar;
		String dependente;
		int qtdDependente = 0;
		int qtdRet;
		int totDependente = 0;
		int opc;
		float salario = 0;
		float salarioFinal = 0;

		do {
			System.out.println("=====================================");
			System.out.println("=SISTEMA DE CONTROLE DE FUNCIONARIOS=");
			System.out.println("=====================================");
			System.out.println("\nEscolha um Opcao:");
			System.out.println("1 -> Cadastrar Funcionario");
			System.out.println("2 -> Editar Dados");
			System.out.println("3 -> Consultar Lista");
			System.out.print("Opcao: ");
			opc = in.nextInt();
			System.out.println("=====================================");

			switch (opc) {
			case 1:
				System.out.println("=====================================");
				System.out.println("=======CADASTRAR FUNCIONARIO=========");
				System.out.println("=====================================");

				if (nomeFuncionario != null) {
					System.out.println("O funcionario " + nomeFuncionario + " ja esta cadastrado.");
					System.out.print("Deseja atualizar os dados? [s/n]");
					atualizar = in.next();
					if (atualizar.equalsIgnoreCase("s")) {
						System.out.print("Informe o nome do funcionario: ");
						nomeFuncionario = in.next();
						System.out.print("Informe o salario: R$");
						salario = in.nextFloat();
						System.out.println("Possui dependentes? [s/n]");
						dependente = in.next();
						if (dependente.equals("s")) {
							System.out.print("Quantos dependetes " + nomeFuncionario + " possui? ");
							qtdDependente = in.nextInt();
							totDependente = totDependente + qtdDependente;
							if (totDependente == 1) {
								salarioFinal = salario + (salario * 0.02f);
							} else if (totDependente > 1 && totDependente <= 3) {
								salarioFinal = salario + (salario * 0.04f);
							} else if (totDependente > 3 && totDependente <= 5) {
								salarioFinal = salario + (salario * 0.06f);
							} else if (totDependente >= 6) {
								salarioFinal = salario + (salario * 0.08f);
							}
						}

					}
				} else {
					System.out.print("Informe o nome do funcionario: ");
					nomeFuncionario = in.next();
					System.out.print("Informe o salario: R$");
					salario = in.nextFloat();
					System.out.println("Possui dependentes? [s/n]");
					dependente = in.next();
					if (dependente.equals("s")) {
						System.out.print("Quantos dependetes " + nomeFuncionario + " possui? ");
						qtdDependente = in.nextInt();
						totDependente = totDependente + qtdDependente;
						if (totDependente == 1) {
							salarioFinal = salario + (salario * 0.02f);
						} else if (totDependente > 1 && totDependente <= 3) {
							salarioFinal = salario + (salario * 0.04f);
						} else if (totDependente > 3 && totDependente <= 5) {
							salarioFinal = salario + (salario * 0.06f);
						} else if (totDependente >= 6) {
							salarioFinal = salario + (salario * 0.08f);
						}
					}
				}

				break;

			case 2:
				System.out.println("=====================================");
				System.out.println("============EDITAR DADOS=============");
				System.out.println("=====================================");
				System.out.println("Temos ao total " + totDependente + " dependentes cadastrados, ao funcionario: " + nomeFuncionario);
				System.out.print("Deseja editar os dados deste funcionario? [s/n]");
				atualizar = in.next();
				if (atualizar.equals("s")) {
					System.out.println("Atualizar a quantia de dependentes? [s/n]");
					atualizar = in.next();
					if (atualizar.equals("s")) {
						
					}
				}
				
				qtdRet = in.nextInt();

				if (qtdRet > totDependente) {
					System.out.println("Quantidade superior ao total de estoque!");

				} else {
					totDependente = totDependente - qtdRet;
					salarioFinal = totDependente * salario;
					System.out.println("Produto retirado do estoque!");
				}
				if (totDependente == 0) {
					nomeFuncionario = null;
				}
				break;

			case 3:
				System.out.println("=====================================");
				System.out.println("====CONSULTAR PRODUTO EM ESTOQUE=====");
				System.out.println("=====================================");
				System.out.println("Modelo cadastro: " + nomeFuncionario);
				System.out.println("Total de maquinas em estoque: " + totDependente);
				System.out.println("Valor unitario das maquinas: R$" + salario);
				System.out.println("Valor total em estoque: R$" + salarioFinal);
				break;

			default:
				System.out.println("Opcao invalida!!!");
				break;
			}

			System.out.print("Deseja realizar outra acao? [s/n] ");
			acao = in.next();

		} while (acao.equalsIgnoreCase("s"));

	}

}
