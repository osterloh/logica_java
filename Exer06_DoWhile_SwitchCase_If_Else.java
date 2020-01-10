package exercicios;

import java.util.Scanner;

public class Exer06_DoWhile_SwitchCase_If_Else {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float valor;
		int opc, cont;
		String acao;
		
		System.out.print("Informe um valor: ");
		valor = in.nextFloat();
		
		do {
			System.out.println("Escolha uma opcao:");
			System.out.println("1 -> Tabuada");
			System.out.println("2 -> Soma");
			System.out.println("3 -> Subtracao");
			System.out.print("> ");
			opc = in.nextInt();
			
			switch (opc) {
				case 1:
					cont = 0;
					
					while (cont <= 10) {
						System.out.println(valor + " x " + cont + " = " + (valor*cont));
						cont++;
					}
				break;
				
				case 2:
					float soma = 0;
					cont = 0;
					
					while (cont <= 35) {
						
						System.out.print(valor + " + " + (cont+1) + " = " + (valor+(cont+1)));
						
						if ((valor+(cont+1)) % 2 == 0) {
							System.out.println(" - PAR");
							
						} else {
							System.out.println(" - IMPAR");
							
						}
						
						soma = soma + (valor+(cont+1));
						cont+=2;
					}
					
					System.out.println("A soma de todos resultados: " + soma);
				break;
				
				case 3:
					
					if (valor >= 55) {
						cont = 0;
						while (cont <= 9) {
							System.out.print(valor + " - " + (cont+1) + " = " + (valor-(cont+1)));
							
							if ((valor+(cont+1)) % 2 == 0) {
								System.out.println(" - PAR");
								
							} else {
								System.out.println(" - IMPAR");
								
							}
							
							cont++;
							
						}
					} else {
						cont = 9;
						while (cont >= 0) {
							System.out.print(valor + " - " + (cont+1) + " = " + (valor-(cont+1)));
							
							if ((valor+(cont+1)) % 2 == 0) {
								System.out.println(" - PAR");
								
							} else {
								System.out.println(" - IMPAR");
								
							}
							
							cont--;
							
						}
						
					}
					
				break;
	
				default:
					System.out.println("Opcao invalida!!!");
					
				break;
			}
			
			System.out.print("Deseja verificar outra operacao? [s/n] ");
			acao = in.next();
		} while (acao.equalsIgnoreCase("s"));

	}

}
