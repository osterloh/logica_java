package exercicios;

import java.util.Scanner;

public class Exer03_DoWhile_If_ElseIf_Else {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float nota, media, maior=0, menor=10, soma=0;
		int qtd=0;
		String opc, situacao, nome;
		
		System.out.println("------------------------------");
		System.out.println("--------CONTROLE DO RH--------");
		System.out.println("------------------------------");
		System.out.print("Informe o nome do colaborador: ");
		nome = in.next();
		
		do {
			System.out.print("Informe a nota: ");
			nota = in.nextFloat();
			
			if (nota >= maior) {
				maior = nota;
			}
			
			if (nota <= menor) {
				menor = nota;
			}
			
			qtd++;
			soma = soma + nota;
			media = soma/qtd;
			
			if (media >= 7) {
				situacao = "Colaborador aprovado";
			
			} else if (media >= 4 && media < 7) {
				situacao = "Possível advertencia";
				
			} else {
				situacao = "Corre risco de demissao";
			}
			
			System.out.print("Deseja informar mais uma nota? [s/n]");
			opc = in.next();
			
		} while (opc.equalsIgnoreCase("s"));
		
		System.out.println("------------------------------");
		System.out.println("---RELATORIO DO COLABORADOR---");
		System.out.println("------------------------------");
		System.out.println("Caro(a) " + nome + ", segue relatorio de analise:");
		System.out.println("Sua maior nota foi: " + maior);
		System.out.println("Sua menor nota foi: " + menor);
		System.out.println("Ao todo, foram lancadas " + qtd + " notas");
		System.out.println("Sua media foi: " + media);
		System.out.println("Sua situacao eh: " + situacao);

	}

}
